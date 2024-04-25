public class BinarySearchTreeDemo {
    private Node root;

    // add a node to the tree
    public void addNode(int key) {
        Node newNode = new Node(key);   // Create and initialize a new node
        if (root == null)
            root = newNode;             // If there is no root, the new node becomes the root
        else {
            Node currentNode = root;    // Set root as the Node we start with in traversing the tree
            Node parent;                // Declare a parent for the newNode

            while (true) {
                // root is the top parent, so we start there
                parent = currentNode;
                // check if the new Node should go on the left side of the parent Node
                if (key < currentNode.getKey()) {
                    currentNode = currentNode.getLeftChild();   // Make currentNode the left child
                    if (currentNode == null) {                  // if the left has no children...
                        parent.setLeftChild(newNode);           // then add the new Node to the left of it
                        return;                                 // done
                    }
                }
                else {                                          // the new Node will go on the right side
                    currentNode = currentNode.getRightChild();
                    if (currentNode == null) {                  // if the right child has no children
                        parent.setRightChild(newNode);          // add the new Node to the right of it
                        return;                                 // done
                    }
                }
            }
        }
    }

    public void inOrderTraverse(Node currentNode) {
        if (currentNode != null) {
            inOrderTraverse(currentNode.getLeftChild());
            System.out.print(currentNode.getKey() + " ");
            inOrderTraverse(currentNode.getRightChild());
        }
    }

    public void preOrderTraverse(Node currentNode) {
        if (currentNode != null) {
            System.out.print(currentNode.getKey() + " ");
            preOrderTraverse(currentNode.getLeftChild());
            preOrderTraverse(currentNode.getRightChild());
        }
    }

    public void postOrderTraverse(Node currentNode) {
        if (currentNode != null) {
            postOrderTraverse(currentNode.getLeftChild());
            postOrderTraverse(currentNode.getRightChild());
            System.out.print(currentNode.getKey() + " ");
        }
    }

    public String findNode(int key) {
        Node currentNode = root;
        while (currentNode.getKey() != key) {
            if (key < currentNode.getKey())
                currentNode = currentNode.getLeftChild();
            else
                currentNode = currentNode.getRightChild();

            if (currentNode == null)
                return String.format("%d not found", key);
        }
        return String.format("%d was found", currentNode.getKey());
    }

    public Node getRoot() {
        return root;
    }

    public Node getReplacementNode(Node replacedNode) {
        Node replacementParent = replacedNode;
        Node replacement = replacedNode;
        Node currentNode = replacedNode.getRightChild();
        // while there are no more left children
        while (currentNode != null) {
            replacementParent = replacement;
            replacement = currentNode;
            currentNode = currentNode.getLeftChild();
        }
        // if the replacement isn't the right child,
        // move the replacement into the parent's left child slot
        // and move the replaced node's right child into the replacement's right child slot
        if (replacement != replacedNode.getRightChild()) {
            replacementParent.setLeftChild(replacement.getRightChild());
            replacement.setRightChild(replacedNode.getRightChild());
        }
        return replacement;
    }

    public String removeNode(int key) {
        Node currentNode = root;
        Node parent = root;
        boolean isLeftChild = true;

        while (currentNode.getKey() != key) {
            parent = currentNode;
            if (key < currentNode.getKey()) {
                isLeftChild = true;
                currentNode = currentNode.getLeftChild();
            }
            else {
                isLeftChild = false;
                currentNode = currentNode.getRightChild();
            }
            if (currentNode == null) {
                return String.format("%d not found", key);
            }
        }

        if (currentNode.getLeftChild() == null && currentNode.getRightChild() == null) {
            if (currentNode == root)
                root = null;
            else if (isLeftChild)
                parent.setLeftChild(null);
            else
                parent.setRightChild(null);
        }
        else if (currentNode.getRightChild() == null) {
            if (currentNode == root)
                root = currentNode.getLeftChild();
            else if (isLeftChild)
                parent.setLeftChild(currentNode.getLeftChild());
            else
                parent.setRightChild(currentNode.getLeftChild());
        }
        else if (currentNode.getLeftChild() == null) {
            if (currentNode == root)
                root = currentNode.getRightChild();
            else if (isLeftChild)
                parent.setLeftChild(currentNode.getRightChild());
            else
                parent.setRightChild(currentNode.getRightChild());
        }
        else {
            Node replacement = getReplacementNode(currentNode);
            if (currentNode == root)
                root = replacement;
            else if (isLeftChild)
                parent.setLeftChild(replacement);
            else
                parent.setRightChild(replacement);

            replacement.setLeftChild(currentNode.getLeftChild());
        }
        return String.format("%d was removed", key);
    }
}

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XMLDemo {
    public static void main(String[] args) {
        try {
            File xmlFile = new File("people.xml");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            // There are two types of documents
            // What we don't want:   java.swing.text.Document
            // What we do want:    org.w3c.dom.Document
            // Make sure when tabbing to autofill that you pick the right one!
            Document document = builder.parse(xmlFile);

            System.out.println("Root element: " + document.getDocumentElement().getNodeName());
            System.out.println();

            // get all nodes with tag name of "person" and assign to list
            NodeList personList = document.getElementsByTagName("person");
            for (int i = 0; i < personList.getLength(); i++) {
                Node node = personList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    System.out.println("ID: " + element.getAttribute("id"));
                    System.out.println("First Name: " + element
                            .getElementsByTagName("firstname")
                            .item(0)
                            .getTextContent());
                    System.out.println("Last Name: " + element
                            .getElementsByTagName("lastname")
                            .item(0)
                            .getTextContent());
                    System.out.println();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

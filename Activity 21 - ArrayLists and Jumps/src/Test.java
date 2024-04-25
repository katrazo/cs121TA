/**
 * Demonstrates usage of the StringArrayList class.
 * @see StringArrayList
 */
public class Test {
    public static void main(String[] args) {
        StringArrayList myStringList = new StringArrayList();

        myStringList.add("Apple");
        myStringList.add("Banana");
        myStringList.add("Coconut");
        myStringList.add("Date");

        System.out.println("The size of myStringList is: " + myStringList.size());
        System.out.println("The string at index 2 is: " + myStringList.get(2));
        myStringList.display();
        myStringList.remove("Banana");
        myStringList.remove(0);
        myStringList.displayEnhanced();
    }
}
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Steve");
        names.add("Jack");

        // initialize iterator by calling collection's
        // iterator() method
        Iterator<String> iter = names.iterator();

        // hasNext returns a boolean, true or false
        // while it's true that iter has a next element...
        while (iter.hasNext()) {
            // ... the next element value will be assigned to to name variable
            String name = iter.next();
            System.out.println(name);
        }
    }
}

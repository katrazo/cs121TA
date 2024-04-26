import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        int[] intArray = {38, 29, 29, 45, 60, 21, 4, 4, 15};

        for (Integer num : intArray)
            set.add(num);

        System.out.print("Array: ");
        for (Integer element : intArray)
            System.out.printf("%d ", element);

        System.out.printf("%nSet: ");
        for (Integer element : set)
            System.out.printf("%d ", element);

        System.out.printf("%nSize: %d%n", set.size());
        System.out.println("Remove 38:");
        set.remove(38);
        System.out.printf("New Size: %d%n%n", set.size());
        System.out.println("Add 38:");
        set.add(38);
        System.out.printf("38 is in set: %b%n", set.contains(38));
        System.out.println();

        System.out.printf("%nCreate a new sorted tree set%n");
        TreeSet<Integer> sortedSet = new TreeSet<>(set);
        System.out.print("Sorted Set: ");
        for (Integer element : sortedSet)
            System.out.printf("%d ", element);
        System.out.printf("%n%n");

        System.out.printf("First element in sorted list is: %d%n", sortedSet.first());
        System.out.printf("Last element in sorted list is: %d%n", sortedSet.last());
        System.out.printf("Set is empty: %b%n", sortedSet.isEmpty());
        sortedSet.clear();
        System.out.printf("Set is empty: %b%n", sortedSet.isEmpty());
        System.out.printf("Size: %d%n", sortedSet.size());
    }
}

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        GenericArrayList printer = new GenericArrayList();

        ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Double> doubleList = new ArrayList<>(Arrays.asList(1.1, 2.2, 3.3, 4.4, 5.5));
        ArrayList<Character> charList = new ArrayList<>(Arrays.asList('A', 'B', 'C', 'D', 'E'));
        ArrayList<String> stringList = new ArrayList<>(Arrays.asList("Alpha", "Beta", "Gamma", "Delta", "Epsilon"));

        System.out.print("Integer ArrayList: ");
        printer.printArrayList(intList);
        System.out.print("Double ArrayList: ");
        printer.printArrayList(doubleList);
        System.out.print("Character ArrayList: ");
        printer.printArrayList(charList);
        System.out.print("String ArrayList: ");
        printer.printArrayList(stringList);
    }
}

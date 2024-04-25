import java.util.ArrayList;

public class GenericArrayList {
    public <E> void printArrayList(ArrayList<E> arrayList) {
        for (E element : arrayList) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }
}

import java.util.ArrayList;

/**
 * A demo class that contains and manipulates an ArrayList of Strings.
 * Directly follows instructions of Activity 21 on Canvas, linked below:
 * @see <a href="https://bsu.instructure.com/courses/151323/assignments/1764943">Activity 21 for CS121.4 on Canvas</a>
 */
public class StringArrayList {
    private ArrayList<String> arrayList = new ArrayList<>();

    public void add(String str) {
        arrayList.add(str);
    }

    public void remove(String str) {
        arrayList.remove(str);
    }
    public void remove(int index) {
        arrayList.remove(index);
    }

    public int size() {
        return arrayList.size();
    }

    public String get(int index) {
        return arrayList.get(index);
    }

    public void display() {
        System.out.print("List:");
        // for-each
        for (String str : arrayList) {
            System.out.print(" " + str);
        }
        System.out.println();
    }
    public void displayEnhanced() {
        System.out.print("List:");
        // regular for
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(" " + arrayList.get(i));
        }
        System.out.println();
    }
}
import java.util.*;

public class DataStructure {
    private ArrayList<String> studentList = new ArrayList<>();
    private int[] ageList = new int[3];
    private HashMap<String, Double> majorGpaMap = new HashMap<>();
    private LinkedList<String> nationalityList = new LinkedList<>();
    private Stack<String> hometownStack = new Stack<>();
    private Queue<String> homeStateQueue = new LinkedList<>();

    public void addStudent(String student) {
        studentList.add(student);
    }
    public void addAge(int age, int index) {
        ageList[index] = age;
    }
    public void addGpa(String key, double value) {
        majorGpaMap.put(key, value);
    }
    public void addNationality(String nationality) {
        nationalityList.add(nationality);
    }
    public void addHometown(String hometown) {
        hometownStack.push(hometown);
    }
    public void addHomeState(String homeState) {
        homeStateQueue.add(homeState);
    }

    public void removeStudent(String student) {
        studentList.remove(student);
    }
    public void removeStudent(int index) {
        studentList.remove(index);
    }
    public void removeAge(int index) {
        ageList[index] = -1;
        // This will have to do, since arrays cannot "remove" or "add" data; data can simply be manipulated.
    }
    public void removeGpa(String key) {
        majorGpaMap.remove(key);
    }
    public void removeGpa(String key, double value) {
        majorGpaMap.remove(key, value);
    }
    public void removeNationality(String nationality) {
        nationalityList.remove(nationality);
    }
    public void removeNationality(int index) {
        nationalityList.remove(index);
    }
    public void removeHometown(String hometown) {
        hometownStack.remove(hometown);
    }
    public void removeHometown(int index) {
        hometownStack.remove(index);
    }
    public void removeHomeState(String homeState) {
        homeStateQueue.remove(homeState);
    }

    public void printStudentList() {
        System.out.println(studentList);
    }
    public void printAgeList() {
        System.out.print("[ ");
        for (int age : ageList)
            System.out.printf("%d ", age);
        System.out.println("]");
    }
    public void printMajorGpaMap() {
        System.out.println(majorGpaMap);
    }
    public void printNationalityList() {
        System.out.println(nationalityList);
    }
    public void printHometownStack() {
        System.out.println(hometownStack);
    }
    public void printHomeStateQueue() {
        System.out.println(homeStateQueue);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create Instance of DS
        DataStructure ds = new DataStructure();

        // Populate Data Structures
        ds.addStudent("Bobathy");       ds.addStudent("Jimbathy");             ds.addStudent("Williambathy");
        ds.addAge(23, 0);    ds.addAge(37, 1);           ds.addAge(19, 2);
        ds.addGpa("Bobathy", 3.65);     ds.addGpa("Jimbathy", 4.011);          ds.addGpa("Williambathy", 3.20);
        ds.addNationality("Caucasian"); ds.addNationality("Chinese-American"); ds.addNationality("Samoan-American");
        ds.addHometown("Indianapolis"); ds.addHometown("Pittsburgh");          ds.addHometown("Frankfort");
        ds.addHomeState("Indiana");     ds.addHomeState("Pennsylvania");       ds.addHomeState("Kentucky");

        // Print all structures
        System.out.println("\n== Before Removals ==");
        ds.printStudentList();
        ds.printAgeList();
        ds.printMajorGpaMap();
        ds.printNationalityList();
        ds.printHometownStack();
        ds.printHomeStateQueue();

        // Remove from data structures
        ds.removeStudent("Williambathy");     // ds.removeStudent(2);
        ds.removeAge(2);
        ds.removeGpa("Williambathy");    // ds.removeGpa("Williambathy", 3.20)
        ds.removeNationality(2);        // ds.removeNationality("British")
        ds.removeHometown(2);           // ds.removeHometown("Samoan-American")
        ds.removeHomeState("Kentucky");

        // Print them all again
        System.out.println("\n== After Removals ==");
        ds.printStudentList();
        ds.printAgeList();
        ds.printMajorGpaMap();
        ds.printNationalityList();
        ds.printHometownStack();
        ds.printHomeStateQueue();
    }
}

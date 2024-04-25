import java.util.Scanner;

public class DistanceTraveled {
    public static void main(String[] args) {
        Scanner consoleScanner = new Scanner(System.in);
        int speed;
        int time;

        System.out.print("Enter the speed of the vehicle in mph: ");
        speed = Integer.parseInt(consoleScanner.nextLine());
        System.out.print("Enter the number of hours traveling: ");
        time = Integer.parseInt(consoleScanner.nextLine());

        System.out.println();

        System.out.println("Hour\t\tDistance Traveled");
        System.out.println("-----------------------------");
        for (int hour = 1; hour <= time; hour++) {
            int distance = hour * speed;

            System.out.printf(" %d\t\t\t\t\t%d%n", hour, distance);
        }
    }
}
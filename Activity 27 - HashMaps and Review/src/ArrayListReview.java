import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListReview {
    private Scanner consoleScanner = new Scanner(System.in);

    private ArrayList<String> movies = new ArrayList<>();
    private ArrayList<String> genres = new ArrayList<>();
    private ArrayList<Integer> stars = new ArrayList<>();
    private ArrayList<String> ratings = new ArrayList<>();

    public void promptMovies() {
        String input = "";
        int counter = 1;
        while (true) {
            System.out.printf("Enter the title of movie %d or press q to quit: ", counter);
            input = consoleScanner.nextLine();
            if (input.equals("q"))
                break;
            movies.add(input);
            System.out.printf("Enter the genre of movie %d: ", counter);
            genres.add(consoleScanner.nextLine());
            System.out.printf("Enter the # of stars for movie %d (1-5): ", counter);
            stars.add(Integer.parseInt(consoleScanner.nextLine()));
            System.out.println();
        }
        System.out.println();
    }

    public void populateRatings() {
        for (int star : stars) {
            String rate;
            switch (star) {
                case 1 -> rate = "Poor";
                case 2 -> rate = "Below Average";
                case 3 -> rate = "Average";
                case 4 -> rate = "Above Average";
                case 5 -> rate = "Excellent";
                default -> rate = "Not Yet Rated";
            }
            ratings.add(rate);
        }
    }

    public void printTable() {
        System.out.printf("  %-13s |   %-13s |   %-13s |   Rating%n", "Movie", "Genre", "Stars");
        for (int i = 0; i < movies.size(); i++) {
            System.out.printf("%-15s | %-15s |        %-8d | %s%n", movies.get(1), genres.get(i), stars.get(i), ratings.get(i));
        }
    }
}

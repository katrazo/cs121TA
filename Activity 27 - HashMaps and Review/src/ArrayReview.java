import java.util.Scanner;

public class ArrayReview {
    private Scanner consoleScanner = new Scanner(System.in);
    private final int SIZE_OF_ARRAYS = 5;

    private String[] movies = new String[SIZE_OF_ARRAYS];
    private String[] genres = new String[SIZE_OF_ARRAYS];
    private int[] stars = new int[SIZE_OF_ARRAYS];
    private String[] ratings = new String[SIZE_OF_ARRAYS];

    public void promptMovies() {
        for (int i = 0; i < SIZE_OF_ARRAYS; i++) {
            System.out.printf("Enter the title of movie %d: ", i+1);
            movies[i] = consoleScanner.nextLine();
            System.out.printf("Enter the genre of %s: ", movies[i]);
            genres[i] = consoleScanner.nextLine();
            System.out.printf("Enter the # of stars for %s (1-5): ", movies[i]);
            stars[i] = Integer.parseInt(consoleScanner.nextLine());
            System.out.println();
        }
        System.out.println();
    }

    public void populateRatings() {
        for (int i = 0; i < SIZE_OF_ARRAYS; i++) {
            int star = stars[i];
            String rate;
            switch (star) {
                case 1 -> rate = "Poor";
                case 2 -> rate = "Below Average";
                case 3 -> rate = "Average";
                case 4 -> rate = "Above Average";
                case 5 -> rate = "Excellent";
                default -> rate = "Not Yet Rated";
            }
            ratings[i] = rate;
        }
    }

    public void printTable() {
        System.out.printf("  %-13s |   %-13s |   %-13s |   Rating%n", "Movie", "Genre", "Stars");
        for (int i = 0; i < SIZE_OF_ARRAYS; i++) {
            System.out.printf("%-15s | %-15s |        %-8d | %s%n", movies[i], genres[i], stars[i], ratings[i]);
        }
    }
}

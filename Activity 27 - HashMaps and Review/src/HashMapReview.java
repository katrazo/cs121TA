import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapReview {
    Map<String, String> movieMap = new HashMap<>();
    Scanner consoleScanner = new Scanner(System.in);

    public void promptMovies() {
        int counter = 1;
        while (true) {
            System.out.printf("Enter the name of movie #%d or press q to quit: ", counter);
            String movie = consoleScanner.nextLine();
            if (movie.equals("q"))
                break;
            System.out.printf("Enter the rating for the movie %s: ", movie);
            String rating = consoleScanner.nextLine();
            movieMap.put(movie, rating);
            counter++;
        }
    }

    public void printTable() {
        System.out.printf(" %-15s | Rating%n", "Movie");
        movieMap.forEach((movie, rating) -> {
            System.out.printf("%-15s | %s%n", movie, rating);
        });
    }
}

public class ReviewTest {
    public static void main(String[] args) {

        // -=-=- Array Review -=-=-
        ArrayReview arrayReview = new ArrayReview();
        arrayReview.promptMovies();
        arrayReview.populateRatings();
        arrayReview.printTable();

        // -=-=- ArrayList Review -=-=-
        ArrayListReview arrayListReview = new ArrayListReview();
        arrayListReview.promptMovies();
        arrayListReview.populateRatings();
        arrayListReview.printTable();

        // -=-=- HashMap Review -=-=-
        HashMapReview hashMapReview = new HashMapReview();
        hashMapReview.promptMovies();
        hashMapReview.printTable();
    }
}

import java.util.HashMap;

public class Business {
    String name;        // Name of the business
    String products;    // Products that the business sells
    double valuation;   // How much money the business is worth
    double budget;      // The business's current budget, starts as their valuation.

    HashMap<Integer, Proprietor> proprietors = new HashMap<>();
    int proprietorID = 1000;
    HashMap<Integer, Customer> customers = new HashMap<>();
    int customerID = 1000;

    
}

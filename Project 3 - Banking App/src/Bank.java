import java.util.ArrayList;

public class Bank {
    private ArrayList<Customer> customers = new ArrayList<>();

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void removeCustomer(Customer customer) {
        customers.remove(customer);
    }

    public Customer getCustomer(String pin) {
        for (Customer customer : customers) {
            if (pin.equals(customer.getPin()))
                return customer;
        }
        return null;
    }

    public String getAllCustomersInfo() {
        StringBuilder allCustomers = new StringBuilder();
        for (Customer customer : customers) {
            allCustomers.append(customer);
        }
        return allCustomers.toString();
    }

}

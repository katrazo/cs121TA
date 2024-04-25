public class CFTable {
    public static void main(String[] args) {
        System.out.println("Celsius\t\tFahrenheit");
        System.out.println("**********************");

        for (int celsius = 0; celsius <= 20; celsius++) {
            double fahrenheit = ((9.0/5.0) * celsius + 32);

            System.out.printf("\t%d\t\t %.1f%n", celsius, fahrenheit);
        }
    }
}
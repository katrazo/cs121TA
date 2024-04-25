import java.util.Scanner;

public class Menu {
    private Scanner scanner = new Scanner(System.in);
    private Pokedex pokedex = new Pokedex();

    public void displayMenu() {
        int input = 0;
        while (input != 5) {
            System.out.printf("%n%n********* MENU *********%nPlease make a selection:%n" +
                    "1) Add a Pokemon%n" +
                    "2) Remove a Pokemon%n" +
                    "3) Display Pokemon Info%n" +
                    "4) Display All Pokemon Info%n" +
                    "5) Exit%n" +
                    ">> ");
            try {
                input = Integer.parseInt(scanner.nextLine());

                switch (input) {
                    case 1 -> createPokemon();
                    case 2 -> deletePokemon();
                    case 3 -> displayPokemon();
                    case 4 -> displayAllPokemon();
                    case 5 -> System.out.println("Exiting...");
                    default -> System.out.println("Invalid entry. Please try again.");
                }
            } catch (NumberFormatException e) {
                // Thrown when Integer.parseInt() cannot successfully convert a String to an Integer
                System.out.println("That is not a number. Returning to Menu...");
            }
        }
    }

    private void createPokemon() {
        System.out.print("Enter the Pokemon name: ");
        String name = scanner.nextLine();
        System.out.print("Enter the Pokemon hp: ");
        int hp = Integer.parseInt(scanner.nextLine());

        Pokemon newPokemon = new Pokemon(name, hp);

        System.out.printf("Enter moves for %s.%n", name);
        String moveName = ""; int movePower; int moveSpeed;

        while (true) {
            System.out.print("\tEnter a move name or q if finished: ");
            moveName = scanner.nextLine();
            if (moveName.equals("q"))
                break;

            System.out.print("\tEnter move's power: ");
            movePower = Integer.parseInt(scanner.nextLine());

            System.out.print("\tEnter move's speed: ");
            moveSpeed = Integer.parseInt(scanner.nextLine());

            newPokemon.addMove(new Move(moveName, movePower, moveSpeed));
        }
        pokedex.addPokemon(newPokemon);
        System.out.println(newPokemon.getName() + " added to Pokedex.");
    }

    private void deletePokemon() {
        System.out.print("Enter the name of the Pokemon to delete: ");
        String name = scanner.nextLine();
        Pokemon pokemonToRemove = pokedex.getPokemon(name);
        if (pokemonToRemove == null)
            System.out.println("Pokemon not found.");
        else {
            pokedex.removePokemon(pokemonToRemove);
            System.out.println(name + " removed from Pokedex.");
        }
    }

    private void displayPokemon() {
        System.out.print("Enter the name of the Pokemon to display: ");
        String name = scanner.nextLine();
        Pokemon pokemonToDisplay = pokedex.getPokemon(name);
        if (pokemonToDisplay == null)
            System.out.println("Pokemon not found.");
        else
            System.out.println(pokemonToDisplay);
    }

    private void displayAllPokemon() {
        int counter = 1;
        for (Pokemon pokemon : pokedex.getPokemonArrayList()) {
            System.out.println(counter + ". " + pokemon);
            counter++;
        }
    }
}

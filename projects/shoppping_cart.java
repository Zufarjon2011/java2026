import java.util.Scanner;

public class shoppping_cart {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double pizza = 8.99;
        double coke = 2.99;
        double french_fries = 1.99;
        double mineral_water = 0.99;

        double overall = 0;

        System.out.println("Welcome to McJAVA!");

        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();

        System.out.println(name + ", what would you like to order?");

        System.out.println(
                "Pizza: 8.99$\n" +
                        "Coke: 2.99$\n" +
                        "French fries: 1.99$\n" +
                        "Water (still): 0.99$\n"
        );

        System.out.print("Enter your item: ");
        String item = scanner.nextLine();

        if (item.equalsIgnoreCase("pizza")) {

            System.out.print("How many pizzas: ");
            int quantity = scanner.nextInt();

            overall += quantity * pizza;

        } else if (item.equalsIgnoreCase("coke")) {

            System.out.print("How many cokes: ");
            int quantity = scanner.nextInt();

            overall += quantity * coke;

        } else if (item.equalsIgnoreCase("french fries")) {

            System.out.print("How many french fries: ");
            int quantity = scanner.nextInt();

            overall += quantity * french_fries;

        } else if (item.equalsIgnoreCase("water")) {

            System.out.print("How many waters: ");
            int quantity = scanner.nextInt();

            overall += quantity * mineral_water;

        } else {
            System.out.println("Sorry, we don't have that item.");
            scanner.close();
            return;
        }

        System.out.println("Your current total is " + overall + "$");

        System.out.print("Anything else? (true/false): ");
        boolean next = scanner.nextBoolean();

        if (next) {

            scanner.nextLine();

            System.out.print("Tell me what else: ");
            String item2 = scanner.nextLine();

            if (item2.equalsIgnoreCase("pizza")) {

                System.out.print("How many pizzas: ");
                int quantity2 = scanner.nextInt();
                overall += quantity2 * pizza;

            } else if (item2.equalsIgnoreCase("coke")) {

                System.out.print("How many cokes: ");
                int quantity2 = scanner.nextInt();
                overall += quantity2 * coke;

            } else if (item2.equalsIgnoreCase("french fries")) {

                System.out.print("How many french fries: ");
                int quantity2 = scanner.nextInt();
                overall += quantity2 * french_fries;

            } else if (item2.equalsIgnoreCase("water")) {

                System.out.print("How many waters: ");
                int quantity2 = scanner.nextInt();
                overall += quantity2 * mineral_water;

            } else {
                System.out.println("Sorry, we don't have that item.");
            }
        }

        System.out.println("Your final total is " + overall + "$");

        scanner.close();
    }
}
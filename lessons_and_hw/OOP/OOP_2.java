import java.util.Scanner;

public class OOP_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car_OOP2 car = new Car_OOP2();
        String stop;

        do {
            System.out.print("Enter Your Choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1 -> System.out.println(car.make);
                case 2 -> System.out.println(car.year);
                case 3 -> car.license();
                case 4 -> car.sorts();
                default -> System.out.println("INVALID OPTION");
            };
            System.out.print("Want to Continue?(yes/no): ");
            stop = scanner.nextLine().toLowerCase();
        }while (!stop.equals("no"));

        System.out.println("Thank You For Using Our Service!");






    }
}

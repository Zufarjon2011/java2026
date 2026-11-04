import java.util.Scanner;

public class Composition{
    public static void main(String[] args){
        /*
        Used composition and aggregation
        -Array of objects
        -Complex Structure, into easy reading mode
         */
        Scanner scanner = new Scanner(System.in);
        Car_c[] cars = {new Car_c("Porsche", "Cayenne", 2025, "V8 Biturbo", 5.5, 570),
                        new Car_c("Porsche", "Macan", 2026, "V6", 3.3, 390)};

        Garage garage = new Garage(cars);

        garage.show_cars();

        System.out.print("Pick a car: ");
        int user_choice = scanner.nextInt();
        scanner.nextLine();

        if(user_choice > cars.length || user_choice <= 0){
            System.out.println("You Have Only " + garage.cars_num + " Cars!");
        }
        else{
            cars[user_choice - 1].start();
        }


    }
}

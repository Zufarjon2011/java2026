import java.util.ArrayList;
import java.util.Scanner;

public class cinema_seat_booking {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){

        int quantity;
        int column = 0;
        int row = 0;

        ArrayList<String> history = new ArrayList<>();

        String[][] seats = {{"0", "0", "0", "0", "0"},
                            {"0", "0", "0", "0", "0"},
                            {"0", "0", "0", "0", "0"},
                            {"0", "0", "0", "0", "0"},
                            {"0", "0", "0", "0", "0"},};


        System.out.println("**************************");
        System.out.println("WELCOME TO THE ENZO CINEMA");
        System.out.println("**************************\n");

        seats_status(seats);


        System.out.print("How many tickets you want to buy: ");
        quantity = scanner.nextInt();

        for(int i = 0; i < quantity; i++){

            System.out.print("Enter Row Number: ");
            row = scanner.nextInt();

            System.out.print("Enter Column Number: ");
            column = scanner.nextInt();


            if (seats[row - 1][column - 1].equals("X")) {
                System.out.println("Sorry, this seat is already booked!");
                seats_status(seats);
            } else {

                // -1 on each because programming languages start counting by 0
                seats[row - 1][column - 1] = "X";
                history.add("Row: " + row);
                history.add("Column: " + column);
                seats_status(seats);
            }


            
        }

        System.out.println("**********************************");
        System.out.println("recent booking history: " + history);
        System.out.println("**********************************");


    }

    //method to display seats
    static void seats_status(String[][] seats){

        for(String[] seat : seats){
            for(String each : seat){
                System.out.print(each + " ");
            }
            System.out.println();
        }

    }
}

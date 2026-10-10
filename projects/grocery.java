import java.util.Scanner;
import java.util.ArrayList;

public class grocery {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Arraylist declaring
        ArrayList<String> cart = new ArrayList<>();

        System.out.print("How many elements to add: ");
        int quantity = scanner.nextInt();
        scanner.nextLine();

        //loop for adding much items as user wants
        for (int i = 0; i < quantity; i++){

            System.out.print("Enter element to add: ");
            String item = scanner.nextLine();

            cart.add(item);

        }


        System.out.print("\nLIST OF ITEMS\n");

        //enhanced loop for better performance
        for(String items : cart){
            System.out.println(items);
            scanner.close();

        }
    }
}




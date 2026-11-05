import java.util.ArrayList;
import java.util.Scanner;

public class OOP17_arraylists {
    public static void main(String[] args){
        /*
        Arraylist - resizable array that stores objects (autoboxing)
                    arrays are fixed in size, but Arraylist can change
         */

        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter # of foods you would like: ");
        int numOfFoods = scanner.nextInt();
        scanner.nextLine();

        for(int i = 1; i <= numOfFoods; i++){
            System.out.print("Enter name #" + i + ": ");
            String food = scanner.nextLine();

            list.add(food);
        }

        System.out.println(list);
    }
}

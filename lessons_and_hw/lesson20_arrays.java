import java.util.Arrays;
import java.util.Scanner;

public class lesson20_arrays {
    public static void main(String[] args){

        /*
        Array is just a variable that can include more than 1 element or just a list in python ^_____^
         */


        Scanner scanner = new Scanner(System.in);
        String[] fruits = {"apple", "coconut", "pineapple", "banana"};

        for(int i = 0; i < fruits.length; i++){
            System.out.print(fruits[i] + " \n");
        }

        //enhanced for
        for(String fruit : fruits){
            System.out.println(fruit);
        }

        Arrays.sort(fruits);
        Arrays.fill(fruits, "PEAR");

        for(String fruit: fruits){
            System.out.println(fruit);
        }



        /*
        to create an empty array
        String[] array_name = new String[size_in_int]
         */

        String[] foods;


        System.out.print("Enter # of list param: ");
        int size = scanner.nextInt();
        scanner.nextLine();

        foods = new String[size];

        for(int i = 0; i < foods.length; i++){
            System.out.print("ENTER AN ITEM NAME: ");
            foods[i] = scanner.nextLine();
        }

        for(String food: foods){
            System.out.println(food);
        }

        scanner.close();
    }
}

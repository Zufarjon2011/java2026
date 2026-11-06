import java.util.InputMismatchException;
import java.util.Scanner;

public class OOP18_exceptionhandling {
    public static void main(String[] args){
        /*
        Exception = An event that interrupts the normal flow of a program
                    (Dividing by zero, file not found, mismatch input type)
                    Surround any dangerous code with a try{} block
                    try{}, catch{}, finally{}
         */

        Scanner scanner = new Scanner(System.in);


        try{
            System.out.print("Enter any number: ");
            int number = scanner.nextInt();
        }
        catch (Exception e){
            System.out.println("Something went wrong!");
        }
        finally {
            scanner.close();
            System.out.println("This always executes!");
        }
    }
}

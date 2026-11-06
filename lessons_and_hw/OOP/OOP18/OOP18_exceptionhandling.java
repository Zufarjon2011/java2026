import java.util.InputMismatchException;
import java.util.Scanner;

public class OOP18_exceptionhandling {
    public static void main(String[] args){

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

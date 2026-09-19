import java.util.Random;
import java.util.Scanner;

public class lesson6_random {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String name;
        int age;
        int random_number;

        System.out.println("Hello, welcome to the landing page! \n");

        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        System.out.print(name + " glad to see you here!, enter your age: ");
        age = scanner.nextInt();

        random_number = random.nextInt(1, 9999);
        System.out.println("\nYour id code is: " + name.charAt(0) + random_number);




        scanner.close();
    }
}
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class javatests {
    public static void main(String[] args) {
        //::Landing page::
        Scanner input = new Scanner(System.in);

        System.out.println("Aestro LOGISTICS");
        System.out.println("Welcome to the landing page of the Aestro Logistics");

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        //::query page::
        System.out.print("Hello " + name + " , enter your age: ");
        int age = input.nextInt();

        System.out.print("Do you have any certificates?(type true/false): ");
        boolean certificates = input.nextBoolean();
        input.nextLine();

        String wcerf = "None";

        if (certificates) {
            System.out.print("Please enter from what: ");
            wcerf = input.nextLine();

            //::final stage::
//            System.out.println("Name: " + name + "\n" +
//                    "age: " + age + "\n" +
//                    "certificates: " + wcerf);
        } else {
            System.out.println("We will see you in the interview as soon as possible!");

//            System.out.println("Name: " + name + "\n" +
//                    "age: " + age + "\n" +
//                    "certificates: false");
        }

        System.out.print("Please enter your phone number for contacting!: ");
        int number = input.nextInt();

        try {
            FileWriter writer = new FileWriter("applicants.txt", true);

            writer.write("Name: " + name + "\n");
            writer.write("Age: " + age + "\n");
            writer.write("Has certificate: " + certificates + "\n");
            writer.write("Certificate: " + wcerf + "\n");
            writer.write("Contact Number: " + number + "\n");
            writer.write("-------------------------\n");

            writer.close();

            System.out.println("Information saved successfully!");

        } catch (IOException e) {
            System.out.println("Something went wrong while saving the file.");
        }

        input.close();
    }
}

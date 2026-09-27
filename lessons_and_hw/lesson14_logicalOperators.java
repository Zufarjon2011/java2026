import java.util.Scanner;

public class lesson14_logicalOperators {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // && = and
        // || = or
        // ! = not


        String name;

        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        if(name.length() < 4 || name.length() > 12){
            System.out.println("Name should be in a range of 4 to 12 characters!");
        }

        else if(name.contains(" ") || name.contains("@")){
            System.out.println("Names cannot contain spaces or symbols!");
        }
        else {
            System.out.println("Hello " + name);
        }

        scanner.close();
    }
}

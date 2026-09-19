import java.util.Scanner;

public class lesson5_if {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        String name;
        int age;
        boolean isStudent;

        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        System.out.print("Are you a student?(true/false): ");
        isStudent = scanner.nextBoolean();

        System.out.println("\n");

        //GROUP 2(CLASSIFICATION)
        if(age >= 65){
            System.out.println("You are a senior👴");
        }
        else if (age >= 18) {
            System.out.println("you are an adult🧑");
        }
        else if (age < 0) {
            System.out.println("you havent been born yet👼");
        }
        else if (age == 0){
            System.out.println("you are a baby👶");
        }
        else {
            System.out.println("You are a child🧒");
        }


        //GROUP 3(IDENTIFICATION)
        if(name.isEmpty()){
            System.out.println("you didn't enter your name!😡");
        }
        else {
            System.out.println("Hello " + name + "!😀");
        }

        if (isStudent){
            System.out.print("You are a student!🏫");
        }
        else {
            System.out.println("You are not a student🏢");
        }
        
        
        
        scanner.close();
    }
}

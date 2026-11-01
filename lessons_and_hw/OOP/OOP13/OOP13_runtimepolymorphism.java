import java.util.Scanner;

public class OOP13_runtimepolymorphism {
    public static void main(String[] args){

        /*
        Runtime polymorphism - When a method that gets executed is decided
                               at runtime based on the actual type of the object.
         */
        
        Scanner scanner = new Scanner(System.in);
        Animal animal;

        System.out.print("1-cat, 2-dog: ");
        int choice = scanner.nextInt();

        if(choice == 1){
            animal = new Cat_13();
            animal.speak();
        }
        else if(choice == 2){
            animal = new Dog_13();
            animal.speak();
        }

    }
}

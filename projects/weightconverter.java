import java.util.Scanner;

public class weightconverter {
    public static void main(String [] args){
        Scanner scanner  = new Scanner(System.in);

        //variables
        double weight;
        double newWeight;
        int choice;

        //welcome message

        System.out.println("Welcome to the Weight converter⚖️");
        System.out.println("1: convert lbs into kgs\n" +
                "2: convert kgs into lbs");
        System.out.print("Choose an option: ");
        choice = scanner.nextInt();

        if(choice == 1){
            System.out.print("Enter in lbs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("The new weight is: %.2f", newWeight);

        }
        else if(choice == 2){
            System.out.print("Enter in kgs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("The new weight is: %.2f", newWeight);

        }
        else{
            System.out.printf("The is no option %d", choice);
        }

        scanner.close();
    }
}

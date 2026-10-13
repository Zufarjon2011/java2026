import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class budget_tracker {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        String wannaend = "yes";

        double starting_amount;
        double blance;
        double expens;
        String expens_name;

        ArrayList<String> description = new ArrayList<>();
        ArrayList<Double> expense = new ArrayList<>();


        System.out.println("WELCOME TO PERSONAL BUDGET TRACKER");
        System.out.print("Enter starting amount: ");
        starting_amount = scanner.nextDouble();

        blance = starting_amount;

        do{
            blance += starting_amount;

            System.out.print("add expense name: ");
            expens_name = scanner.nextLine();

            scanner.nextLine();
            System.out.print("add expense value: ");
            expens = scanner.nextDouble();
            scanner.nextLine();


            blance -= expens;
            expense.add(expens);
            description.add(expens_name);

            System.out.print("Continue?(yes/no/history): ");
            wannaend = scanner.nextLine().toLowerCase();



            if(wannaend.equals("history")){
                for(int i = 0; i < expense.size(); i++){
                    System.out.println("EXPENSE " + (i+1) + " : " + expense.get(i));
                    for(int k = 0; k < description.size(); k++){
                        System.out.println("EXPENSE NAME" + (i+1) + " : " + description.get(k));
                    }
                }


            }


            if(blance <= 0){
                System.out.println("Your balance is in 0");
            }

            try{
                FileWriter file = new FileWriter("expense.txt", true);
                file.write("Balance: " + starting_amount + "\n" +
                        "Expenses: " + expense);

                file.close();
            }catch (IOException e) {
                System.out.println("❌ Could not save database.");
                e.printStackTrace();
            }
        }while (wannaend.equals("yes"));


        scanner.close();
    }

}

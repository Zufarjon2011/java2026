import java.util.Scanner;

public class simple_banking_program {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        //variables
        boolean isRunning = true;
        double balance = 0;
        int choice;


        //program root
        while (isRunning) {
            //welcome messages
            System.out.println("********************");
            System.out.println("🏦BANKING PROGRAM🏦");
            System.out.println("********************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit Program");

            System.out.print("Choose an option(1-4): ");
            choice = scanner.nextInt();
            //switch
            switch (choice) {
                case 1 -> showbalance(balance);
                case 2 -> balance += deposit(balance);
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("\n⚠️INVALID OPTION⚠️\n");
            }
        }
        System.out.println("GOODBYE!👋");

        scanner.close();

    }

    static void showbalance(double balance){
        System.out.printf("$%,.2f\n", balance);
    }
    static double deposit(double amount){
        System.out.print("Enter amount to deposit: ");
        amount = scanner.nextDouble();

        if(amount < 0){
            System.out.println("\n⚠️Can not Deposit Negative Amount!⚠️\n");
            return 0;
        }
        else {
            System.out.printf("\n💵DEPOSITED $%,.2f💵\n", amount);
            return amount;
        }
    }
    static double withdraw(double balance){
        double amount;

        System.out.print("Enter amount to Withdraw: ");
        amount = scanner.nextDouble();

        if(amount > balance){
            System.out.println("\n⚠️INSUFFICIENT FUNDS!️️⚠️\n");
            return 0;
        }
        else if(amount < 0){
            System.out.println("\n⚠️Can Not Withdraw Negative Number!⚠️\n");
            return 0;
        }
        else {
            System.out.printf("\n💸You have Withdrawn $%,.2f💸\n", amount);
            return amount;
        }
    }
}

import java.util.Scanner;
import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;

public class contract_specification_management_sys {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        // Registration
        String name;
        int password;
        int cpass;

        // Banking
        double balance = 0;
        double deposit;
        double withdraw;

        // Intention
        String intention;

        System.out.println("\n🏦 WELCOME TO THE BANK OF OMONAT 🏦\n");

        System.out.print("To become our client, enter your name: ");
        name = input.nextLine();

        System.out.printf("%s, your bank account is being ready!\n", name);

        password = random.nextInt(1, 9999);

        System.out.println("********************************************************");
        System.out.println("Your password is " + password);

        System.out.printf("Your balance is $%,.2f\n", balance);

        System.out.println("********************************************************");
        System.out.println("1. balance = checking your balance");
        System.out.println("2. deposit = depositing money");
        System.out.println("3. withdraw = withdrawing money");
        System.out.println("4. compounding = compound calculation");
        System.out.println("5. exit = exiting program");
        System.out.println("********************************************************");

        while (true) {

            System.out.print("\nWHAT WOULD YOU LIKE TO DO: ");
            intention = input.nextLine();

            // DEPOSIT
            if (intention.equalsIgnoreCase("deposit")) {

                System.out.print("Enter amount of money to deposit: ");
                deposit = input.nextDouble();
                input.nextLine(); // consume Enter

                if (deposit <= 0) {
                    System.out.println("⚠️ Amount must be greater than 0.");
                } else {
                    balance += deposit;
                    System.out.printf("🪙 You deposited $%,.2f!\n", deposit);
                }
            }

            // BALANCE
            else if (intention.equalsIgnoreCase("balance")) {

                System.out.print("Enter password first: ");
                cpass = input.nextInt();
                input.nextLine(); // consume Enter

                if (cpass == password) {
                    System.out.printf(
                            "🪙 %s, you have $%,.2f in your balance.\n",
                            name, balance
                    );
                } else {
                    System.out.println("⚠️ WRONG PASSWORD");
                }
            }

            // WITHDRAW
            else if (intention.equalsIgnoreCase("withdraw")) {

                System.out.print("Enter password first: ");
                cpass = input.nextInt();
                input.nextLine(); // consume Enter

                if (cpass == password) {

                    System.out.printf(
                            "🪙 How much money do you want to withdraw from $%,.2f: ",
                            balance
                    );

                    withdraw = input.nextDouble();
                    input.nextLine(); // consume Enter

                    if (withdraw > balance) {
                        System.out.println("⚠️ Insufficient funds");
                    }
                    else if (withdraw <= 0) {
                        System.out.println("⚠️ Amount must be greater than 0.");
                    }
                    else {
                        balance -= withdraw;

                        System.out.printf(
                                "🪙 You withdrew $%,.2f\n",
                                withdraw
                        );
                    }

                } else {
                    System.out.println("⚠️ WRONG PASSWORD");
                }
            }

            // EXIT
            else if (intention.equalsIgnoreCase("exit")) {

                System.out.println("❌ EXITING PROGRAM ❌");

                // SAVE DATA BEFORE EXITING
                try {
                    FileWriter file = new FileWriter("database.txt", true);

                    file.write("CLIENT NAME: " + name + "\n");
                    file.write("PASSWORD: " + password + "\n");
                    file.write("BALANCE: $" + balance + "\n");
                    file.write("-----------------------------\n");

                    file.close();

                    System.out.println("✅ Account data saved.");

                } catch (IOException e) {
                    System.out.println("❌ Could not save database.");
                    e.printStackTrace();
                }

                break;
            }

            else {
                System.out.println("⚠️ Unknown command.");
            }
        }

        input.close();
    }
}
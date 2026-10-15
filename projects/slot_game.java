import java.lang.annotation.Target;
import java.util.Random;
import java.util.Scanner;

public class slot_game {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int balance = 100;
        int bet;
        int payout;

        String[] row;
        String playagain;

        System.out.println("*********************");
        System.out.println("WELCOME TO JAVA SLOTS");
        System.out.println("Symbols: 🍋🍒⭐🍉🔔");
        System.out.println("*********************");

        while (balance > 0){
            System.out.println("Current balance: $" + balance);
            System.out.print("Enter bet amount: ");
            bet = scanner.nextInt();
            scanner.nextLine();

            //bet
            if(bet <= 0){
                System.out.println("BET MUST BE GREATER THAN ZERO");
                continue;
            }
            else {
                balance -= bet;
            }
            System.out.println("Spinning...");
            row = spinrow();
            printrow(row);
            payout = payout(row, bet);

            //payout system check
            if(payout > 0){
                System.out.println("You won $" + payout);
                balance += payout;
            }
            else {
                System.out.println("You lost");
            }
            System.out.print("Do you Want to play again(Y/N): ");
            playagain = scanner.next().toUpperCase();

            //asking for playing again
            if(!playagain.equals("Y")){
                System.out.println("Thank You For Visiting, Your balance is $" + balance);
                break;
            }
            else {
                continue;
            }

        }

    }
    static String[] spinrow(){

        String[] symbols = {"🍋", "🍒", "⭐", "🍉", "🔔"};
        String[] row = new String[3];
        Random random = new Random();

        for(int i = 0; i < 3; i++){
            row[i] = symbols[random.nextInt(symbols.length)];
        }

        return row;
    }
    static void printrow(String[] row){
        System.out.println("**************");
        System.out.println(" " + String.join(" | ", row));
        System.out.println("**************");
    }
    static int payout(String[] row, int bet){
        if(row[0].equals(row[1]) && row[1].equals(row[2])){
            System.out.println("--////🎉\\\\--");
            System.out.println("   MEGA WIN!  ");
            System.out.println("--////🎉\\\\--");
            return switch (row[1]){
                case "🍒" -> bet * 10;
                case "🍋" -> bet * 10;
                case "🍉" -> bet * 10;
                case "⭐" -> bet * 10;
                case "🔔" -> bet * 20;
                default -> 0;
            };
        }
        else if(row[1].equals(row[2])){
            return switch (row[1]){
                case "🍒" -> bet * 2;
                case "🍋" -> bet * 3;
                case "🍉" -> bet * 4;
                case "⭐" -> bet * 5;
                case "🔔" -> bet * 10;
                default -> 0;
            };
        }
        else if(row[0].equals(row[1])){
            return switch (row[0]){
                case "🍒" -> bet * 2;
                case "🍋" -> bet * 3;
                case "🍉" -> bet * 4;
                case "⭐" -> bet * 5;
                case "🔔" -> bet * 10;
                default -> 0;
            };
        }

        return 0;
    }


}

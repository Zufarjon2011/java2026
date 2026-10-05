import java.util.Random;
import java.util.Scanner;

public class dice_rolling_game {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //Variables
        int numOfDice;
        int total = 0;

        System.out.print("Enter number of dice to roll: ");
        numOfDice = scanner.nextInt();

        if(numOfDice <= 0){
            System.out.println("Can not roll less than 1 buddy!");
        }
        else {
            for (int i = 0; i < numOfDice; i++){
                int roll = random.nextInt(1, 7);
                System.out.println("You Rolled " + roll);
                printdie(roll);
                total += roll;

            }
            System.out.println("Total is " + total);
        }

        scanner.close();
    }
    static void printdie(int roll){
        String die1 = """
                 -------
                |       |
                |   ●   |
                |       |
                 -------
                """;
        String die2 = """
                 -------
                | ●     |
                |       |
                |     ● |
                 -------
                """;
        String die3 = """
                 -------
                | ●     |
                |   ●   |
                |     ● |
                 -------
                """;
        String die4 = """
                 -------
                | ●   ● |
                |       |
                | ●   ● |
                 -------
                """;
        String die5 = """
                 -------
                | ●   ● |
                |   ●   |
                | ●   ● |
                 -------
                """;
        String die6 = """
                 -------
                | ●   ● |
                | ●   ● |
                | ●   ● |
                 -------
                """;

        switch (roll){
            case 1 -> System.out.print(die1);
            case 2 -> System.out.print(die2);
            case 3 -> System.out.print(die3);
            case 4 -> System.out.print(die4);
            case 5 -> System.out.print(die5);
            case 6 -> System.out.print(die6);
            default -> System.out.println("WATTAFACK HOW DID YOU GOT THIS MESSAGE DUUUDE!");
        }
    }
}

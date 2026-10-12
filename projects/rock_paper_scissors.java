import java.util.Random;
import java.util.Scanner;

public class rock_paper_scissors {
    public static void main(String[] args){

        /*
        Rock, paper, scissors game. Game continues until user
        types in no. Score added.
         */

        //declare variables

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String userChoice;
        String[] options = {"rock", "paper", "scissors"};
        String computerChoice;
        String playagain = "yes";

        int score = 0;
        int pcscore = 0;

        do{
            System.out.print("🫅Enter Your Pick: ");
            userChoice = scanner.nextLine().toLowerCase();

            computerChoice = options[random.nextInt(3)];
            System.out.println("💻Computer pick: " + computerChoice);

            //tie
            if (userChoice.equals(computerChoice)){
                System.out.println("🪢Tie!");
            }
            //user wins
            else if(userChoice.equals("rock") && computerChoice.equals("scissors") ||
                    userChoice.equals("scissors") && computerChoice.equals("paper") ||
                    userChoice.equals("paper") && computerChoice.equals("rock")){

                System.out.println("🏆You win!🏆");
                score++;
            }
            //pc wins
            else {
                System.out.println("😔You lose!😔");
                pcscore++;
            }
            System.out.print("Do you want to play again: ");
            playagain = scanner.nextLine().toLowerCase();

        }while (playagain.equals("yes"));

        //total score
        System.out.println("\nTOTAL SCORE\n🫅You: " + score + "\n💻PC: " + pcscore);
    }

}

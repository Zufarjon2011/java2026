import java.util.Scanner;
import java.util.Random;

public class luckydicegame {
    public static void main(String[] args){

        Random random = new Random();
        Scanner input = new Scanner(System.in);

        //variables
        String name;
        String game_start;
        int dice1;
        int dice2;

        int random_number_for_player;
        int random_number_for_pc;

        random_number_for_player = random.nextInt(1, 7);
        random_number_for_pc = random.nextInt(1, 7);

        //welcome page
        System.out.println("welcome to game 'Lucy dice🎲' ");

        System.out.print("Enter your name: ");
        name = input.nextLine();

        System.out.print("press ENTER to start a game: ");
        game_start = input.nextLine();

        //game logic
        if(game_start.isEmpty()) {
            System.out.println("start a game by tossing a dice!: \n");
            dice1 = random_number_for_player;

            System.out.println("you tossed a " + dice1 + "!🙆, now my turn\n");
            dice2 = random_number_for_pc;

            if(dice1 > dice2){
                System.out.println("\n🏆You win🏆\n");
            }
            else if(dice1 < dice2){
                System.out.println("\n🖥️Computer wins🖥️\n");
            }
            else{
                System.out.println("\n🀄draw🀄\n");
            }

            //result
            System.out.println("TOTAL\n" +
                    "🧑" + name + ": " + dice1 + "\n" +
                    "🖥️COMPUTER: " + dice2);


        }
        else{
            System.out.println("restart to start a game");
        }

        input.close();
    }
}

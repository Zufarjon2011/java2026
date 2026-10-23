import java.util.Random;
import java.util.Scanner;

public class wordle {
    public static void main(String [] args){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        String[] words = {"eggplant", "plane", "car"};
        boolean isTrue = false;

        String random_word = words[random.nextInt(3)];

        System.out.println("The Word Begins With " + random_word.charAt(0));
        System.out.print("Enter your Guess: ");
        String str = scanner.nextLine().toLowerCase();


        do {
            for (int i = 0; i < random_word.length(); i++) {

                if (str.charAt(i) == random_word.charAt(i)) {
                    System.out.println("CORRECT AT INDEX: " + i);
                    isTrue = false;
                }
//                else if (str.length() > random_word.length() || str.length() < random_word.length()) {
//                    System.out.println("WORD IS " + random_word.length() + " LONG!");
//                }
                else if (str.equals(random_word)) {
                    isTrue = true;
                }
            }

            if (str.equals(random_word)) {
                isTrue = false;
            } else {
                isTrue = true;
                // Get the user's next guess here
            }

        } while (isTrue);

    }
}

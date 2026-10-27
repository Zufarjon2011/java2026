import java.util.Scanner;

public class Main{
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){

        String[] words_de = {"die Familie", "die Mutter", "der Vater", "die Eltern", "der Bruder", "die Schwester"};
        String[] words_en = {"family", "mother", "father", "parents", "brother", "sister"};
        int score = 0;

        for(int i = 0; i < words_de.length; i++){
            System.out.print(words_de[i] + " in english -> ");
            String user = scanner.nextLine().toLowerCase();

            if(user.equals(words_en[i])){
                System.out.println("🎉!CORRECT!🎉");
                score++;
            }
            else {
                System.out.println("WRONG! " + words_en[i]);
            }
        }

        //just wanted to use ternary operator
        String score_out = (score == words_de.length) ?  "🎉YOU ANSWERED ALL!🎉" : "🪷NEXT TIME!🪷";
        System.out.println(score_out);
        System.out.println("Your Final Score " + score + "/" + words_de.length);



    }
}
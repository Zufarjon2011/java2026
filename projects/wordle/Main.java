import java.util.Scanner;

public class Main{
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){

        int option;

        do {
            System.out.println("Choose an option");
            System.out.println("1 - Play, 2 - Add new Word, 3 - practice new words, 4 - quit");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 1 -> logic();
                case 2 -> add();
                case 3 -> practice_new();
                case 4 -> System.out.println("GOODBYE!");
                default -> System.out.println("INVALID OPTION");
            }

        }while (!(option == 4));


    }

    static void logic(){

        int score = 0;

        for(int i = 0; i < words.words_de.length; i++){
            System.out.print(words.words_de[i] + " in english -> ");
            String user = scanner.nextLine().toLowerCase();

            if(user.equals(words.words_en[i])){
                System.out.println("🎉!CORRECT!🎉");
                score++;
            }
            else {
                System.out.println("WRONG! " + words.words_en[i]);
            }
        }

        //just wanted to use ternary operator
        String score_out = (score == words.words_de.length) ?  "🎉YOU ANSWERED ALL!🎉" : "🪷NEXT TIME!🪷";
        System.out.println(score_out);
        System.out.println("Your Final Score " + score + "/" + words.words_de.length);
    }
    static void add(){
        System.out.print("Enter word in german: ");
        String word_deu = scanner.nextLine();

        System.out.print("Enter word translation english: ");
        String words_eng = scanner.nextLine();

        words.new_words_de.add(word_deu);
        words.new_words_en.add(words_eng);

        System.out.println(word_deu + " word added to list!");
    }

    static void practice_new(){

        int score = 0;

        for(int i = 0; i < words.new_words_en.size(); i++){
            System.out.print(words.new_words_de.get(i) + " in english -> ");
            String user = scanner.nextLine().toLowerCase();

            if(user.equals(words.new_words_en.get(i))){
                System.out.println("🎉!CORRECT!🎉");
                score++;
            }
            else {
                System.out.println("WRONG! " + words.words_en[i]);
            }

            String score_out = (score == words.new_words_de.size()) ?  "🎉YOU ANSWERED ALL!🎉" : "🪷NEXT TIME!🪷";
            System.out.println(score_out);
            System.out.println("Your Final Score " + score + "/" + words.new_words_de.size());
        }
    }
}


import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args){

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> words = new ArrayList<>();
        ArrayList<String> words_d = new ArrayList<>();


        String filepath = "D:\\Zufar's stuff\\java\\java2026\\src\\words.txt";
        String filepath2 = "D:\\Zufar's stuff\\java\\java2026\\src\\words_d.txt";


        try (BufferedReader reader = new BufferedReader(new FileReader(filepath))){
            String line;
            while ((line = reader.readLine()) != null){
                words.add(line.trim());
            }

        }catch (Exception e){
            System.out.println("Error");
        }
        try(BufferedReader reader = new BufferedReader(new FileReader(filepath2))){
          String line;
          while ((line = reader.readLine()) != null){
              words_d.add(line.trim());
          }
        } catch (Exception e){
            System.out.println("Error");
        }

        int randoming = random.nextInt(words.size());

        String word = words.get(randoming);
        String word_D = words_d.get(randoming);


        ArrayList<Character> wordState = new ArrayList<>();
        int wrongGuesses = 0;


        for(int i = 0; i < word.length(); i++){
            wordState.add('_');
        }

        System.out.println("************************");
        System.out.println("Welcome to Java Hangman!");
        System.out.println("************************");

        while (wrongGuesses < 6){


            System.out.print("word: ");
            System.out.println("HINT: " + word_D);

            for(char c: wordState){
                System.out.print(c + " ");
            }
            System.out.println();


            System.out.print("You Guess: ");
            char guess = scanner.next().toLowerCase().toString().charAt(0);

            if(word.indexOf(guess) >= 0){
                System.out.println("Correct guess");

                System.out.println(getHangman(wrongGuesses));

                for(int i = 0; i < word.length(); i++){
                    if(word.charAt(i) == guess){
                        wordState.set(i, guess);
                    }
                }
                if(!wordState.contains('_')){
                    System.out.println(getHangman(wrongGuesses));
                    System.out.println("You win!");
                    System.out.println("The word was: " + word);
                    break;
                }
            }
            else {
                wrongGuesses++;
                System.out.println(getHangman(wrongGuesses));
                System.out.println("Wrong");
            }

        }

        if(wrongGuesses >= 6){
            System.out.println(getHangman(wrongGuesses));
            System.out.println("Game over");
            System.out.println("Word was: " + word);
        }


        scanner.close();

    }
    static String getHangman(int wrongGuesses){
        return switch (wrongGuesses){
            case 0 -> """
                      """;
            case 1 -> """
                       o
                      
                      
                      """;
            case 2 -> """
                       o
                       |
                      
                      """;
            case 3 -> """
                       o
                      /|
                      
                      """;
            case 4 -> """
                       o
                      /|\\
                      
                      """;
            case 5 -> """
                       o
                      /|\\
                      /
                      """;
            case 6 -> """
                       o
                      /|\\
                      /\\
                      """;
            default -> "";
        };
    }
}

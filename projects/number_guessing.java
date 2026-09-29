import java.util.Random;
import java.util.Scanner;

public class number_guessing {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int guess;
        int attemps = 3;
        int num = random.nextInt(1, 11);

        System.out.println("WELCOME TO THE NUMBER GUESSING!");
        System.out.println("Guess the number between 1-10, first guess is not counted!  ");
        System.out.println(num);

        do{
            System.out.print("enter your guess: ");
            guess = scanner.nextInt();

            if(attemps == 0){
                System.out.println("YOU LOST, THE NUMBER WAS " + num);
                break;
            }

            if(guess < num){
                System.out.println("TOO LOW!");
                attemps--;
            }
            else if(guess > num){
                System.out.println("TOO HIGH!");
                attemps--;
            }
            else{
                System.out.println("YOU WON!");
                System.out.println("NUMBER OF ATTEMPTS: " + attemps);
            }



        }while (guess != num);

    }
}

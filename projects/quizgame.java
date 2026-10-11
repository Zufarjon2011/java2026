import java.util.Scanner;

public class quizgame {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        /*
        this game will ask user to insert a guess, if a guess is correct
        score will be added one correct guess. This game will include itself
        a list of questions, list of matrix options and correct answers.

        Welcome Message✅
        Questions array[]✅
        Options Array[][]✅
           Loop✅
           questions loop✅
           options loop✅
           check if correct✅
           score addition✅
         */

        int score = 0;
        int guess;

        //welcome message
        System.out.println("*************************");
        System.out.println("WELCOME TO JAVA QUIZ GAME");
        System.out.println("*************************");

        //questions array
        String[] questions = {"Which planet is known as the Red Planet?",
                              "What is the largest ocean on Earth?",
                              "How many sides does a hexagon have?",
                              "Which animal is the fastest on land?",
                              "What is the capital of Australia?"};

        //options array
        String[][] options = {{"1. Venus", "2. Mars", "3. Jupiter", "4. Mercury"},
                              {"1. Atlantic Ocean", "2. Indian Ocean", "3. Arctic Ocean", "4. Pacific Ocean"},
                              {"1. 5", "2. 6", "3. 7", "4. 8"},
                              {"1. Lion", "2. Horse", "3. Cheetah", "4. Leopard"},
                              {"1. Sydney", "2. Melbourne", "3. Canberra", "4. Perth"}};

        //Correct answers array
        char[] answers = {2, 4, 2, 3, 3};

        //loop for each question display
        for(int i = 0; i < questions.length; i++){
            System.out.println(questions[i]);
            //displaying each option
            for(String option : options[i]){
                System.out.println(option);
            }
            System.out.print("Enter Your Answer: ");
            guess = scanner.nextInt();
            if(guess == answers[i]){
                System.out.println("********");
                System.out.println("Correct!");
                System.out.println("********");
                score++;
            }
            else {
                System.out.println("******");
                System.out.println("Wrong!");
                System.out.println("******");
            }
        }

        //total score calculation
        System.out.println("\nTOTAL SCORE\n");
        System.out.println(score + " out of " + questions.length);
        scanner.close();
    }
}

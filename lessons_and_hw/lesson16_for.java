import java.util.Scanner;

public class lesson16_for {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter time in seconds: ");
        int time = scanner.nextInt();

        /*/
        for loop = do some code certain amount of times

        statement1; statement2; statement3

        •statement1 = initialisation(variable)
        •statement2 = condition(what to do)
        •statement3 = step(action)
         */

        for(int i = 1 ; i <= time; i++){
            System.out.println(i + ". Hello");
            Thread.sleep(1000);
        }

        scanner.close();
    }
}

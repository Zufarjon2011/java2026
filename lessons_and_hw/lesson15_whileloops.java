import java.util.Scanner;

public class lesson15_whileloops {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String password = "123aAtrue";
        String login;

        System.out.print("Enter passcode: ");
        login = scanner.nextLine();

        //first checks if it is true, if it is then goes to the next code after }
        while (!login.equals(password)){
            System.out.println("you entered wrong password!");
            System.out.print("Enter passcode: ");
            login = scanner.nextLine();

        }
        System.out.println("Hello admin");



        scanner.close();
    }
}

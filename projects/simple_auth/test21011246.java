import java.util.ArrayList;
import java.util.Scanner;

public class test21011246 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> logins = new ArrayList<>();
        ArrayList<String> passwords = new ArrayList<>();

        logins.add("zUfarjon111");
        passwords.add("zUfarjon111pass");

        logins.add("zUfarjon222");
        passwords.add("zUfarjon222pass");

        logins.add("teST1");
        passwords.add("4433");

        logins.add("test");
        passwords.add("4433");

        System.out.print("Enter login: ");
        String login = scanner.nextLine();

        System.out.print("Enter passcode: ");
        String pass = scanner.nextLine();

        boolean success = false;

        for(int i = 0; i < logins.size(); i++){
            if(login.equals(logins.get(i)) && pass.equals(passwords.get(i))){
                success = true;
            }
        }

        if(success){
            System.out.println("Login Success!");
        } else{
            System.out.println("Wrong Passcode or Login");
        }
    }
}

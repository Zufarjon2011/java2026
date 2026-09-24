import java.util.Scanner;

public class lesson11_substring {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String email;
        String domain;
        String username;

        System.out.print("Enter your email: ");
        email = scanner.nextLine();

        if(email.contains("@")){
            username = email.substring(0, email.indexOf("@"));
            domain = email.substring(email.indexOf("@") + 1);

            System.out.println(username);
            System.out.println(domain);
        }
        else{
            System.out.println("Emails should contain @");
        }





        scanner.close();
    }
}

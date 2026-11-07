import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class File_reader {
    static Scanner scanner = new Scanner(System.in);
    static String path = "data.txt";
    public static void main(String[] args){
        int user_option;

        System.out.println("1 - register\n" +
                           "2 - log in\n" +
                           "3 - log out\n" +
                           "4 - quit");
        System.out.print("I Choose ---> ");
        user_option = scanner.nextInt();
        scanner.nextLine();

        switch (user_option){
            case 1 -> register();
            case 2 -> login();
            case 3 -> System.out.println("you choose log out");
            case 4 -> System.out.println("GoodBye!");
        }

    }
    static void register() {
        System.out.print("Enter Your Full Name: ");
        String name = scanner.nextLine();

        String login;
        while (true){
            System.out.print("Create Unique Login: ");
            login = scanner.nextLine();

            if(login.contains(" ") || login.isEmpty()){
                System.out.println("Login can't contain spaces or be empty");
            }else {
                break;
            }
        }

        String password;
        while (true){
            System.out.print("Generate password: ");
            password = scanner.nextLine();

            if(password.contains(" ") || password.isEmpty()){
                System.out.println("Password can't contain spaces or be empty");
            }else {
                break;
            }
        }

        try(FileWriter writer = new FileWriter(path, true)){
            writer.write("\nNAME:" + name);
            writer.write("\nLOGIN:" + login);
            writer.write("\nPASS:" + password);
            writer.write("\n-----------------");
        }catch (Exception e){
            System.out.println("something went wrong");
        }
    }
    static void login(){
        System.out.print("Enter login: ");
        String login = scanner.nextLine();

        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        boolean found = false;

        try(BufferedReader reader = new BufferedReader(new FileReader(path))){
            String line;
            while ((line = reader.readLine()) != null){
                if(line.startsWith("LOGIN:")){
                    String saved_login = line.substring(line.indexOf(":") + 1);
                    if(login.equals(saved_login)){
                        String passLine = reader.readLine();

                        if (passLine != null && passLine.startsWith("PASS:")) {
                            String savedPassword = passLine.substring(passLine.indexOf(":") + 1);
                            if (password.equals(savedPassword)) {
                                found = true;
                            }
                        }
                        break;
                    }
                }
            }

        }catch (Exception e){

        }

        if(found){
            System.out.println("login success");
        }
        else {
            System.out.println("wrong");
        }
    }
}
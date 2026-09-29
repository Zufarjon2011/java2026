import java.util.Scanner;

public class Smart_Password__Data_Validator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String passcode;
        String rawData = "EMP-9402-Zufarjon-Finance";

        System.out.print("Create a passcode: ");
        passcode = scanner.nextLine();
        


        while (passcode.length() < 8 || passcode.length() > 12 || passcode.contains(" ") || passcode.contains("@") || passcode.contains("#") || passcode.contains("$")){
            System.out.println("Invalid Format 8-12 chars at least!\n" +
                    "passcode can not contain @ # $ or any spaces!");

            System.out.print("Create VALID passcode: ");
            passcode = scanner.nextLine();
            }

        

        int firstDash = rawData.indexOf("-");
        int secondDash = rawData.indexOf("-", firstDash + 1);
        int thirdDash = rawData.indexOf("-", secondDash + 1);
        int department = rawData.indexOf(thirdDash + 1);

        System.out.println("Your Employee id: " + rawData.substring(firstDash + 1, secondDash) + "\n" +
                "Name: " + rawData.substring(secondDash + 1, thirdDash) + "\n" +
                "Department: " + rawData.substring(thirdDash + 1));



        scanner.close();
    }
}

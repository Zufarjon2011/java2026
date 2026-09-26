import java.util.Scanner;

public class lesson13_enhancedSwitch {
    public static void main(String[] args){

        //enhanced switches = replacement of if/else statements
        //JAVA14 feature

        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine().toLowerCase();

        switch (day){
            case "monday", "tuesday", "wednesday", "thursday", "firday" ->
                    System.out.print("It is weekday");
            case "saturday", "sunday" ->
                    System.out.print("It is the Weekend");
            //else
            default -> System.out.print(day + " is not a day");
        }

        scanner.close();
    }
}

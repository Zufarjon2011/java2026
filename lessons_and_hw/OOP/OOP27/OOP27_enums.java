import java.util.Scanner;

public class OOP27_enums {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a day name: ");
        String dayname = scanner.nextLine().toUpperCase();



        try{

            Day day = Day.valueOf(dayname);

            switch (day){
                case MONDAY,
                     TUESDAY,
                     WEDNESDAY,
                     THURDSDAY,
                     FRIDAY -> System.out.println("This is weekday");
                case SATURDAY,
                     SUNDAY-> System.out.println("This is weekend");


            }
            System.out.println("WeekNumber: " + day.getDayNumber());
        }
        catch (Exception e){
            System.out.println("Error");
        }





    }
}

import java.util.Random;
import java.util.Scanner;

public class Car_OOP2 {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    String make = "Mercedes";
    String model = "W211 E55 AMG";
    int year = 2006;
    double price = 20000.99;
    boolean isRunning = false;

    void start(){
        System.out.println("You Start the Engine");
    }
    void stop(){
        System.out.println("You stop the engine");
    }
    void info(){
        System.out.println(make + model + year + price + isRunning);
    }
    void license(){
        System.out.print("Enter City Politian Name: ");
        String name = scanner.nextLine();
        int id = random.nextInt(1, 945);
        String[] chars = {"A", "B", "C", "D", "E", "F", "Z"};

        String rn_ch = chars[random.nextInt(7)];

        if(!name.contains(" ")){
            System.out.println("You Must Enter Your Full Name: ");
        }
        else {
            int space = name.indexOf(" ");
            String id_ver = name;
            String first_name = name.substring(0, space);
            String second_name = name.substring(space +1 );


            System.out.println("🆔ID: " + rn_ch + id);
            System.out.println("🪪Driver Name: " + first_name.toUpperCase() + " " + second_name.toUpperCase());
            System.out.println("📅Valid Date: 2030");

        }



    }
    void sorts(){
        String[] chars = {"A", "B", "C", "D", "E", "F", "Z"};
        for(String each : chars){
            System.out.print("🔠" + each + " ");
        }
    }
}

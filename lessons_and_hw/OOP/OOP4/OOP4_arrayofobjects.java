import java.util.Scanner;

public class OOP4_arrayofobjects {
    public static void main(String[] args){


        OOP4_CAR[] cars = {new OOP4_CAR("BMW"),
                          new OOP4_CAR("MERCEDES", "WHITE"),
        };

        for(OOP4_CAR car : cars){
            car.drive();
        }

    }
}

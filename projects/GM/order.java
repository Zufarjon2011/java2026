import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class order extends Types{
    Random random = new Random();


    String[] models = {"Lacetti", "Spark", "Malibu"};
    String[] characters = {"1.8 120hp", "1.5 100hp", "2.2 180hp"};

    String model;
    String color;
    String type;
    String drivertrain;

    static long number_of_package = 0;

    String id = "" + alifbo[random.nextInt(15)] + random.nextInt(1000);;

    order(String model) {
        this(model, "Metallic White");
    }

    order(String model, String color) {
        this(model, color, "Gas");
    }

    order(String model, String color, String type) {
        this(model, color, type, "FWD");
    }

    order(String model, String color, String type, String drivertrain) {
        this.model = model;
        this.color = color;
        this.type = type;
        this.drivertrain = drivertrain;
        number_of_package++;
    }

    void showallparams() throws IOException {

        FileWriter fileWriter = new FileWriter("Params.txt", true);
        try {
            fileWriter.write("Car Model: " + this.model + "\n" +
                    "Car Color: " + this.color + "\n" +
                    "Car Type: " + this.type + "\n" +
                    "Car Drivetrain: " + this.drivertrain + "\n" +
                    "Car ID: " + id + "\n+++++++++++++++++++++++++++++\n");
            fileWriter.close();
        }catch (IOException e){
            System.out.println("ERROR");
        }


        System.out.println("Car Model: " + this.model + "\n" +
                           "Car Color: " + this.color + "\n" +
                           "Car Type: " + this.type + "\n" +
                           "Car Drivetrain: " + this.drivertrain + "\n" +
                            "Car ID: " + id);
    }


    void showroom(){
        for (int i = 0; i < models.length; i++){
            System.out.println(models[i] + " " + characters[i]);
        }
    }

    void shownumpass(){

    }
}

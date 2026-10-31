public class Car {
    String model;
    int year;

    Car(String model){
        this.model = "Porsche " + capitalizefirstonly(model);
        this.year = 2020;
    }
    Car(String model, int year){
        this.model = "Porsche " + capitalizefirstonly(model);
        this.year = year;
    }

    void show_info(){
        System.out.printf("Car Model: %s\n" +
                          "Car year: %d\n", model, year);
    }

    static String capitalizefirstonly(String model){
        String lower = model.toLowerCase();

        return lower.substring(0,1).toUpperCase() + lower.substring(1);
    }
}

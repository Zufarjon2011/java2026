public class Car_c {

    String model;
    String make;
    int year;
    Engine engine;

    Car_c(String make, String model, int year, String EngineType, double air_conducting, int horses){
        this.make = make;
        this.model = model;
        this.year = year;
        this.engine = new Engine(EngineType,air_conducting, horses);
    }

    void start(){
        engine.start();
        System.out.println(this.year + " " + this.make + " " + this.model + " is running");
    }

    void showInfo(){
        System.out.println(this.year + " " + this.make + " " + this.model);
    }

}

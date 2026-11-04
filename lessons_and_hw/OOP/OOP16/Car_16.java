public class Car_16 {

    String model;
    int year;
    Engine_16 engine;

    Car_16(String model, int year, String EngineType){
        this.model = model;
        this.year = year;
        this.engine = new Engine_16(EngineType);
    }

    void showInfo(){
        System.out.println(this.year + " " + this.model + " " + this.engine.type);
    }

    void start(){
        engine.start();
        System.out.println(this.year + " " + this.model + " is running!");
    }
}

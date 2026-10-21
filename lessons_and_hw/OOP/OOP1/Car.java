public class Car {
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
}

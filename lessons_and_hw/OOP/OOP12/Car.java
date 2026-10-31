public class Car extends Vehicle{

    String model;

    @Override
    void go(){
        System.out.println("You drive the car");
    }

    Car(String model){
        this.model = model;
    }

    void show_info(){
        System.out.println(this.model);
    }
}

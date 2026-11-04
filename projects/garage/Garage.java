public class Garage {
    int cars_num;
    Car_c[] cars;

    Garage(Car_c[] cars){
        this.cars = cars;
        cars_num = cars.length;
    }

    void show_cars(){
        System.out.println("You Have " + cars_num + " Cars");
        for(Car_c car : cars){
            car.showInfo();
        }
    }
}

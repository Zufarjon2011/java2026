public class OOP12_polymorphism {
    public static void main(String[] args){

        /*
        Polymorphism - "POLY" = "MANY"
                       "MORPH" = "SHAPE"
                       objects can identify as other objects.
                       objects can be treated as objects of a common superclass.
         */

        Car car1 = new Car("porsche");
        Car car2 = new Car("mercedes");
        Bike bike = new Bike();
        Boat boat = new Boat();

        Vehicle[] vehicles = {car1, bike, boat};

        Car[] cars = {car1, car2};

        for(Car car : cars){
            car.show_info();
        }

        for(Vehicle vehicle : vehicles){
            vehicle.go();
        }

    }
}

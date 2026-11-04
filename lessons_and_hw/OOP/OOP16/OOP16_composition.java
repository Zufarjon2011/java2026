public class OOP16_composition {
    public static void main(String[] args){
        /*
        Composition - Represents a "part-of" relationship between objects.
                      For example, an engine is "part-of" a Car.
                      Allows complex objects to be constructed from smaller objects.

         */

        Car_16 car = new Car_16("Cayenne", 2008, "V8");

        car.start();
    }
}

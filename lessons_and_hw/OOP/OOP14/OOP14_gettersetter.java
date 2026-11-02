public class OOP14_gettersetter {
    public static void main(String[] args){
        /*
        They help protect object data and add rules for accessing or modifying them.
        GETTERS - Methods that make a field READABLE.
        SETTERS - Methods that make a field WRITABLE.
         */

        Car_14 car = new Car_14("Porsche", "Red", 20000);

        car.setColor("Black");
        car.setPrice(1000);

        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());

    }
}

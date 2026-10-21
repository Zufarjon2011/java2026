public class OOP_1 {
    public static void main(String[] args) {

        /*
        Object - An entity that holds data(Attributes)
                 and can perform actions(methods)
                 It is a referee data type
         */
        Car car = new Car();

        System.out.println(car.make);
        System.out.println(car.model);

        car.info();
    }
}

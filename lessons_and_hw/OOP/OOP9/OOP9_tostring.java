package tostore;

public class OOP9_tostring{
    public static void main(String[] args){
        /*
        toString - Method inherited from the Object class.
                   Used to return a string representation of an Object
                   By default, it returns a hash code as a unique identifier
                   It can be overriden to provide meaningful details
         */

        Car[] cars = {new Car("BMW", "M4", 2023, "Black"),
                    new Car("Mercedes-Benz", "AMG GTR", 2025, "Green")};

        for(Car car : cars){
            //working cause of toString method
            System.out.println(car);
        }

    }
}
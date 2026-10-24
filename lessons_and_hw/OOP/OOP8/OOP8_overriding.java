public class OOP8_overriding {
    public static void main(String[] args){

        /*
        Method overriding - When a subclass provides its own
                            implementations of a method that is already defined.
                            Allows for code reusability and give specific implementations.
         */

        oop8_dog dog = new oop8_dog();
        oop8_cat cat = new oop8_cat();
        oop8_fish fish = new oop8_fish();

        dog.move();
        cat.move();
        fish.move();

    }
}

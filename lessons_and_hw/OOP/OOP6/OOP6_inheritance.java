public class OOP6_inheritance {
    public static void main(String[] args){

        /*
        Inheritance - One class inherits the attributes and methods
                      from another class.
                      Child <- Parent <- Grandparent(if any)
         */

        Cat cat = new Cat();
        Dog dog = new Dog();

        System.out.println(dog.isAlive);

        dog.eat();
        cat.eat();

        System.out.println(dog.live);
        System.out.println(cat.live);

        dog.speak();
        cat.speak();
    }
}

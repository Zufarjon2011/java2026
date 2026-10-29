public class OOP11_interface {
    public static void main(String[] args){
        /*
        Interface - A blueprint for a class that specifies a set of abstract methods
                    that implementing classes MUST define.
                    Supports multiple inheritance-like behaviour.
         */

        Fish fish = new Fish();
        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();


        fish.hunt();
        fish.flee();
    }
}

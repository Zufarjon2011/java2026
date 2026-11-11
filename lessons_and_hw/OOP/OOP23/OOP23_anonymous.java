public class OOP23_anonymous {
    public static void main(String[] args){

        Dog_23 dog1 = new Dog_23();
        Dog_23 dog2 = new Dog_23(){
          @Override
          void speak(){
              System.out.println("Scooby doo goes *Ruh Roh*");
          }
        };

        dog1.speak();
        dog2.speak();

    }
}

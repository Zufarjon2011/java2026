public class OOP3_overloadedconstructors {
    public static void main(String[] args){

        /*
        Overloaded constructors - Allow class to have multiple constructors
        with different parameter list, Allowing objects to be initialized by various ways
        even if they do not fill the brackets, still program runs
         */

        User user1 = new User();
        User user2 = new User("Zufar");
        User user3 = new User("Zufar", "Zufar@gmail.com");
        User user4 = new User("Zufar", "Zufar@gmail.com", 15);

        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);

        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);

        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);

        System.out.println(user4.username);
        System.out.println(user4.email);
        System.out.println(user4.age);



    }
}

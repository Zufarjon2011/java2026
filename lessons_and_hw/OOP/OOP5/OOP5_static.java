import java.util.ArrayList;

public class OOP5_static {
    public static void main(String[] args){

        /*
        static - Makes variable or method belong to the class
                 rather than to any specific object.
                 Commonly used for utility methods or shared resources

        OOP5_friends friend1 = new OOP5_friends("Zufar");
        OOP5_friends friend2 = new OOP5_friends("Zufar1");
        OOP5_friends friend3 = new OOP5_friends("Zufar2");

         */

        ArrayList<OOP5_friends> friends = new ArrayList<>();

        for(int i = 0; i < 11; i++){
            friends.add(new OOP5_friends("Zufar" + i));
        }
        for(OOP5_friends friend : friends){
            friend.showall();
        }

        OOP5_friends.shownum();
    }
}

public class OOP5_friends {

    String names;
    static int numoffriends;

    OOP5_friends(String names){
        this.names = names;
        numoffriends++;

    }
    void showall(){
        System.out.println(names);
    }
    static void shownum(){
        System.out.println("You Have Total Of "+ numoffriends + " friends");
    }

}

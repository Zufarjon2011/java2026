public class fraud_detecting {
    public static void main(String[] args){

        String name = "Zufar Xojiakbarov";
        int age = 15;

        ccard(age);
        dname(name);

    }

    static void ccard(int age){

        if (age <= 16) {
            System.out.println("You can open bank cards and bank account legally!");
        }
        else {
            System.out.println("Sorry, You are too young! thanks for interest");
        }
    }

    static void dname(String name){

        if(name.length() < 0){
            System.out.println("Too short!");
        }else if(name.isEmpty()){
            System.out.println("please enter your name");
        }else if(!name.contains(" ")){
            System.out.println("Enter Your Full name!");
        }
        else {
            System.out.println("Hello User! " + name);
        }

    }
}

import java.util.Scanner;

public class Lesson18_methods {
    public static void main(String[] args){
        //methods = declared variables(functions in python)
        Scanner scanner = new Scanner(System.in);
//        String name;
//        int age;
//
//        name = scanner.nextLine();
//        age = scanner.nextInt();
//        happyB(name, age);

        int age_of_user = scanner.nextInt();
        System.out.println(square(15));
        System.out.println(cube(3));
        System.out.println(getfullname("Zufarjon", "Xojiakbarov"));

        if(agecheck(age_of_user)){
            System.out.println("YOU CAN SIGN UP FOR A DOCUMENT");
        }
        else {
            System.out.println("YOU MUST BE 18+ TO SIGN UP NIG");
        }
    }

    static void happyB(String birthdayboi, int age) {
        System.out.println("Happy birthday to you!");
        System.out.printf("Happy %d years of age!\n", age);
        System.out.printf("Always Be happy %s\n", birthdayboi);
        System.out.printf("YOU ARE %s AND YOU ARE %d\n", birthdayboi, age);
    }
    static double square(double number){
        return number * number;
    }
    static double cube(double cubastic){
        return cubastic * cubastic * cubastic;
    }
    static String getfullname(String first, String last){
        return first + " " + last;
    }
    static boolean agecheck(int age){
        if(age >= 18){
            return true;
        }
        else{
            return false;
        }
    }
}
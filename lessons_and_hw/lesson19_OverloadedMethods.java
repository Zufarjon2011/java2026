import java.util.Scanner;

public class lesson19_OverloadedMethods {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        /*
        * overloaded methods = methods that share the same name,
        * but different parameters
        * signature = name + parameters*/

        System.out.println("Enter parameters(bread, cheeze, topping): ");
        String pizza = bakePizza(scanner.nextLine(), scanner.nextLine(), scanner.nextLine());
        System.out.println(pizza);

        scanner.close();
    }
    //will use this if there is only 1 parameter
    static String bakePizza(String bread){
        return bread + " " + "pizza";
    }
    //this if 2
    static String bakePizza(String bread, String cheeze){
        return cheeze + " " + bread + " " + "pizza";
    }
    //final one if 3
    static String bakePizza(String bread, String cheeze, String topping){
        return topping + " " + cheeze + " " + bread + " " + "pizza";
    }
}

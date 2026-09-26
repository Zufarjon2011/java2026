import java.util.Scanner;

public class calc {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //variables
        double num1;
        double num2;
        double result = 0;
        char operator;
        boolean isValid = true;

        System.out.print("Enter Fist Number: ");
        num1 = scanner.nextInt();

        System.out.print("Enter Operator (+, - , * , / , ^ ): ");
        operator = scanner.next().charAt(0);

        System.out.print("Enter Second Number: ");
        num2 = scanner.nextInt();
        //logic

        switch (operator){
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '/' -> {
                if(num2 == 0){
                    System.out.println("Cannot devide by zero");
                    isValid = false;
                }
                else {
                    result = num1 / num2;
                }
            }
            case '*' -> result = num1 * num2;
            case '^' -> result = Math.pow(num1, num2);
            //else
            default -> {
                System.out.println("Invalid operator!");
                isValid = false;
            }
        }

        if(isValid){
            System.out.println(result);
        }

        scanner.close();
    }
}

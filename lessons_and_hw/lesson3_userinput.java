import java.util.Locale;
import java.util.Scanner;

public class lesson3_userinput {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //is for . not for ,   BRUH FOR JAVA😭
        input.useLocale(Locale.US);

        //if we use println the input will be on the next line, but without it, same as python;(
//        System.out.print("test: ");
//        String name = input.nextLine();
//
//        System.out.print("How old are you?: ");
//        int age = input.nextInt();
//
//        System.out.println("hello " + name);
//        System.out.println("u are " + age + " years old");

        double wiztdh = 0;
        double height = 0;
        double area = 0;

        System.out.print("Enter wiztdh: ");
        wiztdh = input.nextDouble();

        System.out.print("Enter height: ");
        height = input.nextDouble();

        area = wiztdh * height;
        System.out.println("the area is " + area + " cm^2");

        input.close();
    }
}

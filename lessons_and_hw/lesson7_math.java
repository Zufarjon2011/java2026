import java.util.Scanner;

public class lesson7_math {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double metre;
        double kilometre;
        double decimetre;
        double centimetre;

        System.out.print("Enter metres: ");
        metre = input.nextDouble();
        
        //formulas
        kilometre = metre / 1000;
        decimetre = metre / 10;
        centimetre = metre / 100;

        System.out.println("Your entered value is: " + metre + "\n" +
                "is " + kilometre + " Kilometre \n" +
                "is " + decimetre + " decimetre\n" +
                "is " + centimetre + " centimetre");

        input.close();
    }
}

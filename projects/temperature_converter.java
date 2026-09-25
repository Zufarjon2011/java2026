import java.util.Scanner;

public class temperature_converter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //declare variables
        double temperature;
        double newTemp;
        String unit;

        System.out.print("Enter temperature: ");
        temperature = scanner.nextDouble();

        System.out.print("Choose to which unti convert to (C or F): ");
        unit = scanner.next().toUpperCase();

        //using ternary operators, formula is taken from Google
        newTemp = (unit.equals("C")) ? (temperature - 32) * 5/9 : (temperature * 9/5) + 32;

        System.out.printf("%.1f°%s", newTemp, unit);



        scanner.close();
    }
}

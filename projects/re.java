import java.util.Random;
import java.util.Scanner;

public class re {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] names;
        System.out.print("Enter # of names to enter: ");
        int num = scanner.nextInt();
        scanner.nextLine();

        names = new String[num];


        for(int i = 0; i < names.length; i++){
            System.out.print("Enter name: ");
            String namez = scanner.nextLine();
            names[i] = namez;
        }

        System.out.println("\nPLAYERS LIST\n");
        for (String name: names){
            System.out.println(name);
        }


        System.out.println("\nIMPOSTERS LIST\n" + names[random.nextInt(1, num++)] + "\n" + names[random.nextInt(1, num++)]);
    }
}

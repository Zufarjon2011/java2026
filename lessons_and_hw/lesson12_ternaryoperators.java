import java.util.Scanner;

public class lesson12_ternaryoperators {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //ternary operators

        //variable = (condition) ? ifTrue : ifFalse

        int satSCORE = scanner.nextInt();

        String GOODorBAD = (satSCORE >= 1300) ? "Super Score" : "Aceptable";

        System.out.println(GOODorBAD);
    }
}

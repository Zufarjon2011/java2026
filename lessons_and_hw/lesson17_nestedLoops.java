import java.util.Scanner;

public class lesson17_nestedLoops {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int columns;
        int rows;
        char sym;

        System.out.print("Enter number of columns: ");
        columns = scanner.nextInt();

        System.out.print("Enter number of rows: ");
        rows = scanner.nextInt();

        System.out.print("Type symbol: ");
        sym = scanner.next().charAt(0);

        for(int i = 1; i <= columns; i++){
            for(int j = 1; j <= rows; j++){
                System.out.print(sym);
            }
            System.out.println();
        }
        scanner.close();
    }
}

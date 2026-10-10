import java.util.Scanner;

public class Lesson23_2Darrays {
    public static void main(String[] args){

        /*
        2D arrays - a list that contains list
        or just a matrix of arrays
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Target: ");
        String target = scanner.nextLine();

        String[] obst = {"banana", "apple", "peach"};
        String[] meat = {"beef", "chicken", "lamb"};
        String[] fizzY = {"fanta", "cola", "pepsi"};

        String[][] all = {obst, meat, fizzY};

        //fist one is row, second one is column
        all[0][1] = "APPLE";//we changed "apple" in row 0(first) at column 1(second) to APPLE

        for(String[] groseries : all){
            for(String items : groseries){
                System.out.print(items + " ");
            }
            System.out.println();
        }



        for(String[] findst : all){
            for (String find : findst){
                if(find.equals(target)){
                    System.out.println("FOUND " + find);
                }
            }
            System.out.println();
        }

        for(String[] findst : all){
            for (int i = 0; i < findst.length; i++){
                if (findst[i].equals(target)){
                    System.out.println(i);
                }
            }
        }
    }
}

import java.util.Scanner;

public class Lesson21_varargs {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        /*
        Varagrs - varying arguments that are basically an arrays but in easy way for methods
        they are used as ...(ellipsis), java will pack the arguments into ARRAYS!
         */

        //creating an empty array
        int[] numberss;

        System.out.print("How many ints?: ");
        int quantity = scanner.nextInt();

        //declaring its length
        numberss = new int[quantity];

        //filling our array
        for (int i = 0; i < numberss.length; i++){
            System.out.print("Enter int: ");
            numberss[i] = scanner.nextInt();
        }

        //using our method for our user input array!
        System.out.println(add(numberss));

        
        System.out.println(avg(14.5, 123.3, 54.3, 1));
    }
    //a method to sum up the values of integers
    static int add(int... numebers){
        int sum = 0;

        for(int number : numebers){
            sum += number;
        }
        return sum;
    }
    // a method to find the average of the numbers
    static double avg(double... avg_nums){
        double sum = 0;

        for (double avg_num : avg_nums){
            sum += avg_num;
        }

        return sum / avg_nums.length;
    }
}

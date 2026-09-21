public class lesson8_printf {
    public static void main(String[] args){

        //printf %[flags][.precision][width]
        String name = "Zufar";
        int age = 15;
        double height = 178;
        boolean isEmployed = true;

        //precision = limiting amount of digits
        double price1 = 9.99;
        double price2 = 100.15;
        double price3 = -76.77;

        System.out.println("\nPrecisions\n");
        System.out.printf("%.2f\n", price1);
        System.out.printf("%.2f\n", price2);
        System.out.printf("%.2f\n", price3);

        //flags
        //+ = output a plus
        //, = comma grouping separator
        // ( = groups negative numbers into ()
        // space = any positive numbers are added " "

        double price4 = 9000.99;
        double price5 = 10000.15;
        double price6 = -7600000.77;

        System.out.println("\nFlags\n");
        System.out.printf("%(,.2f\n", price4);
        System.out.printf("%(,.2f\n", price5);
        System.out.printf("%(,.2f\n", price6);

        //width
        //0 = zero padding
        //number = right justified number
        //negative number = left justified number

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.println("\nWIDTH\n");
        System.out.printf("%04d\n", id1);
        System.out.printf("%04d\n", id2);
        System.out.printf("%04d\n", id3);
        System.out.printf("%04d\n", id4);


        System.out.println("\nJust f\n");
        System.out.printf("Your name is %s \n", name);
        System.out.printf("You are %d years old", age);
    }
}

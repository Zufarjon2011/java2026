import java.util.Scanner;

public class omonat_Calculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String name;
        double deposit;
        double rate;
        int compound_time;
        int length_of_invest;
        double omonat_overall;
        double finalist;

        //welcome bloc
        System.out.println("\nWelcome to The Compound Calculator(OMONAT KALKULYATORI)\n");

        System.out.print("Enter your name: ");
        name = input.nextLine();

        System.out.printf("\n%s enter your deposit value: ", name);
        deposit = input.nextDouble();

        System.out.print("Enter interest rate: ");
        rate = input.nextDouble() / 100;

        System.out.print("How many times a year does your money compound: ");
        compound_time = input.nextInt();

        System.out.print("How many years you are holding your invest: ");
        length_of_invest = input.nextInt();


        omonat_overall = deposit * Math.pow(1 + rate/compound_time, compound_time * length_of_invest);
        finalist = omonat_overall - deposit;

        System.out.printf("%s your deposit of %f will become %.2f after %d years", name, deposit,omonat_overall, length_of_invest );
        //benefit(foyda)
        System.out.printf("\nYour benefit is %.2f\n", finalist);

        boolean cont;

        System.out.print("Do you want to continue investing(true/false): ");
        cont = input.nextBoolean();

        if(cont){
            double deposit2;
            double rate2;
            int compound_time2;
            int length_of_invest2;
            double omonat_overall2;

            double finalist2;

            System.out.printf("\n%s enter your deposit value: ", name);
            deposit2 = input.nextDouble();

            System.out.print("Enter interest rate: ");
            rate2 = input.nextDouble() / 100;

            System.out.print("How many times a year does your money compound: ");
            compound_time2 = input.nextInt();

            System.out.print("How many years you are holding your invest: ");
            length_of_invest2 = input.nextInt();


            omonat_overall2 = deposit2 * Math.pow(1 + rate2/compound_time2, compound_time2 * length_of_invest2);
            finalist2 = omonat_overall2 - deposit2;

            System.out.printf("%s your deposit of %f will become %.2f after %d years", name, deposit2,omonat_overall2, length_of_invest2 );

            System.out.printf("\nYour benefit is %.2f", finalist2);

            double final_benefit;

            final_benefit = finalist2 + finalist;

            System.out.printf("\n\n%s YOUR FINAL BENEFIT OF ALL TIME IS %.2f", name, final_benefit);




        }

        else {
            System.out.println("Good bye and see you!");
        }


    }
}

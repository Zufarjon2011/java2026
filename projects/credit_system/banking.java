import java.math.BigInteger;

public class banking {
    public static void main(String[] args){

        credit1();

    }

    static void credit1(){

        product product1 = new product("iPhone 18", 2000, 2026, "Natural Titanium");
        transfer transfer = new transfer(5614681858189610L, product1.price);

        System.out.printf("BALANCE BEFORE--->%,.2f", transfer.balance);


        double amount = product1.price;
        double result = amount/ transfer.amount;
        double annual_rate = 20.0;
        int period_months = 12;

        double interest = product1.price * annual_rate / 100 * period_months / 12;
        double totalAmount = product1.price + interest;

        System.out.printf("\nBALANCE WITHOUT CREDITS--->%,.2f",transfer.balance - product1.price);

        for(int i =0; i < result; i++){
            transfer.balance -= totalAmount;
        }
        System.out.printf("\nBALANCE AFTER---->%,.2f", transfer.balance);
    }
}

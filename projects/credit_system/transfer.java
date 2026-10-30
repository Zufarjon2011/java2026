public class transfer {

    double balance = 1000000;
    double amount;
    long card_number;

    transfer(long card_number, double amount){
        this.amount = amount;
        this.card_number = card_number;
        double balance_after = balance - this.amount;
    }
}

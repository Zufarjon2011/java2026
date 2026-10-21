import java.util.Date;

public class payment {

    Date date = new Date();

    String sender_name;
    String reciever_name;
    double amount;
    String comment;


    payment(String sender_name, String reciever_name , double amount, String comment){
        this.sender_name = sender_name;
        this.reciever_name = reciever_name;
        this.amount = amount;
        this.comment = comment;
        int dates = date.getDate() + date.getMonth();
    }
}

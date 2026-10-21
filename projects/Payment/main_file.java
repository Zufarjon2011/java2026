import java.util.Scanner;

public class main_file {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter sender name: ");
        String sender = scanner.nextLine();

        System.out.print("Enter reciever name: ");
        String reciever = scanner.nextLine();

        System.out.print("Enter amount to send: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter comment(if any, or just press space): ");
        String comment = scanner.nextLine();

        if(comment.isEmpty()){
            comment = " ";
        }
        else{
            comment = comment;
        }

        payment[] payments = {new payment(sender, reciever, amount, comment)};

        for (payment payments1 : payments){
            System.out.println(payments1.date);
            System.out.println("Sender ---> " + payments1.sender_name.toUpperCase());
            System.out.println("Reciever ---> " + payments1.reciever_name.toUpperCase());
            System.out.printf("Amount ---> %,.2f\n", payments1.amount);
            System.out.println("Comment ---> " + payments1.comment);
        }

    }
}

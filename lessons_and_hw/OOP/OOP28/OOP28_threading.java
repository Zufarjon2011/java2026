import java.util.Scanner;

public class OOP28_threading {
    public static void main(String[] args){
        /*
        Threading - Allows a program to run multiple tasks simultaneously
                    Helps improve performance with time-consuming operations
                    (File I/O, network communications, or any background tasks)

        How to create a Thread
        Option 1. Extend the Thread class (simpler)
        Option 2. Implement the Runnable class interface (better)
         */

        Scanner scanner = new Scanner(System.in);

        myRunnable Runnable = new myRunnable();
        Thread thread = new Thread(Runnable);

        /*
        Daemon means makes THIS current file dominant so if it finishes its own task
        program ends
        */

        thread.setDaemon(true);
        thread.start();

        System.out.println("You have 10 seconds to enter your name: ");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Hello " + name);


        scanner.close();
    }
}

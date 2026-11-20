public class OOP29_multithreading {
    public static void main(String[] args){

        /*
        Multithreading - Enables a program to run multiple threads concurrently
                         (Thread = A set of instructions that run independently)
                         Useful for background tasks or time-consuming operations
         */

        Thread thread1 = new Thread(new Runnable_29("Ping"));
        Thread thread2 = new Thread(new Runnable_29("Pong"));

        System.out.println("GAME STARTS!");

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("ERROR");
        }

        System.out.println("GAME OVER!");
    }
}

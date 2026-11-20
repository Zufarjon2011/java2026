public class Runnable_29 implements Runnable{

    private final String text;

    Runnable_29(String text){
        this.text = text;
    }

    @Override
    public void run(){
        for(int i = 1; i <= 5; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("ERROR");
            }
            System.out.println(Thread.currentThread().getName() + " " + text);
        }
    }

}

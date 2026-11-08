import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;
import java.util.Scanner;

public class OOP21_musicplayer {
    public static void main(String[] args){

        /*
        Basically playing an audio file in java is done by
        File, AudioInputStream, Clip
        and done with only .wav, .au, .aiff
         */

        String choice = "";
        String path = "src\\alex-morgan-lofi-midnight-club-568164.wav";
        File file = new File(path);

        try(Scanner scanner = new Scanner(System.in);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)){

            //to read the file
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);



            while (!choice.equals("Q")){
                switch (choice){
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid Option");
                }

                System.out.println("P - Play\n" +
                        "S - Stop\n" +
                        "R - Replay\n" +
                        "Q - Quit");
                System.out.print("You choosee --> ");
                choice = scanner.next().toUpperCase();
            }
        }catch (Exception e){
            System.out.println("Something went wrong");
        }finally {
            System.out.println("Goodbye!");
        }

    }
}

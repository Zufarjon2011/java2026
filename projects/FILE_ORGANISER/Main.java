import java.io.IOException;
import java.nio.file.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);

        /*
        This Java Project is one of my very first useful projects
        Anyone can use it for their own benefit
        Owner Telegram:@zufar_BRO

        https://t.me/zufar_BRO
        type for any questions! and be glad to use;)
         */

        //Empty Array
        String[] fls;

        System.out.print("Enter Number Of File Types: ");
        int types = scanner.nextInt();
        scanner.nextLine();

        //Length is now known
        fls = new String[types];


        for(int i = 0; i < fls.length; i++){
            System.out.print("Enter Type Of " + i + " File: ");
            String type = scanner.nextLine();
            fls[i] = type;
        }

        Path path = Path.of("C:\\Users\\user\\Desktop");



        try (var files = Files.list(path)) {
            files.forEach(f -> {
                if (Files.isDirectory(f)) return;

                String file = f.getFileName().toString();

                //advanced for loop to get String from array
                for (String fl : fls) {

                    //check for name of every file
                    if (file.endsWith(fl)) {
                        try {
                            //Creating and Moving
                            Path folder = path.resolve(fl.substring(1) + " Files");

                            Files.createDirectories(folder);

                            Path destination = folder.resolve(f.getFileName());
                            Files.move(f, destination);

                            break;
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            });
        }
    }
}

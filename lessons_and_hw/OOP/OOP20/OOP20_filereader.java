import java.io.BufferedReader;
import java.io.FileReader;

public class OOP20_filereader {
    public static void main(String[] args){
        /*
        How to read a file using Java (3 popular options)

        BufferedReader + FileReader: Best for reading text files line-by-line
        FileInputStream: Best for binary files(e.g, images, audio files)
        RandomAccessFile: Best for read/write specific portion of a large file.
         */

        String path = "database.txt";

        try(BufferedReader reader = new BufferedReader(new FileReader(path))){
            String line;

            while ((line = reader.readLine()) !=null){
                System.out.println(line);
            }
        }
        catch (Exception e){
            System.out.println("Something went wrong");
        }
    }
}

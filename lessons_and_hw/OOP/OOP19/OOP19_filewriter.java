import java.io.FileWriter;
import java.io.IOException;

public class OOP19_filewriter {
    public static void main(String[] args){

        /*
        How to write a file using java (4 popular options)

        FileWriter - Good for small or medium-sized text files
        BuffedWriter - Better performance for large amounts of texts
        PrintWriter - Best for structured data, like reports or logs
        FileOutputStream - Best for binary files(e.g, images, audio files...)
         */

        String path = "text.txt";
        String textcontent = """
                             I like Porsche
                             It's really good
                             buy me Porsche
                             """;

        try(FileWriter writer = new FileWriter(path)){
            writer.write(textcontent);
            System.out.println("File has been written");
        }
        catch (Exception e){
            System.out.println("Something went wrong!");
        }
    }
}

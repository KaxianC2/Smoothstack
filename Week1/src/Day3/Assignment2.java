package Day3;

/**
 * This program appends text to a end of a file.
 * Change appendText to modify what you want to append.
 * default file is sample.txt
 * @author - Kaxian Situ
 */
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
public class Assignment2 {
    public static void main(String[] args) {
        String p = "src/day3/Sample.txt";
        Path path = Paths.get(p);
        File file = path.toFile();
        if(file.exists()&&Files.isWritable(path))
        {
            String appendText = " New text. ";
            try {
                RandomAccessFile writer = new RandomAccessFile(file, "rw");
                writer.seek(writer.length());
                writer.writeBytes(appendText);
                writer.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        else
        {
            System.out.println("File that was specificed does not exist.");
        }
        
    }
}

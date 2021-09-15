package Day3;

/**
 * This program counts all instances of a specific character
 * Default txt is sample.txt
 * @author - Kaxian Situ
 */
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.FileReader;
import java.io.BufferedReader;
public class Assignment3 {
    public static void main(String[] args) {
        char c;
        if(args.length<1)
        {
            System.out.println("No specific character to count. Defaulting to 'e'");
            c='e';
        }
        else
        {
            c = args[0].charAt(0);
        }
            String p = "src/day3/Sample.txt";
            Path path = Paths.get(p);
            try {
                BufferedReader br = new BufferedReader(new FileReader(path.toFile()));
                int x, count= 0;
            while((x=br.read())!=-1)
            {
                if((char)x==c)
                {
                    count++;
                }
            }
            System.out.printf("The total count of '%s' is: %d.",c,count);
            } catch (Exception e) {
                System.out.println("error creating bufferedreader");
            }
    }
    
}

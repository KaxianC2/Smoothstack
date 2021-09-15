package Day3;
/**
 * This program outputs all the file/directories and subdirectories given a directory
 * @author - Kaxian Situ
 */
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.File;
import java.util.Stack;
public class Assignment1 {
    public static void main(String[] args) {
        if(args.length!=1)
        {
            System.out.println("Invalid argument. Please specific the path of a folder.");
        }
        else
        {
            Path basePath = Paths.get(args[0]);
            File curFile = basePath.toFile();
            if(curFile.exists())
            {
                Stack<File> files = new Stack<File>();
                files.push(curFile);
                while(!files.empty()){
                    File tempFile = files.peek();
                    files.pop();
                    if(tempFile.isDirectory())
                    {
                        File tFile = new File (tempFile.getAbsolutePath());
                        File[] tempList = tFile.listFiles();
                        for(int i = 0; i < tempList.length;i++)
                        {
                            files.push(tempList[i]);
                        }
                    }
                    System.out.println(tempFile.getName());
                }
                    
            }
            else
            {
                System.out.println("This File does not exists.");
            }
        }
    }
    
}

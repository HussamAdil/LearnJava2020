import java.io.File;
import java.util.Scanner;

public class ReadFromFile {
    public static void main(String[] args) {
        File file = new File("/home/hussamadil/IdeaProjects/LearnJava2020/Names.txt");
       try
       {
           Scanner sc = new Scanner(file);
           while (sc.hasNextLine())
           {
               System.out.println(sc.next());
           }
       }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
}

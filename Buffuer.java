import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class Buffuer {
    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader br = new BufferedReader(new FileReader("/home/hussamadil/IdeaProjects/LearnJava2020/Names.txt"));
            String currentLine = null;
            try {
                while (  ( currentLine = br.readLine()) != null)
                {
                    System.out.println(currentLine);
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }

        }
}

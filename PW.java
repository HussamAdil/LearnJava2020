import java.io.File;
import   java.io.PrintWriter ;
public class PW {
    public static void main(String[] args) throws Exception {
        File file = new File("output.txt");
        PrintWriter pw = new PrintWriter(file);
        pw.println("Hussam");
        pw.println("File");
    pw.close();

    }
}

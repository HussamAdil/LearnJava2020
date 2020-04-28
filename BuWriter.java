import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class BuWriter {
    public static void main(String[] args) throws Exception {
        File file = new File("output2.txt");
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Yeah ");
        bw.newLine();
        bw.write("I make it ");
        bw.close();

    }
}

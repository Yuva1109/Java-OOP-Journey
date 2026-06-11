import java.io.FileReader;
import java.io.IOException;

public class ThrowsDemo {

    static void readFile() throws IOException {
        FileReader fr = new FileReader("input.txt");
        fr.close();
    }

    public static void main(String[] args) {

        try {
            readFile();
            System.out.println("File opened successfully");
        }
        catch (IOException e) {
            System.out.println("File not found");
        }
    }
}

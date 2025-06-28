import java.io.*;

public class FileExample {
    public static void main(String[] args) {
        try {
            // WRITE
            FileWriter fw = new FileWriter("ElevateLabs\\Task4\\notes.txt");
            fw.write("Hello, this is my note!\n");
            fw.write("Java file handling is easy.");
            fw.close();
            
            System.out.println("Written to file.");
            
            // READ
            BufferedReader br = new BufferedReader(new FileReader("notes.txt"));
            
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            
            br.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

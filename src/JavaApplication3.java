import java.io.*;

public class JavaApplication3 {
    public static void main(String[] args) {
        String textFile = "C:\\Users\\rabbi\\Desktop\\file\\file3.txt";
        String binaryFile = "C:\\Users\\rabbi\\Desktop\\file\\binaryfile.dat";
        // 1. Write text to a file using BufferedWriter
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(textFile))) {
            writer.write("Hello, this is a text file.\n");
            writer.write("BufferedWriter is used for character output.\n");
        } catch (IOException e) {
            System.out.println("Error writing to text file.");
            e.printStackTrace();
        }

        // 2. Read text from the file using BufferedReader
        System.out.println("Reading from text file:");
        try (BufferedReader reader = new BufferedReader(new FileReader(textFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading from text file.");
            e.printStackTrace();
        }

        // 3. Write binary data to a file using BufferedOutputStream
        byte[] data = { 65, 66, 67, 68 }; // ASCII for A, B, C, D
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(binaryFile))) {
            bos.write(data);
        } catch (IOException e) {
            System.out.println("Error writing to binary file.");
            e.printStackTrace();
        }

        // 4. Read binary data using BufferedInputStream
        System.out.println("\nReading from binary file:");
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(binaryFile))) {
            int byteData;
            while ((byteData = bis.read()) != -1) {
                System.out.print((char) byteData + " ");
            }
            System.out.println(); // New line after binary output
        } catch (IOException e) {
            System.out.println("Error reading from binary file.");
            e.printStackTrace();
        }
    }
}

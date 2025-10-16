import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class file233 {
    public static void main(String[] args) {
        String filename = "C:\\Users\\Administrator\\Desktop\\file\\file.txt";
        // string wako = "This is buffered stream inside the file";
        try {
            File file = new File(filename);
            if (file.createNewFile()) {
                System.out.println("file created" + file.getName());

            } else {
                System.out.println("file already exist");
            }

        } catch (IOException e) {
            System.out.println("an error occoured during file created");
            e.printStackTrace();

        }
        try {
            FileWriter writer = new FileWriter(filename);
            writer.write("hello this is simple message");
            writer.close();
            System.out.println("successfully stored to the file");

        } catch (IOException e) {

            System.out.println("an error occured during writing");
            e.printStackTrace();
        }
        try {

            FileReader reader = new FileReader(filename);
            BufferedReader br = new BufferedReader(reader);
            String line;
            System.out.println("file content ");
            while ((line = br.readLine()) != null) {
                System.out.println(line);

            }
            br.close();
        } catch (IOException e) {
            System.out.println("an error occured ");
            e.printStackTrace();
        }
        /* */ try {
            // FileWriter file = new FileWriter(filename);
            BufferedWriter file = new BufferedWriter(file);
            file.write(filename);
            file.close();

        } catch (Exception e) {
            e.getStackTrace();

        } /*
           * try {
           * // FileReader file = new FileReader(filename);
           * // BufferedReader file = new BufferedReader(file);
           * // byte[] array = wako.getBytes();
           * 
           * file.read(file);
           * file.close();
           * } catch (Exception e) {
           * e.getStackTrace();
           * }
           */

    }
}

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Fileop {
    public static void main(String[] args) {
        String filename = "C:\\Users\\Administrator\\Desktop\\file.txt";
        try {
            File file = new File(filename);
            if (file.createNewFile()) {
                System.out.println(" file created " + file.getName());
            } else {
                System.out.println("file already exist");
            }

        } catch (IOException e) {
            System.out.println("during creation something is wrong");
            e.printStackTrace();
        }
        try {
            FileWriter writer = new FileWriter(filename);
            writer.write("gara qajeelumma nu barsiisi");
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("something is during writhing");
            e.printStackTrace();
        }
        try {
            FileReader reader = new FileReader(filename);
            BufferedReader br = new BufferedReader(reader);
            String line;
            System.out.println("file content");
            while ((line = br.readLine()) != null)
                reader.read();
            {
                System.out.println(line);
                br.close();
            }
        } catch (IOException e) {
            System.out.println("n error occurred during reading.");
            e.printStackTrace();
        }
        try {
            File filetodelete = new File(filename);
            if (filetodelete.delete()) {
                System.out.println("delted  succesfully" + filetodelete.delete());
            } else {
                System.out.println("Failed to delete the file.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred during file deletion.");
            e.printStackTrace();
        }

    }
}

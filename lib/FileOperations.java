import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperations {
    public static void main(String[] args) {
        String filename = "C:\\Users\\Administrator\\Desktop\\file.txt";

        // ✅ File Creation
        try {
            File file = new File(filename);
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred during file creation.");
            e.printStackTrace();
        }

        // ✅ File Writing
        try {
            FileWriter writer = new FileWriter(filename);
            writer.write("Dhufne jirra"); // You can replace this with any content
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred during writing.");
            e.printStackTrace();
        }

        // ✅ File Reading
        try {
            FileReader reader = new FileReader(filename);
            BufferedReader br = new BufferedReader(reader);
            String line;
            System.out.println("File content:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("An error occurred during reading.");
            e.printStackTrace();
        }

        // ✅ File Deletion
        try {
            File filetodelete = new File(filename);
            if (filetodelete.delete()) {
                System.out.println("Deleted the file: " + filetodelete.getName());
            } else {
                System.out.println("Failed to delete the file.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred during file deletion.");
            e.printStackTrace();
        }
    }
}

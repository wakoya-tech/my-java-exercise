import java.io.*;

public class WriteTextWithFileOutputStream {
    public static void main(String[] args) {
        String text = "This is a sample text written using FileOutputStream.";

        try (FileOutputStream fos = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\file.txt")) {
            fos.write(text.getBytes()); // Convert String to byte[]
            System.out.println("Text written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

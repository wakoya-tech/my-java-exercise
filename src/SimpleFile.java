import java.io.FileOutputStream;//file outputstream
import java.io.OutputStream;

import java.io.*;

public class SimpleFile {
    public static void findfile() throws IOException {
        File newfile = new File("C:\\Users\\Administrator\\Desktop\\file.txt");
        FileInputStream stream = new FileInputStream(newfile);

    }

    public static void main(String[] args) {
        try {
            findfile();

        } catch (IOException e) {
            System.out.println(e);
        }
    }

}

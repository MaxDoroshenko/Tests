package exceptions;

import java.io.FileInputStream;
import java.io.IOException;

public class FileNotFoundIO {
    public static void main(String[] args) {
        try{
            fileMethod();
        }
        catch (IOException e) {
            System.out.println("File Not Found IO Exception!");
        }
    }

    public static void fileMethod() throws IOException{
        FileInputStream file = new FileInputStream("qwerty");
    }
}

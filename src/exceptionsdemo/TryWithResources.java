package exceptionsdemo;

import java.io.FileOutputStream;
import java.io.IOException;

// This class demonstrates the use of try with resources
// Try with resources is a feature introduced in Java 7
// It is used to automatically close resources

public class TryWithResources {
    static void accessingTestFile() {
        try (FileOutputStream fo = new FileOutputStream("C:/Users/shubhsou/Downloads/test.txt")) {
            // Write "Hello World" to the file
            String s = "Hello World";
            fo.write(s.getBytes());
            System.out.println("File written successfully");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
       accessingTestFile(); 
    }
}

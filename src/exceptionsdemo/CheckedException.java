package exceptionsdemo;

import java.io.File;
import java.io.FileInputStream;

// checked exception happens at compile time
// example: FileNotFoundException, IOException
public class CheckedException {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\user\\Desktop\\test.txt");
        // this line will throw a checked exception
        try{
            FileInputStream fis = new FileInputStream(file);

        }
        catch(Exception e){
            /*
            difference between getMessage() and toString() - 
            getMessage() will return the exception message
            toString() will return the exception class name and message  
            */

            // this will print the exception message
            // if we are printing exception object, it will call the toString() method of the class
            System.out.println(e);
            // e.getMessage() will return the exception message
            System.out.println(e.getMessage());

        }
        
        
    }
    
    
    
}

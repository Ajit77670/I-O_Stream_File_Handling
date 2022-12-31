/*
 This will not give the output,we need to check if the file created and string were passed 
 in the given path by command prompt or by simply checking into the path by mouse click.
 */
package i_o_streams_in_java;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class FOS {
    
    public static void main(String[] args) {
        
    
    
    try {       
               // Creating object for FileOutputStream for writting the files.
            try (FileOutputStream fs = new FileOutputStream("C://Users//Ajith Kumar//MyJava//Test.txt")) {  
                
                String str ="Learn Java Programming"; // This is the String we want to write in the file
              
                
                //   1st Method for writing the file
                
                 fs.write(str.getBytes()); // Sab strings ko ek saath byte me convert kar liye 
                
                //
                
               /*   2nd Method of writing the file 
                
                    byte b[]=str.getBytes(); // taking all strings in form of byte array 
                    for(byte x :b)
                    fs.write(x);
                    */
               
                /*3rd way Method of writing the file 
                   
                     byte b[]=str.getBytes();
                     fs.write(b, 6, str.length()-6); // This method will give an offset to print statr of the string endex
                     
                     fs.close();
                          
                */
            }
            
        } 
        catch (IOException e) {
        }
        
    }
    
}

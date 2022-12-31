/*
 This is FileInputStream example, for reading a file from the particular location.
 */
package i_o_streams_in_java;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FIS {
    
    public static void main(String[] args) {
        
        try {
            FileInputStream fis = new FileInputStream("C://Users//Ajith Kumar//MyJava//Test.txt");
            
           // Ex: First method of reading the data from file by creating an array and storing all the elements into it.
            
            byte b[] = new byte[fis.available()];
            fis.read(b);
            String  str = new String(b);
            System.out.println(str);
            
           
           
           /*
            Ex: Second method of reading the data from file using do while loop.
            
            int x;
            
            do{
                x=fis.read();
                if(x!=-1) // ye esliye yaha kyunki -1 bhi print ho raha tha characters k saath, so we use forst here
                System.out.print((char)x); // type cast to character bcuz the output was coming in ASCI code.
                
            }while(x!=-1); // while will print jabtak all the values dint read in file i.e till -1.
           
            */
           
           /*
           
           Ex: Third and common method to read the inputs from the file. using while loop.
           
           
           int x;
           while((x=fis.read())!=-1){
               System.out.print((char)x);
           }
           */
        } 
        catch (IOException e) 
        {
        }
        
        
    }
    
}

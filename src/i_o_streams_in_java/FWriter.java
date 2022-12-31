/*
 **This example is for File Writer which is a character Stream for writting the data.
 *The OutputStream class of Byte Straeam and FileWriter class of Character stream both are same with minor changes.
 *The OuputStream writes the data in Byte and the File Writer write the data in Character.
 */
package i_o_streams_in_java;

import java.io.FileWriter;


public class FWriter {
    
    public static void main(String[] args)throws Exception {
        
        FileWriter fw = new FileWriter("C://Users//Ajith Kumar//MyJava//Test1.txt");
        
        String str = "Learn JAVA with Selenium1";
       
        /* Ex: 1st Method for writing into file using FileWriter
        
        fw.write(str);
        fw.close();
        
        /* Ex: 2nd Method for writing into file using FileWriter
        byte b[] = str.getBytes();
        for(byte x :b)
             fw.write(x);
             fw.close();
        */     
    }
    
}

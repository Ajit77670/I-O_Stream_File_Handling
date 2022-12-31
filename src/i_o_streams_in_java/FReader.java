/*
 *This example is for File Reader which is a character Stream for reading the data.
 *The InPutStream class of Byte Straeam and FileReader class of Character stream both are same with minor changes.
*The InputStream reads the data in Byte and the File Reader reads the data in Character.
 */
package i_o_streams_in_java;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class FReader {

    public static void main(String[] args) throws IOException {
        
        try {
            FileReader fr = new FileReader("C://Users//Ajith Kumar//MyJava//Test.txt");
            
            int x;
            while((x=fr.read())!=-1){
                System.out.print((char)x);
        }
            
        } catch (FileNotFoundException ex) {
        }
        
    }


}


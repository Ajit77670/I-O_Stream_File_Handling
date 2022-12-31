/*
 *This programe is the demonstartion of  CharArrayWriter stream class.
 *to write the data.
 */
package i_o_streams_in_java;
import java.io.*;
import java.io.FileWriter;
import java.io.CharArrayWriter; 

public class CharArrayWriter_1 {
    
    public static void main(String[] args) throws Exception{
        
        CharArrayWriter cw = new CharArrayWriter();
        cw.append('d');
        cw.append('J');
        cw.append('a');
        cw.append('i');
        cw.append('S');
        cw.append('h');
        cw.append('r');
        cw.append('e');
        cw.append('e');
        cw.append('R');
        cw.append('A');
        cw.append('M');
   
        /*This is just to show that the  character elements we append is stored in the Char array
        
        char c[]=cw.toCharArray();
        for(char x : c)
        System.out.print((char)x);   
        cw.close();
        
        */
        
       cw.writeTo(new FileWriter("C:/Program Files/NetBeans-15/netbeans//StudentChallenge/Om.txt"));
       cw.close();
        
        
        
    }
    
}

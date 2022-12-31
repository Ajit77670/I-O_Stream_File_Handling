/*
  *This programe is the demonstartion of sub-class ByteArrayOutputStream of InputStream
  * to write the data.
 */
package i_o_streams_in_java;
import java.awt.BorderLayout;
import java.io.*;

public class ByteArrayOutputStream_1 {
    
    public static void main(String[] args) throws Exception {
        
        ByteArrayOutputStream bo = new ByteArrayOutputStream(30);
        
        bo.write('a');
        bo.write('b');
        bo.write('c');
        bo.write('d');
        bo.write('e');
        bo.write('f');

        /*This is just to show that the byte character elements we created is stored in the byte array
        byte b[]= bo.toByteArray();
        for(byte x : b)
        System.out.print((char)x);   
        bo.close();
      */
        
        bo.writeTo(new FileOutputStream("C:/Program Files/NetBeans-15/netbeans/StudentChallenge/Hello.txt"));
        bo.close();
    }
    
}

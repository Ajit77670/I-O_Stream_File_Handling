/*
 *This programe is the demonstartion of  CharArrayReader stream 
 *to read the data.
 */
package i_o_streams_in_java;
import java.io.*;

public class CharArrayReader_1 {
    
    public static void main(String[] args)throws Exception {
        
         char c[] = {'a','b','c','d','e','f','g'};
         
        CharArrayReader cr = new CharArrayReader(c);
        
        
        int x;
        while((x=cr.read())!=-1){
        System.out.print((char)x);
        }
         cr.close();
          
        
       
        }
    
}

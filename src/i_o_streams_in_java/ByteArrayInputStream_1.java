/*
 *Here the source of Data is Byte Array. To show the data is coming from some other loacation we have make use of Byte Array.
 *This programe is the demonstartion of sub class ByteArrayInputStream of InputStream.
 *This is to read the data.
 */
package i_o_streams_in_java;

import java.io.*;
public class ByteArrayInputStream_1 {
    
     public static void main(String[] args) throws Exception{
        
     byte b[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
     
     ByteArrayInputStream bt = new ByteArrayInputStream(b);
     
     /* Ex: First simple Method to read the data using while loop.
     
     int x;
     while((x=bt.read())!=-1){
         
         System.out.print((char)x); 
         bt.close();
     }
     
     */
     
     //Ex: Second method of reading the data by storing all the byte array elements into String.
     
     String str = new String (bt.readAllBytes());
     System.out.print(str);
     bt.close();
     
   
    
     
   
}
}
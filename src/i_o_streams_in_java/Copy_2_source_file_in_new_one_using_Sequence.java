/*
 In this Programe will be copying 2 source file into a third new file. 
 But first we need to copy first file into the new file and then the second file.
For this we need subclass of InputStream i.e SequenceInputStream
 */
package i_o_streams_in_java;

import java.io.*;

public class Copy_2_source_file_in_new_one_using_Sequence {
    
    
    
    public static void main(String[] args) throws Exception {
        
        FileInputStream fis1 = new FileInputStream("C://Program Files//NetBeans-15//netbeans//StudentChallenge//Hi.txt");
        FileInputStream fis2 = new FileInputStream("C://Program Files//NetBeans-15//netbeans//StudentChallenge//Hi1.txt");
        
        FileOutputStream fos = new FileOutputStream("C://Program Files//NetBeans-15//netbeans//StudentChallenge//Destination.txt");
        
        SequenceInputStream seq = new SequenceInputStream(fis1,fis2);
        
        int x;
        
        while((x=seq.read())!=-1){
            
            fos.write(x);
        }
        
        fis1.close();
        fis2.close();
        fos.close();
        
        
    }
    
}

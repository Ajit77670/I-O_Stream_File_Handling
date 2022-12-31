/*
 *This Programe is the demonstartion for BufferedInputStream which is a subclass of InputStream
 */
package i_o_streams_in_java;
import java.io.*;


public class Buffered_FileInputStream {
    
    public static void main(String[] args)throws Exception {
        
        FileInputStream fs = new FileInputStream("C://Program Files//NetBeans-15//netbeans//StudentChallenge//Nama.txt");
        BufferedInputStream bf = new BufferedInputStream(fs);
        
      
        System.out.println("--------------To Check marksupported condition-------------");
        //To check if the file is marksupported or not.
        System.out.println(fs.markSupported()); // false --> marksupported only applicable for buffered files so its gives false.
        System.out.println(bf.markSupported()); // true
      
        System.out.println("--------------Condition for the mark-------------");
        //Now Will apply mark over the input stored in Buffered temporary area.
       
        System.out.print((char)bf.read());
        System.out.print((char)bf.read());
        System.out.print((char)bf.read());
        
        bf.mark(10);
        
        System.out.print((char)bf.read());
        System.out.print((char)bf.read());
        bf.reset();
        
        System.out.print((char)bf.read());
        System.out.print((char)bf.read());
    
        fs.close();
        bf.close();
    }
}

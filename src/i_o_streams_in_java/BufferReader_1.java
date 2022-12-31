/*
 *This Programe is the demonstartion for BuffereReader which is a subclass of ChracterStream class.
 */
package i_o_streams_in_java;
import java.io.*;

public class BufferReader_1 {
    
    public static void main(String[] args) throws Exception {
        
         
        FileReader fs = new FileReader("C://Program Files//NetBeans-15//netbeans//StudentChallenge//Nama.txt");
        BufferedReader bf = new BufferedReader(fs);
        
        
         
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
    
        System.out.println(bf.readLine());// This method readLine() was not there in BufferedInputStream.
                                            // This method will show the reamaing lines of the source file.
        fs.close();
        bf.close();
        
        
    }
        
        
        
    }
    


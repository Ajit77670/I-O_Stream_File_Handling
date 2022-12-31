/*
 *This programe is to use Random Acces file operation using RandomAcessFile subclass.
 *Using this we can use read write in a single opertion.

** command for creating and copy the text in file for command Prompt:
// copy con Data.txt
    ABCDEFGH --> after writng text(PRESS CTRL + Z)
 */

package i_o_streams_in_java;
import java.io.*;

public class Random_Access_File {
    
    public static void main(String[] args)throws Exception {
        
        RandomAccessFile raf = new RandomAccessFile("C://Users//Ajith Kumar//MyJava//Data.txt","rw"); // this mode can be changed, "rw" for read-write, "r" for read only and "w" for write only.
        
        System.out.println((char)raf.read()); // Read data one byte each
        System.out.println((char)raf.read());
        System.out.println((char)raf.read());
        raf.skipBytes(4);                  // Skip the 4 bytes from the current currsor point
        System.out.println((char)raf.read());
        raf.seek(3);                     // Go back to the starting position of curssor and the currsor will point after 3 bytes
        System.out.println((char)raf.read());
        raf.write('b');                     // writting a byte into the file.
        System.out.println(raf.getFilePointer()); // Gives the current position of currsor into the file.
        raf.seek(raf.getFilePointer()+2); // with this we can increment and decrement the currsor location
        System.out.println((char)raf.read());
    }
    
}

/*
 *This is FileHandling programe of Class File, by using this we can modify/read/write/access the properties of a file. 
 */
package i_o_streams_in_java;
import java.io.*;

public class File_Handling {
    
    public static void main(String[] args) {
        
        File f = new File("C:\\Program Files\\NetBeans-15\\netbeans\\StudentChallenge");
        
        
        /* Method list() which will return in array of String[] --> By this File class method we can see the sub files of the file. 
        
        String str[]=f.list();
        for(String x: str){
        System.out.println(x);
        */
        
        // Method listFiles() which will return the files in form of array of File[] --> By this File class method we can see the sub files of the file. 
        // ALso by using class File methods suc as : getName() and getPath() we can see the subclass file anme and its path.
        // we have many more methods of File class depend upon the use we can use it.
            File f1[]=f.listFiles();
            for(File y : f1){
            System.out.print(y.getName()); // gives sub class file name.
            System.out.println(y.getPath()); // gives file path
            System.out.println(y.getParent()); // gives parent Folder name
            
            
         // we have others methods of class File such as: setReadonly(),which will give permission to read the file only.
         
        // we have others methods of class File such as: setWritable(),which will give permission to write the file only.
        
         // we have others methods of class File such as: lastModified(),by which we can see the last modification time.
        }
       }
        
        
        
    }
    


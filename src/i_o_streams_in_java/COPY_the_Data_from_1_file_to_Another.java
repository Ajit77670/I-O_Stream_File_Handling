/*
* This Programe is to copy the data from one file to another.

*To ask--(When we trying to convert the UPPER case into lower case from the source file to destination file)
i have got the output but the text where appeared in Notepad is white , Also if i write numbers in source file
that will  appear in the destination file but not the characters.

* Without converting to the small letters code work perfectly.

 */
package i_o_streams_in_java;

import java.io.*;

public class COPY_the_Data_from_1_file_to_Another {
    
    public static void main(String[] args) throws Exception{
        
        FileInputStream fs = new FileInputStream("C://Program Files//NetBeans-15//netbeans//StudentChallenge//Hi1.txt");
        FileOutputStream fos = new FileOutputStream("C://Program Files//NetBeans-15//netbeans//StudentChallenge//Copy.txt");
        
        
        int b;  
        while((b=fs.read())!=-1)
        {
        //if(b>=65 && b<=90)fos.write(+32); // condition to convert the CAPITAL letter of Test4.txt 
                                          //into small letters in new file i.e Test5.txt. 
        fos.write(b); // if this is not in range i.e letters are already in small then simply copy into new file.
        }
        
        
        
        fs.close();
        fos.close();
    }
    
}

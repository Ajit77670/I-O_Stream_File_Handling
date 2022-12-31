/*
 *This programe is the demonstartion of Piped Streams using InputStream & Outputstream.
 *we join producer and consumer thread by Piped connection.
*Producer will produce so it means it will be writting and Consumer will consume so it will be reading the data.
 */
package i_o_streams_in_java;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

class Producer extends Thread{   // Producer class Thread
    
 OutputStream os;  
 
 public Producer(OutputStream o){  // Constuctor
     
     os=o;
 }
   public void run(){ // override run method
       
       int count=1;
       while(true){
           
           try{
           os.write(count);
           os.flush();
           
               System.out.println("Producer" +count);
               System.out.flush();
               
               count++;
               Thread.sleep(10);
           }catch(Exception e){}
   }
    
}
}
   class Consumer extends Thread{  // consumer class thread
       
       InputStream is;
       
       public Consumer( InputStream s){ // constructor
           
           is=s;
        }
       
       public void run(){ //override run method
           
           int x;
           
           while(true){
               
               try {
                   x=is.read();
                   System.out.println("Consumer"+x);
                   System.out.flush();
                   
                   Thread.sleep(10);
               } catch (Exception e) {}
                   
               }
           }
           
       }
       
   

public class Piped_Streams_Using_Thread {
    
    public static void main(String[] args)throws Exception {
        
       PipedInputStream pis=new PipedInputStream();  
       PipedOutputStream pos=new PipedOutputStream();
       
       pis.connect(pos); // Connecting the two thread through pipe.
       
       Producer p = new Producer(pos); //craeted object for producer class and initialize by passing the constructor
       Consumer c = new Consumer(pis);//craeted object for consumer class and initialize by passing the constructor
       
       p.start(); //starting Producer thread.
       c.start();// starting consumer thread.
        
    }
    
}

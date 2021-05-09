//package handlingfiles;

import java.io.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import static java.lang.System.in;
import java.lang.System;
import java.util.logging.Level;
import java.util.logging.Logger;
//import jdk.internal.util.xml.impl.Input;

public class Reading {

    //private static FileWriter writer;

    
    public static void main(String args[])throws IOException{
      
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        
        try {
              FileWriter writer = new FileWriter("E:\\reading.txt");
              BufferedWriter buffer = new BufferedWriter(writer);
            
                String name = "";
        
              while (!name.equals("stop")) {
            
            System.out.println("Enter data : ");
            name = br.readLine();
            System.out.println("data is : "+name);
            
            buffer.write(name+"\n");
            
          
          }
          buffer.close();
        }
        
        catch (IOException ex) {
            Logger.getLogger(Reading.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
      
       
        //br.close();
       // r.close();
       
        
        
        
    }
}

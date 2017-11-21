/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprog;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Snowwhite
 */
public class Progr_18 {
  public static void main(String[] args) throws IOException {
        // TODO code application logic here
        int cnt=0;      
        int val=0;
        try { 
 
			FileInputStream fstream = new FileInputStream("D:\\links.txt");
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine = null;                                               
			while ((strLine = br.readLine()) != null)   
                        {
                               String m[]=strLine.split(" "); 
                               
                               for(String i:m)
                               {
                               String reverse = new StringBuffer(m[val]).reverse().toString();    
                               if(i.equals(reverse)){
                                   System.out.println(i);
                                   cnt+=1;
                               }
                               val+=1;
                               }                                      
			} 
                        System.out.println("No of Words:"+cnt);
		}   
        catch (FileNotFoundException ex) {
            Logger.getLogger(Progr_18.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}  

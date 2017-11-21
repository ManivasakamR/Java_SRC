/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package javaprog;

import java.util.Random;

/**
 *
 * @author Admin
 */
public class Prog_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random P=new Random();
        int a[]=new int[25];
        int i;
        for(i=0;i<25;i++) 
        {
        a[i]=P.nextInt(100); 
        }
        
        System.out.println("The Generated Random Numbers are");
        for(i=0;i<25;i++) 
        {
        System.out.print(a[i]+", ");
        }
        
        System.out.println("");
        for(i=0;i<24;i++) 
        {  
            if(a[i]>a[i+1])
                {
                    System.out.println(a[i]+" Is Greater than  "+a[i+1]);
                }
            else if(a[i] < a[i + 1]) 
                {       
                    System.out.println(a[i]+" Is Lesser than  "+a[i+1]);
                }
            else 
                {
                    System.out.println(a[i]+" Is Eqal to "+a[i+1]);
                }
        }  

    }
    
}

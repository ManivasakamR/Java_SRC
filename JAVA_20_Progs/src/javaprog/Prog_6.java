/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprog;

import java.util.Scanner;
import java.util.Stack;


/**
 *
 * @author K.Aravind
 */
public class Prog_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HstackArrayMethod obj= new HstackArrayMethod();
        Scanner in=new Scanner(System.in);
       int ch=0;
        System.out.println("Stack in Array List");
        do
        {
            System.out.println("1.push");
            System.out.println("2.pop");
            System.out.println("3.display");
            System.out.println("4.EXIT");
            System.out.println("Enter ur choice");
             ch=in.nextInt();
            switch(ch)
                    {
                case 1:
                    obj.push();
                    break;
                case 2:
                     obj.pop();
                     break;
                case 3:
                      obj.display();
                      break;
                case 4:
                     System.exit(0);
                     
                      
                    }
            
            
     }
        while(ch<=5);
 
    }
    
}

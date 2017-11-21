/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaprog;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Prog_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num1,num2;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the first value:");
        num1=input.nextInt();
        System.out.println("Enter the second value:");
        num2=input.nextInt();
        int num3=findGCD(num1,num2);
        System.out.println("Common Factor is:"+num3);
        num2=num2/num3;
        num1=num1/num3;
        System.out.println("Result is:"+num1+"/"+num2);
    }
    private static int findGCD(int n1,int n2)
    {
        if(n2==0)
        {        
        return n1;
        }
        return findGCD(n2,n1%n2);
    }                

}
   


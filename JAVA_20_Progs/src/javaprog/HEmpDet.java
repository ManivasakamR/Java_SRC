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
public class HEmpDet {
     Scanner s=new Scanner(System.in);
    int empno;
    String ename;
    int Bpay;
    int Allowance;
    int dedections;
    int Gp;
    int Netpay;    
    
    HEmpDet() 
       {
        System.out.println("-----------------------------------------");
        System.out.println(" Employee Program");
        System.out.println("-----------------------------------------");
       }
    
    void get( ) 
       {    
        {
        System.out.println("Enter The EmpNo  :");
        this.empno=s.nextInt();
        System.out.println("Enter The EmpName  :");
        this.ename=s.next();
        System.out.println("Enter The Emp Bpay :");
        Bpay=s.nextInt();
        System.out.println("Enter The Emp Allowance :");
        Allowance=s.nextInt();
        System.out.println("Enter The Emp Dedections:");
        dedections=s.nextInt();
        Gp=Bpay-dedections;
        Netpay=Gp+Allowance;
        System.out.println("-----------------------------------------");
        }
        }
    String  get(int a )
    {
        String fin;
        fin=Integer.toString(empno)+"/"+ename+"/"+Integer.toString(Bpay)+"/"+Integer.toString(Allowance)+"/"+Integer.toString(dedections)+"/"+Integer.toString(Gp)+"/"+Integer.toString(Netpay);
        return fin;
     //System.out.println(fin);
    }
        }
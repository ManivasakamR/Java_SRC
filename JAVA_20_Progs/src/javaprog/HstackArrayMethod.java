/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprog;

import java.util.LinkedList;
import java.util.Scanner;

interface array
{   
    int n=50;
    void push();
    void pop();
    void display();
}
public class HstackArrayMethod implements array{

      Scanner in=new Scanner(System.in);
     int[] arr=new int[n];
     LinkedList list=new LinkedList();
   
     int top=-1;    
    
    @Override
    public void push() {
        try{
         int ele;
         System.out.println("Eneter ur Element");
         ele=in.nextInt();   
         arr[++top]=ele;
         list.addLast(ele);
          
      }
        
       catch(Exception e)
       {
         System.out.println(e);
       }
     
        
        
        
    }

    @Override
    public void pop() {
        
        
        try{
            System.out.println("Eneter the pop Elemenet");
            top--;
            System.out.println(arr[top]);
            Object last=list.getLast();
        list.removeLast();
        System.out.println("Popped Element Is:"+last);
            
        }
        catch(Exception e)
        {
            
            System.out.println(e);
        }
        
    }

    @Override
    public void display() {
        
        System.out.println("Stack elements are:");
       for(int a:arr)
       {   
           if(a>0)
                   {    
                       System.out.println(a+" ");
                   }
       }
       
       System.out.println("List Elements Are:");

        if(list.isEmpty())
              {
                System.out.println("Stack list Is Empty");
              }
             else
               {
               System.out.println(list+" ");
               }
    
    }
    
    
    
    
    
    
}

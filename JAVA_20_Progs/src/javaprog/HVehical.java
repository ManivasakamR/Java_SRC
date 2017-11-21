/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaprog;

/**
 *
 * @author Admin
 */
public class HVehical {
    
   int tires,seats,doors;    
 
}
class bike extends HVehical
 {
     bike()
     {
     tires=2;
     seats=2;
     doors=0;
     }
     public String toString()
     {
         return("tires="+tires+"seats="+seats+"doors="+doors);
     }
 }
    class Car extends HVehical
    {
        Car()
        {
        tires=4;
        seats=5;
        doors=4;
        }
public String toString()
        {
        return ("tires=" + tires + ", seats=" + seats + ", doors=" + doors);
        }
   }

class Bus extends HVehical
 {
     Bus()
     {
     tires=6;
     seats=64;
     doors=3;
     }
     public String toString()
     {
        return ("tires=" + tires + ", seats=" + seats + ", doors=" + doors);
     }
 }
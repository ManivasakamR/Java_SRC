/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaprog;
import java.awt.*;
/**
 *
 * @author Admin
 */
public class Progr_15 extends Frame{

    /**
     * @param args the command line arguments
     */
    static int xPixel = 20;
    static int yPixel = 20; 
    Image myImage;
    public Progr_15(){
       try{
          myImage = Toolkit.getDefaultToolkit().getImage("D:\\pictures\\img1.jpg"); 
        }
        catch(Exception e){}
       setSize(800,600);
       setVisible(true);
       moveImage();
   }
   public void paint(Graphics g){
        boolean b = g.drawImage(myImage, xPixel, yPixel, this);
   } 
   void moveImage(){
       for ( int i=0 ; i< 50000 ; i++ ){
          //System.out.println("next set of Pixels " + xPixel);
          for ( int j=1 ; j<5000000 ; j++)
          {} //this just shows you one method
          xPixel +=1;
          yPixel +=1;
          repaint(); 
       }
   }
    public static void main(String[] args) {
        // TODO code application logic here
         Progr_15 me = new Progr_15();        
    }
    
}

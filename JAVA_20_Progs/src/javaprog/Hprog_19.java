/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprog;

/**
 *
 * @author Snowwhite
 */
import java.io.*;
import java.net.*;
public class Hprog_19{
 public static void main(String [] args)
 {
System.out.println("Server Started....");
try
{
 ServerSocket ss=new ServerSocket(300);
 while(true)
 {
Socket s= ss.accept();
Thread t = new ThreadedServer(s);
t.start();
 }
}
catch(Exception e)
{
 System.out.println("Error: " + e);
}
 }
}
class ThreadedServer extends Thread{
 Socket soc;
 public ThreadedServer(Socket soc)
 {
this.soc=soc;
 }
 public void run()
 {
try
{
 BufferedReader in=new BufferedReader(new InputStreamReader(soc.getInputStream()));
 PrintWriter out=new PrintWriter(soc.getOutputStream());
 String str=in.readLine();
 System.out.println("Message From Client:"+str);
 out.flush();
 out.println("Message To Client:"+str);
 out.flush();
}
catch(Exception e)
{
 System.out.println("Exception:"+e);
}
 }
}
 


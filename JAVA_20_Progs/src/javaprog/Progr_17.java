/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprog;

import java.io.PipedReader;
import java.io.PipedWriter;

/**
 *
 * @author Snowwhite
 */
class Progr_17 extends Thread
{
 private PipedWriter out=new PipedWriter();
 public PipedWriter getPipedWriter()
 {
  return out;
 }
 public void run()
{
Thread t=Thread.currentThread();
t.setName("A1");
System.out.println(t.getName()+" Thread started...");
int fibo=0,fibo1=0,fibo2=1;
while(true)
{	 try
           {	
	fibo=fibo1+fibo2;
		if(fibo>100000)	
		{		
			 out.close();
			 break;
		}
	out.write(fibo);
	sleep(1000); 
 	}
	 catch(Exception e)
	 {
		System.out.println("Exception:"+e);
	 }
 fibo1=fibo2;
 fibo2=fibo;
}
System.out.println(t.getName()+" Thread exiting...");
 }
}

class Prime extends Thread
{
 private PipedWriter out1=new PipedWriter();
 public PipedWriter getPipedWriter()
 {
return out1;
 }
 public void run()
 {
Thread t=Thread.currentThread();
t.setName("Prime");
System.out.println(t.getName() +" Thread Started...");
int prime=1;
	while(true)
	{
	 try
	 {
		if(prime>100000)
		{
		 out1.close();
		 break;
		}
	if(isPrime(prime))
	out1.write(prime);
	prime++;
	sleep(0);
	 }
	 catch(Exception e)
	 {
	System.out.println(t.getName()+" Thread exiting...");
	System.exit(0);
	 }
	}
 }
 public boolean isPrime(int n)
 {
int m=(int)Math.round(Math.sqrt(n));
if(n==1||n==2)
return true;
for(int i=2;i<=m;i++)
if(n%i==0)
return false;
return true;
 }
}

class MultiThreadDemo
{
 public static void main(String[] args)throws Exception
 {
Thread t=Thread.currentThread();
t.setName("Main");
System.out.println(t.getName()+" Thread Started...");
Progr_17 fibObj=new Progr_17();
Prime primeObj=new Prime();
PipedReader pr=new PipedReader(fibObj.getPipedWriter());
PipedReader pr1=new PipedReader(primeObj.getPipedWriter());
fibObj.start();
primeObj.start();
int fib=pr.read(),prm=pr1.read();
System.out.println("The numbers common to PRIME and FIBONACCI:");
while((fib!=-1)&&(prm!=-1))
{
 while(prm<=fib)
 {
if(fib==prm)
System.out.println(prm);
prm=pr1.read();
 }
 fib=pr.read();
}
System.out.println(t.getName()+ " Thread exiting...");
 }
} 

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprog;
import java.io.*;

/**
 *
 * @author Snowwhite
 */

public class Prog_9 {
public static void main(String[] args) throws IOException, ClassNotFoundException
{
Dollar d= new Dollar();
Rupee r =new Rupee();
d.printDollar();
r.printRupee();
d.convertRupee();
// Write these contents into a text file using object serializati
File f = new File("new.txt");
FileOutputStream fos = new FileOutputStream(f);
ObjectOutputStream oos = new ObjectOutputStream(fos);
oos.writeObject(d);
oos.writeObject(r);
oos.flush();
oos.close();
System.out.println("Reading form the file");
ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
Dollar d1;
d1 = (Dollar)ois.readObject();
d1.printDollar();
Rupee r1;
r1 = (Rupee)ois.readObject();
r1.printRupee();
}
}

class Dollar implements Serializable{
private String sym;
private double dol;
public Dollar() throws IOException{
InputStreamReader stream = new InputStreamReader(System.in);
BufferedReader bf= new BufferedReader(stream);
System.out.println(" Enter the Symbol for Dollar ");
sym= bf.readLine();
System.out.println (" Enter the amount in Dollar ");
dol= Double.parseDouble(bf.readLine());
}
void printDollar()
{
System.out.println(sym + dol + "\n");
}
void convertRupee()
{
dol = dol * 61.58;
sym = "Rs.";
System.out.println(" The amount of Dollar in Rupees= " + sym + dol);
}
}

class Rupee implements Serializable{
private String sym;
private double rs;
public Rupee() throws IOException{
InputStreamReader stream = new InputStreamReader(System.in);
BufferedReader bf= new BufferedReader(stream);
System.out.println(" Enter the Symbol for Rupee ");
sym= bf.readLine();
System.out.println (" Enter the amount in Rupee ");
rs= Double.parseDouble(bf.readLine());
}
void printRupee()
{
System.out.println(sym + rs + "\n");
}
}


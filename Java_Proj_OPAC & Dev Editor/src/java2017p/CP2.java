/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package java2017p;
/**
 *
 * @author Snowwhite
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class CP2 extends JFrame implements ActionListener, KeyListener
{
	// A frame with text field and Label field
JToolBar tb = new JToolBar();

// icf & b1 an array of values.
String icf[] = {"new.gif","open.gif","save.gif","cut.gif","copy.gif","paste.gif"};

// b1 represents for Tooltip
String bl[] ={"New","Open","Save","Cut","Copy","Paste"};

// Demonstrate a one-dimensional array
ImageIcon ic[] = new ImageIcon[icf.length];

// use a lable to display syntax highlighting
Label l1 = new Label("Syntax Highlighting");
JButton mbl[] = new JButton[icf.length];

// set up manu bar
MenuBar mbar = new MenuBar();
Menu a = new Menu("File");
Menu b = new Menu("Edit");
Menu c = new Menu("Font");
Menu d = new Menu("Font-Size");
Menu f = new Menu("System");
int fsize = 13; // assigns fsize the Value 13
JTextArea ta,ta1;
JScrollPane js1;

// create a fontList using GraphicsEnvironment
String fontList[] =
GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();



// create MenuItem
MenuItem m[] = new MenuItem[fontList.length];
MenuItem fs[] = new MenuItem[600];
MenuItem a1 = new MenuItem("New");
MenuItem a2 = new MenuItem("Open");
MenuItem a3 = new MenuItem("Save");
MenuItem a4 = new MenuItem("Save as");
MenuItem a5 = new MenuItem("-");
MenuItem a6 = new MenuItem("Exit");
MenuItem b1 = new MenuItem("Cut");
MenuItem b2 = new MenuItem("Copy");
MenuItem b3 = new MenuItem("Paste");
MenuItem d1 = new MenuItem("Compile");
MenuItem d2 = new MenuItem("Run");
String ck="";
int i;

public CP2() 
{
	super("Java Editor");//set title 
setSize(1024,768); //assign a layoutsize
setLayout(null);
ta=new JTextArea(10,10);
js1=new JScrollPane(ta);
ta1=new JTextArea(5,60);
add(js1);add(ta);add(ta1);add(tb);
	a.add(a1);add(l1);
	a.add(a2);
	a.add(a3);
	a.add(a4);
	a.add(a5);
	a.add(a6);
	b.add(b1);
	b.add(b2);
	b.add(b3);

f.add(d1);
f.add(d2);

	mbar.add(a);
	mbar.add(b);
	mbar.add(c);
	mbar.add(d);
	mbar.add(f);
	setMenuBar(mbar);
// loop for FontList
 for (i = 0; i < fontList.length; i++ )
 {
m[i] = new MenuItem(fontList[i]);
m[i].addActionListener(this);
m[i].setActionCommand(""+i);
c.add(m[i]);
}

// loop for MenuItem
 for (i = 8; i <=90 ; i+=2)
 {
fs[i] = new MenuItem(String.valueOf(i));
fs[i].addActionListener(new fs());
d.add(fs[i]);
}

//loop for ImageIcone
	for( i =0;i<bl.length;i++)
	{
	ic[i]= new ImageIcon(icf[i]);
	mbl[i] = new JButton(ic[i]);
	mbl[i].setToolTipText(bl[i]);
mbl[i].addActionListener(this); 
	mbl[i].setActionCommand("z"+i); 
	if(i==3)tb.addSeparator();
	tb.add(mbl[i]);
	}
tb.reshape(0,0,500,35);
ta.reshape(5,40,1005,500);
js1.reshape(5,4,100,35);

// set foregroundcolor for l1 that is Syntax Highlighting
l1.setForeground(Color.green);

// set foregroundcolor for ta that is text area
ta.setForeground(Color.blue);
l1.reshape(400,550,130,30);
ta1.reshape(5,600,1005,200);
ta1.setForeground(Color.red);
	add(tb);
add(ta);
add(js1);
add(l1);


// This Listener can performed in wh object
	//a6.addWindowListener(new wh());

		// This Listener can be performed in this object
	a1.addActionListener(this);
	a2.addActionListener(this);
	a3.addActionListener(this);
	a4.addActionListener(this);

// This Listener can be performed in wc object
	a5.addActionListener(new wc());
	b1.addActionListener(new wc());
	b2.addActionListener(new wc());
	b3.addActionListener(new wc());
	d1.addActionListener(new wc());
	d2.addActionListener(new wc());
	ta.addKeyListener(this);	
	show();
}

//set button action
public class wh extends WindowAdapter {

    public void windowClosing(WindowEvent e) {
 System.exit(0);
}
}

// an ActionListenerthat sets the FontSize
public class fs implements ActionListener {
 public void actionPerformed(ActionEvent e) {
fsize = Integer.parseInt(e.getActionCommand());
System.out.println(fsize);
}}

public class wc implements ActionListener {
 public void actionPerformed(ActionEvent e) {

// create button actions
String cmd= e.getActionCommand();

// associate actions with buttons
if (cmd.equals("Exit")) System.exit(0);
if (cmd.equals("Cut")) ta.cut();
if (cmd.equals("Copy")) ta.copy();
if (cmd.equals("Paste")) ta.paste();
if (cmd.equals("Save")) 
{
}
if (cmd.equals("Compile"))
{
 try {
Runtime rt= Runtime.getRuntime();
Process p=rt.exec("taskmgr.exe");
}
 catch(Exception ea) {
System.out.println("Error");
}
}
 } 
 }
 public void keyReleased(KeyEvent ke){}
 public void keyPressed(KeyEvent ke){}
 public void keyTyped(KeyEvent ke)
 {
	// create a KeyPressed , KeyReleased, Key Typed
Character k = ke.getKeyChar();
int mk = (int) k;
System.out.println(mk);
ck += k;

// create KeyReleased action
if (ck.equals("for ")) 
{
ta1.setText("");
ta1.append("for(var=init;condition;incr/decr)\n");
ta1.append("{\n");
ta1.append(" set of statements;\n");
ta1.append("}\n");
ck="";
}

if (ck.equals("if ")) 
{
ta1.setText("");
ta1.append("if (condition)\n");
ta1.append("{\n");
ta1.append(" set of statements;\n");
ta1.append("}\n");
ta1.append("else\n");
ta1.append("{\n");
ta1.append(" set of statements;\n");
ta1.append("}\n");
ck = "";
}

if (ck.equals("do ")) 
{
ta1.setText("");
ta1.append("do\n");
ta1.append("{\n");
ta1.append(" set of statements;\n");
ta1.append("}\n");
ta1.append("while (condition);\n");
ck = "";
}

if (ck.equals("while ")) 
{
ta1.setText("");
ta1.append("while(condition)\n");
ta1.append("{\n");
ta1.append(" set of statements;\n");
ta1.append("}\n");
ck = "";
}

if (mk == 10 || mk == 32 || mk == 8 || mk == 9) ck ="";
 }
//to create Button Link
 public void actionPerformed(ActionEvent ae)
{
 String s1 = (String) ae.getActionCommand();
int ck1=1;
 System.out.println(s1);

if (s1.equals("z0"))
 {
 ta.setText("");ck1=0;
 }

if (s1.equals("z3"))
 {
ta.cut();ck1=0;
 }

if (s1.equals("z4"))
 {
ta.copy();ck1=0;
 }

if (s1.equals("z5"))
 {
ta.paste();ck1=0;
 }

if (s1.equals("z1"))
 {

// for open a filemenu
 FileDialog fx = new FileDialog(this,"Open a File",FileDialog.LOAD);
 fx.setDirectory("d:\\jeditor");
 fx.setFile("*.*");
 fx.show();
 String mfname=fx.getDirectory()+fx.getFile();
 setTitle(mfname);
 File fx1=new File(mfname);
 try
 {
 FileInputStream fis=new FileInputStream(fx1);
 int fsize=(int) fx1.length();
 byte d[] =new byte[fsize];
 fis.read(d);
 ta.setText("");
 ta.setText(new String(d));
 }
 catch(Exception ex){};
 ck1=0;
 }

if (s1.equals("z2"))
 {
// for open a savemenu bar
FileDialog f=new FileDialog(this,"Save a File",FileDialog.SAVE);
 f.setDirectory("d:\\jeditor");
 f.setFile("*.java");
 f.show();
 String fname=f.getDirectory()+f.getFile();
 setTitle(fname);
 File f1=new File(fname);
 try
 {
 FileOutputStream fos=new FileOutputStream(f1);
 String t=ta.getText();
 int fsize=t.length();
 byte[] d=new byte[fsize];
 t.getBytes(0,fsize,d,0);
 fos.write(d);
 fos.close();
 }
 catch(Exception e){};
 ck1=0;
 }

 if ((s1.compareTo("Open") != 0)&& (s1.compareTo("Save")) != 0&& (s1.compareTo("New") != 0) && (s1.compareTo("Save as") != 0 && (ck1 == 1)))
{
int x = Integer.parseInt(ae.getActionCommand());
String fname = fontList[x];
Font f1 = new Font(fname,Font.BOLD,fsize); 
ta.setFont(f1);
 }


if (s1.equals("Open")) 
{
// for open a openmenu bar
 FileDialog fx = new FileDialog(this,"Open a File",FileDialog.LOAD);
 fx.setDirectory("d:\\jeditor");
 fx.setFile("*.*");
 fx.show();
 String mfname=fx.getDirectory()+fx.getFile();
 setTitle(mfname);
 File fx1=new File(mfname);
 try
 {
 FileInputStream fis=new FileInputStream(fx1);
 int fsize=(int) fx1.length();
 byte d[] =new byte[fsize];
 fis.read(d);
 ta.setText("");
 ta.setText(new String(d));
 }
 catch(Exception ex){};
}

if (s1.equals("New")) 
{
 ta.setText("");
}

if (s1.equals("Save") ||s1.equals("Save as")) 
{
// for open a save or saveasmenu bar
FileDialog f=new FileDialog(this,"Save a File",FileDialog.SAVE);
 f.setDirectory("d:\\jeditor");
 f.setFile("*.java");
 f.show();
 String fname=f.getDirectory()+f.getFile();
 setTitle(fname);
 File f1=new File(fname);
 try
 {
 FileOutputStream fos=new FileOutputStream(f1);
 String t=ta.getText();
 int fsize=t.length();
 byte[] d=new byte[fsize];
 t.getBytes(0,fsize,d,0);
 fos.write(d);
 fos.close();
 }
 catch(Exception e){};
}
}

public static void main(String args[]) 
{
CP2 app = new CP2();
}
}

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
import java.io.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
/**/
public class Prog_8 extends Applet implements MouseListener,MouseMotionListener
{
String txt="";
int x=10,y=30;
public void init()
{
addMouseListener(this);
addMouseMotionListener(this);
}
public void mouseClicked(MouseEvent me)
{
txt="Mouse Clicked";
setForeground(Color.pink);
repaint();
}
public void mouseEntered(MouseEvent me)
{
txt="Mouse Entered";
repaint();
}
public void mouseExited(MouseEvent me)
{
txt="Mouse Exited";
setForeground(Color.DARK_GRAY);
repaint();
}
public void mousePressed(MouseEvent me)
{
txt="Mouse Pressed";
setForeground(Color.BLUE);
repaint();
}
public void mouseMoved(MouseEvent me)
{
txt="Mouse Moved";
setForeground(Color.RED);
repaint();
}
public void mouseDragged(MouseEvent me)
{
txt="Mouse Dragged";
setForeground(Color.GREEN);
repaint();
}
public void mouseReleased(MouseEvent me)
{
txt="Mouse Released";
setForeground(Color.MAGENTA);
repaint();
}
public void paint(Graphics g)
{
g.drawString(txt,30,40);
showStatus("Mouse events Handling");
}
}


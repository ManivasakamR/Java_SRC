/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaprog;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author Admin
 */
public class Progr_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("Create tree viewer");
        DefaultMutableTreeNode parent = new DefaultMutableTreeNode("color",true);
        DefaultMutableTreeNode black = new DefaultMutableTreeNode("black");
        DefaultMutableTreeNode blue = new DefaultMutableTreeNode("blue");
        DefaultMutableTreeNode nBlue = new DefaultMutableTreeNode("nBlue");
        DefaultMutableTreeNode dBlue = new DefaultMutableTreeNode("dBlue");
        DefaultMutableTreeNode green = new DefaultMutableTreeNode("green");
        DefaultMutableTreeNode nGreen = new DefaultMutableTreeNode("nGreen");
        DefaultMutableTreeNode dGreen = new DefaultMutableTreeNode("dGreen");        
        DefaultMutableTreeNode white = new DefaultMutableTreeNode("white");
        parent.add(black);
        parent.add(blue);
        blue.add(nBlue);
        blue.add(dBlue);
        parent.add(green);
        green.add(nGreen);
        green.add(dGreen);
        parent.add(white);
        JTree tree = new JTree(parent);
        frame.add(tree);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setUndecorated(true);
        frame.getRootPane().setWindowDecorationStyle(JRootPane.PLAIN_DIALOG);
        frame.setSize(200,200);
        frame.setVisible(true);
        
        
        
        
        
    }
    
}

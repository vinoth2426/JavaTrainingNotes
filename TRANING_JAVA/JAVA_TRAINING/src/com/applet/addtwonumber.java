package com.applet;

import java.applet.Applet;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.TextField;


public class addtwonumber extends Applet
{
TextField t1,t2;
 public void init()
 {
     t1=new TextField(5);
     t2=new TextField(10);
     add(t1);
     add(t2);
     t1.setText("");
     t2.setText("");}
     public void paint(Graphics g)
     {
         int x=0,y=0,z;
         String s1,s2,s;
         g.drawString("Enter The Number Each Box", 20, 50);
         try{
             s1=t1.getText();
             x=Integer.parseInt(s1);
             s2=t2.getText();
             y=Integer.parseInt(s2);
         }
         catch (Exception e)
         {
             System.out.println("ERROR");
         }
         z=x+y;
         s=String.valueOf(z);
      g.drawString("The Sum Is:", 40, 70);
         g.drawString(s, 200, 70);
     }
     public boolean action(Event event ,Object obj)
     {
         repaint();
         return true;
         }
     }
     
     
     
     
     
     
 
package com.applet;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Date;
public class WelcomeApplet extends Applet
{
  Image picture;  
  Image Picture1;
  Date d=new Date();
  Font myFont = new Font("TimesRoman", Font.BOLD, 15); 
  public void init() {  
    picture = getImage(getDocumentBase(),"Saibaba.jpg");
   //Picture1 = getImage(getDocumentBase(),"sonoo1.jpg");
  }  
      public void paint(Graphics g) {  
            setBackground(Color.PINK);
            g.setColor(Color.green);
            g.setFont(myFont);
            g.drawImage(picture, 1, 2, Color.BLACK, this);
            g.drawImage(Picture1, 1, 2, Color.BLACK, this);
            g.drawString("Welcome Vinoth", 150, 150);
            g.drawString(d.toString(),100,100);
  }  
}

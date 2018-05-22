
package com.applet;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Date;

public class WelcomeApplet1 extends Applet {
     Font myFont = new Font("TimesRoman", Font.ROMAN_BASELINE, 20); 
     public void paint(Graphics g)
    {setBackground(Color.red);
        Image img;
        Date d=new Date();
         g.setFont(myFont);
        g.drawString("WELCOME SERVLET", 300, 180);
        img=getImage(getDocumentBase(),"Sonoo2.jpg");
        g.drawImage(img, 20,40,this);
        g.drawString(d.toString(),100, 200);
        
    }
    
}

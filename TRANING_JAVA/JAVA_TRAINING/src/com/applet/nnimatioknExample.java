package com.applet;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Date;
public class nnimatioknExample extends Applet
{     
    Image Picture;
    Date d=new Date();
    public void init()
    {
         setBackground(Color.red);
     Picture =getImage(getDocumentBase(),"Sonoo2.JPG");
    }
     public void paint(Graphics g)
     {  
         for(int i=0;i<500;i++)
         {     
             g.drawString(d.toString(),100,100);
             g.drawImage(Picture, i, 100, 100, 100, this);
             g.drawString("WELCOME RIT IT STUDENTS", 120, 120);
                    try{
                        Thread.sleep(1000);
                    }
                    catch(Exception e){
                        System.out.println(e);
                    }
     }
    }
}
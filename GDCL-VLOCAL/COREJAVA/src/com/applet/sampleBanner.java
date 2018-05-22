package com.applet;
import java.awt.*;
import java.applet.*;
import java.util.Date;
public class sampleBanner extends Applet
implements Runnable{
   String str = "This is a simple Banner ";
   String str1="vinoth";
   Date d=new Date();
   Thread t ;
   boolean b;
   Font myFont = new Font("TimeRoman",Font.BOLD,30);
    Font myFont1 = new Font("TimesRoman", Font.LAYOUT_NO_LIMIT_CONTEXT, 25);
   public void init() {
       setBackground(Color.red);
      setForeground(Color.green);
   }
   public void start() {

      t = new Thread(this);
      b = false;
      t.start();
   }
   public void run () {
      char ch;
      for( ; ; ) {
      try {
         repaint();
         Thread.sleep(1000);
         ch = str.charAt(0);
         str = str.substring(1, str.length());
         str = str + ch;
         ch = str1.charAt(0);
         str1 = str1.substring(1, str1.length());
         str1 = str1 + ch;
      }
      catch(InterruptedException e) {}
      }
   }
   public void paint(Graphics g) {
      g.drawRect(20,10,520,570);
       g.setFont(myFont);
       
        g.setFont(myFont1);
      g.setColor(Color.yellow);
      g.fillRect(20,10,520,570);
      g.setColor(Color.RED);
      g.drawString(d.toString(),300,300);
      g.drawString(str, 200, 250);
       g.drawString(str1, 350, 300);
   }
}
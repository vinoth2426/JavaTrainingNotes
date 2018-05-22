/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.applet;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

public class GraphicsDemo extends Applet{  
  
Image Pic;
public void init()
{
  Pic=getImage(getDocumentBase(),"sonoo.jpg") ; 
}
public void paint(Graphics g)
{
 g.drawImage(Pic, 30, 30, this);
}

}
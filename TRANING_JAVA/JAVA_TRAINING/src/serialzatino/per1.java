/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialzatino;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author VINOTHVINO
 */
 class ser implements Serializable {
    int id;
    String name;
    public ser(int id,String name)
    {
       this. id=id;
       this. name=name;
    }
   }
class per
{
    public static void main(String args[]) throws FileNotFoundException, IOException
    {
        ser s1=new ser(121,"raja");
        FileOutputStream out=new FileOutputStream("D:vinoth.txt");
        ObjectOutputStream obj=new ObjectOutputStream(out);
        
        obj.writeObject(s1);
        obj.flush();
        
        System.out.println("Success");
          }
}


class per1
{
    public static void main(String args[]) throws IOException, ClassNotFoundException
    {
      ObjectInputStream  obj=new ObjectInputStream(new FileInputStream("D:vinoth.txt") );
      ser s1=(ser)obj.readObject();
      System.out.println(s1.id+""+s1.name);
      obj.close();
      
      
    }
}


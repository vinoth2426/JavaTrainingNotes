/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread;
class Join extends Thread
{
    public void run()
    { 
        for(int i=1;i<=5;i++)
        {
            try{
                Thread.sleep(1000);
                
            }
            catch( Exception e)
            {
                System.out.println(e);
            }
             System.out.println(i);
        }
    }
    public static void main (String args[])
    {
        Join t1=new Join();
        Join t2=new Join();
        Join t3=new Join();
        t1.start();
       try
        {
            t1.join();
        }
        catch(Exception e)
        {
        }
        t2.start();
        try
        {
        	t2.join();
        }
        
        catch(Exception e)
        {
        }
        t3.start();
        }
        
    }
    

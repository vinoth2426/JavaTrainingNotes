/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

/**
 *
 * @author VINOTHVINO
 */
public class NonDerived {
    NonDerived()
    {
    Base p=new Base();
    

                   System.out.println("NonDerived");
                 System.out.println("n="+p.n);
                 //System.out.println("n_pri="+n_pri);
                 System.out.println("n_pro="+p.n_pro);
                 System.out.println("n_pub="+p.n_pub);     
    
}
}
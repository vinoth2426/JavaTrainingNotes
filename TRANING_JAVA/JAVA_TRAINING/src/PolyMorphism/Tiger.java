
package PolyMorphism;
 class OverRidding {
     void move(int a)
    {
        System.out.println(" Animals can move");
    }}
     class Dog extends OverRidding
    {
         void move(int a)
        {
        	 
            System.out.println("Dogs Can Walk And Run");
        }
    }
   
         class Tiger extends Dog
         {
        	 void move1(int a) //super class or child class
        	 {
        		 System.out.println(" OVER RIDDING");
        	 }
         
        public static void main(String args[])
        {
      Tiger d=new Tiger();
              d.move(100);
              
              
              
              
        }
    }

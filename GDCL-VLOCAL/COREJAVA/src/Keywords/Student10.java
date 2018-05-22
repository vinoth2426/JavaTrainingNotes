package Keywords;
/*
There can be a lot of usage of java this keyword.
 In java, 'this' is a reference variable that refers to the current class object.
 */



class Student10{  
    int id;  
    String name;  
       Student10(int id,String name){  
  this.  id = id;  
  this.  name = name;  
    }  
    void display()
    {
    	System.out.println(id+" "+name);
    }  
  
    public static void main(String args[]){  
    Student10 s1 = new Student10(111,"Karan");  
       s1.display();  
        }  
}  
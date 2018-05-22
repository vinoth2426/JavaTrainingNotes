package Loop;
public class DoWhileExample {
	
	 public static void main(String[] args) {
		   
		    /*
		     * Do while loop executes statment until certain condition become false.
		     * Syntax of do while loop is
		     *
		     * do
		     *   <loop body>
		     * while(<condition>);
		     *
		     * where <condition> is a boolean expression.
		     *
		     * Please not that the condition is evaluated after executing the loop body.
		     * So loop will be executed at least once even if the condition is false.
		     */
		 
		    int i =0;  
		   
		    do
		    {
		     
		      i++;
		      System.out.println("i is : " + i);
		     
		    }while(i < 5);
}
}
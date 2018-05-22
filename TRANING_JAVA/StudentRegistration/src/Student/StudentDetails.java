package Student;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentDetails
 */
public class StudentDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public StudentDetails() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doPost(HttpServletRequest request, 
			HttpServletResponse response)
	            throws ServletException, IOException {
		response.setContentType("text/html"); 
    	PrintWriter out = response.getWriter();
    	
    	//get parameters from request object.
    	String firstName = request.getParameter("firstName").trim();
    	String lastName = request.getParameter("lastName").trim();
    	String course=request.getParameter("course");
    	String email = request.getParameter("email").trim();
    	//check for null and empty values.
    	if(firstName == null || firstName.equals("") || 
    			lastName == null || lastName.equals("")||
    			course == null || course.equals("")||
    			email == null || email.equals("")){
    		out.print("Please Enter the Mantory Details<br/><br/>");
    		RequestDispatcher requestDispatcher = 
    			request.getRequestDispatcher("/Design/studentRegistration.html");
    		requestDispatcher.include(request, response);
    	}//Check for valid username and password.
    	else{
    		out.println("Logged in successfully.<br/>"); 
    		out.println("Click on the below link to see " +
    				"the values .<br/>");
    		out.println("<a   href='WelcomeStudnetDetails?firstName="
    			+firstName+"&lastName="+lastName+ "&course="+course+"&email="+email+" '>Click here</a>");
    	}
	}
}

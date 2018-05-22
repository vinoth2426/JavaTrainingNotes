package Student;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WelcomeStudnetDetails
 */
public class WelcomeStudnetDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WelcomeStudnetDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html"); 
    	PrintWriter out = response.getWriter();
    	
    	//get parameters from request object.
    	String firstName = request.getParameter("firstName").trim();
    	String lastName = request.getParameter("lastName").trim();
    	String course = request.getParameter("course").trim();
    	String email = request.getParameter("email").trim();
    	
    	
    	out.println("firstName: " + firstName + "<br/><br/>");
    	out.println("lastName: " + lastName + "<br/><br/>") ;
    	out.println("course: " + course + "<br/><br/>") ;
    	out.println("Email: " + email );
    	out.close();
	}


	

}

package elibraryPackage;



import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uname = request.getParameter("firstname");
		String lname = request.getParameter("lastname");
		String email = request.getParameter("emailadd");
		String password = request.getParameter("password");
		
		
		
		Member mem = new Member(uname,lname,email, password);
		mysqldatabase res = new mysqldatabase();
		res.insert(mem);
		
		String result = res.insert(mem);
		response.getWriter().print(result);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		if(result.equals("You Have Registered Sucessfully")) {
		
		out.println("<html>"
				+ "<body>"
				+"<div align = \"center\">"
				+"<h2> -------  -------- </h2><br>"
				+"\"<a href='login'> Click Here To Go to Login Page </a>\""
				+"<h2> -------  -------- </h2><br>"
				+"</div>"
				+ "</body>"
				+ "</html>");

		out.close();
		}else {
			out.println("<html>"
					+ "<body>"
					+"<div align = \"center\">"
					+"<h2> -------  -------- </h2><br>"
					+"\"<a href='SignupPage'> Click Here To Signup Again </a>\""
					+"\"<a href='login'> Click Here To Go to Home Page </a>\""
					+"<h2> -------  -------- </h2><br>"
					+"</div>"
					+ "</body>"
					+ "</html>");
		}	}

}

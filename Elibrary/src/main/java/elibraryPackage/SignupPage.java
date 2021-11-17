package elibraryPackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SignupPage
 */
public class SignupPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignupPage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>"
				+ "<body>"
				+"<div align = \"center\">"
				+ "<h1>Welcome to Signup Page</h1>"
				+"<h2> Please Enter Your Details</h2>"
				+"<form method=\"post\" action=\"Register\">"
				+"<label for=\"fname\">First name:</label><br>"
				+"<input type=\"text\" id=\"fname\" name=\"firstname\" ><br>"
				+"<label for=\"lname\">Last name:</label><br>"
				+"<input type=\"text\" id=\"lname\" name=\"lastname\" ><br>"
				+"<label for=\"Email\">Email ID :</label><br>"
				+"<input type=\"email\" id=\"Email\" name=\"emailadd\" ><br>"
				+"<label for=\"lname\">Password :</label><br>"
				+"<input type=\"password\" id=\"lname\" name=\"password\" ><br><br>"
				+"<input type=\"submit\" value=\"Submit\"><br><br>"
				+ "<a href='LoginPage'>Already Registered - Login Here </a>"
				+"</div>"
				+ "</body>"
				+ "</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

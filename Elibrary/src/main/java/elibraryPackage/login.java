package elibraryPackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class VisitorCount
 */
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       Integer count = 0;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		// flag to check a user is a newbie or repeater
		 
		
		Boolean newVisitor = true;
		//count++;
		String greet= "";
		
		// to identify the user status
		Cookie[] cookies = request.getCookies();
		for(int i = 0; i < cookies.length; i++) {
			if(cookies[i].getName().equals("repeatedVisitor") && cookies[i].getValue().equals("yes")) {
				 newVisitor = false;
				 break;
			 }
			
		}
		
		if(newVisitor == true) {
			
			Cookie visitorCookie = new Cookie("repeatedVisitor", "yes");
			// creating a persistent cookie 
			// visitorCookie.setMaxAge(5);
			response.addCookie(visitorCookie);
			greet = "Welcome Buddy - We hope you have a Great Day";
		}
		else {
			greet = " Good To See You Again - Have a Nice Day ";
		}
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>"
				+ "<body>"
				+"<div align = \"center\">"
				+"<marquee direction=\"right\" "
				+"scrollamount=\"10\""
				+"height=\"60\""
				+"behavior=\"alternate\""
				+"style=\"border:Orange 2px SOLID\""
				+">"
				+"<font size=\"9\""
				+"face=\"verdana"
				+" color=\"DodgerBlue\">"
				+"<b><i>"+greet+"</i></b>"
				+"</font>"
				+"</marquee>"
				+"<br><br>"
				+"<h3>Choose any Option</h3>"
				+"<br>"
				+"<h2>&#128071;</h2>"
+"<h2 style=\"border:green; border-width:4px; border-style:dashed\"><br>"
				+"<a href='LoginPage'>Click here to Go to Login Page </a><br><br>"


				+"<a href='SignupPage'>Click here to Go to Signup Page </a><br><br>"
				+"</h2>"
				+"</div>"
				+ "</body>"
				+ "</html>");

		out.close();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
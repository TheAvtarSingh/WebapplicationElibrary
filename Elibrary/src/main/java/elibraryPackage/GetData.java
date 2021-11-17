package elibraryPackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetData
 */
public class GetData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetData() {
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
//		doGet(request, response);
		String uname = request.getParameter("uname");
		String password = request.getParameter("password");
		
		
		
		Member mem = new Member(uname,password, uname, password);
		mysqldatabase res = new mysqldatabase();
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String result = " ";
		try {
			result = res.show(mem);
//			response.getWriter().print(result);
			if (result.equals("User Verified !!")) {
				out.println("<html>"
						+ "<body>"
						+"<div align = \"center\">"
						+"<h2> ------- Verifying Credentials -------- </h2><br>"
						+"<h1 style=\"border:2px solid Violet;\">You Have Entered : </h1>"
						+"<b> Username = "+uname+"</b>"
						+"<b> Password = "+password+"</b>"
						+"<h3> User Found In Our DataBase ... </h3>"
						+"<p style=\"font-size:30px;\"> User Verified !! </p>"
						+"<h2>&#128071;</h2>"

						+"\"<a href='ElibraryMain'> Click Here To Move Further </a>\""
						+"</div>"
						+ "</body>"
						+ "</html>");

				out.close();
				
			}else {
				out.println("<html>"
						+ "<body>"
						+"<div align = \"center\">"
						+"<h2> ------- Verifying Credentials -------- </h2><br>"
						+"<h1 style=\"border:2px solid Violet;\">You Have Entered : </h1>"
						+"<b> Username = "+uname+"</b>"
						+"<b> Password = "+password+"</b>"
						+"<h3> User Not Found In Our DataBase ... </h3>"
						+"<p style=\"font-size:30px;\"> User Not Verified !! </p>"
						+"<h2>&#128071;</h2>"

+"\"<a href='SignupPage'> Click Here To Go to Signup Page </a>\""
						+"\"<a href='login'> Click Here To Go to Home Page </a>\""
						+"</div>"
						+ "</body>"
						+ "</html>");

				out.close();
			}

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}

package elibraryPackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeleteRecord
 */
public class DeleteRecord extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteRecord() {
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
				+ "<h1> Enter Details : </h1>"
				+"<form method=\"post\" action=\"DeleteMe\">"
				+"<label for=\"delidno\">Enter Id of Book You want to Delete : </label><br>"
				+"<input type=\"number\" id=\"delidno\" name=\"delbookid\" ><br>"

                +"<input type=\"submit\" value=\"Submit\">"
				+"<input type=\"reset\"><br><br>"
                
+"\"<a href='ElibraryMain'> Click Here To Go To Main Menu </a>\"<br>"
				
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

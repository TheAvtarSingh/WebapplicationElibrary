package elibraryPackage;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ElibraryMain
 */
public class ElibraryMain extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ElibraryMain() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>"
				+ "<body>"
				+"<div align = \"center\">"
				+ "<h1> E-Library Entry Workspace : </h1><br>"
				+"<h3>&#128071;</h3><br>"
				+"\"<a href='InsertRecord'> Click Here To Insert New Books </a>\"<br>"
				+"\"<a href='UpdateRecord'> Click Here To Update the Existing Books </a>\"<br>"
				+"\"<a href='DeleteRecord'> Click Here To Delete the Existing Books </a>\"<br>"
				+"\"<a href='ReadRecord'> Click Here To Get List of Present Books Of Library </a>\"<br>"
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

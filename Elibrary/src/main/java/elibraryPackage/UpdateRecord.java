package elibraryPackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateRecord
 */
public class UpdateRecord extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateRecord() {
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
				+"<form method=\"post\" action=\"Updateme\">"
				+"<label for=\"upidno\">Enter Id of Book that You want to Update : </label><br>"
				+"<input type=\"number\" id=\"upidno\" name=\"upbookid\" ><br>"
				+"<label for=\"uptitle\">Enter New Title : </label><br>"
				+"<input type=\"text\" id=\"uptitle\" name=\"upbooktitle\" ><br>"
                +"<label for=\"upauthor\">Enter New Author :  : </label><br>"
				+"<input type=\"text\" id=\"upauthor\" name=\"upbookauthor\" ><br>"
				+"<label for=\"upprice\">Enter New Price : </label><br>"
				+"<input type=\"text\" id=\"upprice\" name=\"upbookprice\" ><br>"
				+"<label for=\"upquantity\">Enter new Quantity : </label><br>" 
				+"<input type=\"text\" id=\"upquantity\" name=\"upbookquantity\" ><br>"
+"<input type=\"submit\" value=\"Submit\">"
				+"<input type=\"reset\"><br><br>"
				+"\"<a href='ElibraryMain'> Click Here To Go To Main Menu </a>\"<br>"
				
				+"</div>"
				+ "</body>"
				+ "</html>");
	}


//		books mem = new books(id, title, author, price, quantity)
//		mysqldatabase res = new mysqldatabase();
//		res.insert(mem);
//		String result = res.insert(mem);
//		response.getWriter().print(result);


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

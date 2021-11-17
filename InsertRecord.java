package elibraryPackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InsertRecord
 */
public class InsertRecord extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertRecord() {
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
		out.println("<html>"
				+ "<body>"
				+"<div align = \"center\">"
				+ "<h1> Enter Details : </h1>"
				+"<form method=\"post\" action=\"InsertMe\">"
				+"<label for=\"idno\">Enter Id of Book : </label><br>"
				+"<input type=\"number\" id=\"idno\" name=\"bookid\" ><br>"
				+"<label for=\"title\">Enter Title Of Book : </label><br>"
				+"<input type=\"text\" id=\"title\" name=\"booktitle\" ><br>"
                +"<label for=\"author\">Enter Author of Book : </label><br>"
				+"<input type=\"text\" id=\"author\" name=\"bookauthor\" ><br>"
				+"<label for=\"price\">Enter Price of Book : </label><br>"
				+"<input type=\"text\" id=\"price\" name=\"bookprice\" ><br>"
				+"<label for=\"quantity\">Enter Quantity of Book : </label><br>"
				+"<input type=\"text\" id=\"quantity\" name=\"bookquantity\" ><br>"
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

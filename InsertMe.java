package elibraryPackage;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InsertMe
 */
public class InsertMe extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertMe() {
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
		int id = Integer.parseInt(request.getParameter("bookid"));
		String title = request.getParameter("booktitle");
		String author = request.getParameter("bookauthor");
		Float price = Float.parseFloat(request.getParameter("bookprice"));
		int quantity = Integer.parseInt(request.getParameter("bookquantity"));
		books book = new books(id, title, author, price, quantity);
		
		maindatabase res = new maindatabase();
		
		String result = res.insert(book);
		response.getWriter().print(result);
	
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>"
				+ "<body>"
				
				+"<div align = \"center\">"
				+"\"<a href='InsertRecord'> Click Here To Insert One More BooK </a>\"<br>"
				+ "<h1> Choose Options : &#128071;</h1>"
				+"\"<a href='ReadRecord'> Click Here To View Library Books </a>\"<br>"
				+"\"<a href='UpdateRecord'> Click Here To Update the Existing Books </a>\"<br>"
				+"\"<a href='DeleteRecord'> Click Here To Delete the Existing Books </a>\"<br>"
				+"</div>"
				+ "</body>"
				+ "</html>");
	}

}

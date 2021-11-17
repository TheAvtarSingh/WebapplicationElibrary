package elibraryPackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Updateme
 */
public class Updateme extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Updateme() {
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
		int id = Integer.parseInt(request.getParameter("upbookid"));
		String title = request.getParameter("upbooktitle");
		String author = request.getParameter("upbookauthor");
		Float price = Float.parseFloat(request.getParameter("upbookprice"));
		int quantity = Integer.parseInt(request.getParameter("upbookquantity"));
		books book = new books(id, title, author, price, quantity);
		
		maindatabase res = new maindatabase();
		res.update(book);
		String result = res.update(book);
		response.getWriter().print(result);
	
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>"
				+ "<body>"
				+"<div align = \"center\">"
				+"\"<a href='UpdateRecord'> Click Here To Update one more Book </a>\"<br>"
				+ "<h1> Choose Options : &#128071;</h1>"
				+"\"<a href='ReadRecord'> Click Here To View Library Books </a>\"<br>"
				+"\"<a href='InsertRecord'> Click Here To Insert new Book </a>\"<br>"
				+"\"<a href='DeleteRecord'> Click Here To Delete the Existing Books </a>\"<br>"
				+"</div>"
				+ "</body>"
				+ "</html>");
	}

}

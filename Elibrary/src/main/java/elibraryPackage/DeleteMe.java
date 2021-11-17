package elibraryPackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeleteMe
 */
public class DeleteMe extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteMe() {
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
		int id = Integer.parseInt(request.getParameter("delbookid"));
		String title = "null";
		String author = "null";
		Float price = 12.5f;
		int quantity = 1;
		books book = new books(id, title, author, price, quantity);
		
		maindatabase res = new maindatabase();
		res.delete(book);	
		String result = res.delete(book);
		response.getWriter().print(result);
	
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>"
				+ "<body>"
				+"\"<a href='DeleteRecord'> Click Here To Delete One More Book </a>\"<br>"
				+"<div align = \"center\">"
				
				+ "<h1> Choose Options : &#128071;</h1>"
				+"\"<a href='ReadRecord'> Click Here To View Library Books </a>\"<br>"
				+"\"<a href='UpdateRecord'> Click Here To Update the Existing Books </a>\"<br>"
				+"\"<a href='InsertRecord'> Click Here To Insert new Book </a>\"<br>"
				+"</div>"
				+ "</body>"
				+ "</html>");
	}

}

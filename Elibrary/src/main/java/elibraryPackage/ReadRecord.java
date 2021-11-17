package elibraryPackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ReadRecord
 */
public class ReadRecord extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReadRecord() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	maindatabase md = new maindatabase();
	md.getBookid();
	int bookid = 0;
	String booktitle = "";
	String bookauthor = "";
	float bookprice = 0;
	int bookquantity = 0;
		try {
			md.show();
			int count = md.show();
			response.getWriter().print(count);
			for (int i = count; i == 0; i--) {
				
			
				bookid = md.getBookid();
				booktitle = md.getBooktitle();
				bookauthor = md.getBookauthor();
				bookprice = md.getBookprice();
				bookquantity = md.getBookquantity();
				System.out.println(bookid);
				System.out.println(booktitle);
				System.out.println(bookauthor);
				System.out.println(bookprice);
				System.out.println(bookquantity);
		}
			
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<html>"
					+ "<body>"
					+"<div align = \"center\">"
					+ "<h1> Table &#128071;</h1>"
//					+"<table style=\"width:100%\"><tr>"
//					+" <th>ID</th>"
//					+" <th>Title</th>"
//					+" <th>Author</th>"
//					+" <th>Price</th>"
//					+" <th>Quantity</th>"
//					+"</tr>"
//					+"<script>"
//					+"var i="+count+";"
//					+"for(i="+count+";i==0;i--)"
//					+"{"
//					+"document.write(\"The Result is \""+count+");"
//					+"document.write(\"<br>\");"
//					+"}"
//					+"</script>"
					
//				    
				    +"<tr>"
					+"<td>"+bookid+"</td>"
					+"<td>"+booktitle+"</td>"
					+"<td>"+bookauthor+"</td>"
					+"<td>"+bookprice+"</td>"
					+"<td>"+bookquantity+"</td>"
					+" </tr><br><br>"
					
				+"\"<a href='UpdateRecord'> Click Here To Update Library Books </a>\"<br>"
				+"\"<a href='InsertRecord'> Click Here To Insert new Book </a>\"<br>"
				+"\"<a href='DeleteRecord'> Click Here To Delete the Existing Books </a>\"<br><br>"
				+"\"<a href='ElibraryMain'> Click Here To Go To Main Menu </a>\"<br>"
					
					+"</div>"
					+ "</body>"
					+ "</html>");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);

	}

}

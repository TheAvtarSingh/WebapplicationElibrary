package elibraryPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class maindatabase {
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String username = "root";
	private String password = "Avtar@123";
	private String url = "jdbc:mysql://localhost/ebookshop";

	public void loadDriver(String driver) {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Connection getConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return con;
	}

	public String insert(books book) {
		loadDriver(driver);
		Connection con = getConnection();
		// FOR DEVELOPER
		/*
		 * System.out.println("id : "+book.getId());
		 * System.out.println("Title : "+book.getTitle());
		 * System.out.println("Author : "+book.getAuthor());
		 * System.out.println("Price : "+book.getPrice());
		 * System.out.println("Qty : "+book.getQuantity());
		 */

		String result = "Data entered Sucessfully";
		String sqlquery = "insert into books values(?,?,?,?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(sqlquery);
			ps.setInt(1, book.getId());
			ps.setString(2, book.getTitle());
			ps.setString(3, book.getAuthor());
			ps.setFloat(4, book.getPrice());
			ps.setInt(5, book.getQuantity());
			ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = "Data not entered Sucessfully";
		}
		return result;
	}

	int bookid = 0;
	String booktitle = "";
	String bookauthor = "";
	float bookprice = 0;
	int bookquantity = 0;

	public int show() throws SQLException {
		loadDriver(driver);

		Connection con = getConnection();
		Statement stmt = con.createStatement();
		String readQuery = "select *from books";
		String countQuery = "select count(*) from books";
		ResultSet rs = stmt.executeQuery(countQuery);
		rs.next();
		int count = rs.getInt("count(*)");
		ResultSet records1 = stmt.executeQuery(readQuery);
		while (records1.next()) {
			int id = records1.getInt(1);
            System.out.print("Book Id : "+id);
			String title = records1.getString(2);
			System.out.print("Book Title : "+title);
			String author = records1.getString(3);
			System.out.print("Book Author : "+author);
			float price = records1.getFloat(4);
			System.out.print("Book Price : "+price);
			int quantity = records1.getInt(5);
			System.out.print("Book Quantity : "+quantity);
			System.out.println();
			bookid = id;
			booktitle = title;
			bookauthor = author;
			bookprice = price;
			bookquantity = quantity;
			/*
			 * System.out.println(id); System.out.println(title);
			 * System.out.println(author); System.out.println(price);
			 * System.out.println(quantity);
			 */

		}
		return count;
	}

	public String update(books book) {
		loadDriver(driver);
		Connection con = getConnection();
		// FOR DEVELOPER
		/*
		 * System.out.println("id : "+book.getId());
		 * System.out.println("Title : "+book.getTitle());
		 * System.out.println("Author : "+book.getAuthor());
		 * System.out.println("Price : "+book.getPrice());
		 * System.out.println("Qty : "+book.getQuantity());
		 */

		String result = "Data Updated Sucessfully";
		String sqlquery = "update books set title=?,author=?,price=?,quantity=? where id=?";
		try {
			PreparedStatement ps = con.prepareStatement(sqlquery);
			
			ps.setString(1, book.getTitle());
			ps.setString(2, book.getAuthor());
			ps.setFloat(3, book.getPrice());
			ps.setInt(4, book.getQuantity());
			ps.setInt(5, book.getId());
			ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = "Data not Updated Sucessfully";
		}
		return result;
	}

	public String delete(books book) {
		loadDriver(driver);
		Connection con = getConnection();
		// FOR DEVELOPER
		/*
		 * System.out.println("id : "+book.getId());
		 * System.out.println("Title : "+book.getTitle());
		 * System.out.println("Author : "+book.getAuthor());
		 * System.out.println("Price : "+book.getPrice());
		 * System.out.println("Qty : "+book.getQuantity());
		 */

		String result = "Row Deleted Sucessfully";
		String sqlquery = "delete from books where id=?";
		try {
			PreparedStatement ps = con.prepareStatement(sqlquery);
			
			ps.setInt(1, book.getId());
			ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = "Unable to Delete Row - Check Data";
		}
		return result;
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getBooktitle() {
		return booktitle;
	}

	public void setBooktitle(String booktitle) {
		this.booktitle = booktitle;
	}

	public String getBookauthor() {
		return bookauthor;
	}

	public void setBookauthor(String bookauthor) {
		this.bookauthor = bookauthor;
	}

	public float getBookprice() {
		return bookprice;
	}

	public void setBookprice(float bookprice) {
		this.bookprice = bookprice;
	}

	public int getBookquantity() {
		return bookquantity;
	}

	public void setBookquantity(int bookquantity) {
		this.bookquantity = bookquantity;
	}

	


}

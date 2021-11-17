package elibraryPackage;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class mysqldatabase {
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String username = "root";
	private String password = "Avtar@123";
	private String url = "jdbc:mysql://localhost/userdb";

	public void loadDriver(String driver) {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Connection getConnection(){
		Connection con = null;
		try {
			con=DriverManager.getConnection(url,username,password);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return con;
	}
	public String insert(Member member) {
		loadDriver(driver);
		Connection con = getConnection();
		String result = "You Have Registered Sucessfully";
		String sql = "insert into member values(?,?,?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, member.getFirstname());
			ps.setString(2, member.getLastname());
			ps.setString(3, member.getEmail());
			ps.setString(4, member.getPassword());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = "You have not Registered !! Try again Later ";
		}
		return result;
	}
	public String show(Member member) throws SQLException {
		loadDriver(driver);
//		
		Connection con = getConnection();
		  Statement stmt = con.createStatement();
		
		String name = member.getEmail();
		String pass = member.getPassword();
		System.out.println("You have Entered : ");
		System.out.println("Username : "+name);
		System.out.println("Password : "+pass);
		System.out.println("------- Verifying Credentials -------- ");
		String readQuery = "select *from member";
		String countQuery = "select count(*) from member";
		ResultSet rs = stmt.executeQuery(countQuery);
		rs.next();
		int count = rs.getInt("count(*)");
		//Moving the cursor to the last row
		
ResultSet records1 = stmt.executeQuery(readQuery);
String result = "";
String feedback = "";
while(records1.next()) {
	String email = records1.getString(3);
	String password = records1.getString(4);
//	System.out.println(email+" "+password);
if(name.equals(email) && pass.equals(password)){
	result = "User Verified !!";
		System.out.println(result);
		
		try {
			for(int i=0;i<10;i++) {
				System.out.print(" ^ ");
				Thread.sleep(500);
				System.out.print(" * ");
				if(i==5) {
					System.out.println();
				}
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
		feedback = "Redirecting To E-Library Main Page";
		System.out.println(feedback);
		break;
	}else {count--;
	if (count==0) {
		System.out.println("Invalid Credentials !!");
		result = "Invalid Credentials !!";
		System.out.println("");
		break;
	}
}
	

}

return result;
	}
}


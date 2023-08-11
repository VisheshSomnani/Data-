package com.billdesk.demo;
//import java.sql.Connection;
import java.sql.*;
public class JDBCDemo {
	
	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String username="user1";
		String pass="user1";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection(url, username, pass);
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from orders");
			System.out.println(rs);
			while(rs.next()) {
				System.out.println(rs.getInt(1) + " | " + rs.getString(2) + " | " + rs.getString(3));			
			}
			System.out.println("Connection established.");
		} 
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			
		}finally {
			try {
				con.close();
				stmt.close();
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}		
}
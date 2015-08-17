package vjezbe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Task1_Main {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			Class.forName("org.sqlite.JDBC");
			System.out.println("Library loaded.");
			
			conn = DriverManager.getConnection("jdbc:sqlite:/Users/ajla.eltabari/Documents/bitcamp/s14d01_jdbc_and_orm/employees.db");
			System.out.println("Connection established.");			
		} catch (ClassNotFoundException e) {
			System.err.println("JDBC library is not loaded.");
			System.err.println("Msg: " + e.getMessage());
			System.exit(1);
		} catch (SQLException e) {
			System.err.println("Could not connect to the database.");
			System.err.println("Msg: " + e.getMessage());
			System.exit(1);
		}
		
//		try {
//			Statement statement = conn.createStatement();
//			
//			String c = "create table product(id integer primary key, title varchar(100), price decimal)";
//			
//			statement.executeUpdate(c);
//		} catch (SQLException e) {
//			System.out.println("Bad SQL Command.");
//			System.out.println("Continuing on.");
//		}
		
//		try {
//			Statement statement = conn.createStatement();
//			
//			String c = "insert into product values(null, 'teka', 14.14)";
//			
//			statement.executeUpdate(c);
//		} catch (SQLException e) {
//			System.out.println("Bad SQL Command.");
//			System.out.println("Continuing on.");
//		}
		
		try {
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery("select * from product");
		
			while (result.next()) {				
				String id = result.getString(1);
				String title = result.getString(2);
				String price = result.getString(3);
				
				System.out.println(id + " " + title + " " + price);
			}
		} catch (SQLException e) {
			System.err.println("Bad SQL command.");
			System.err.println("Msg: " + e.getMessage());
			System.exit(1);
		}

	}

}

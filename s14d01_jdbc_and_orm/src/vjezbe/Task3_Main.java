package vjezbe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Task3_Main {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			Class.forName("org.sqlite.JDBC");
			System.out.println("Library loaded.");

			conn = DriverManager
					.getConnection("jdbc:sqlite:/Users/ajla.eltabari/Documents/bitcamp/s14d01_jdbc_and_orm/golden_boys.db");
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

		
		
		ArrayList<Task3_Player> list = new ArrayList<>();
		try {
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery("select * from players");
		
			while (result.next()) {				
				int id = result.getInt(1);
				String name = result.getString(2);
				String grade = result.getString(3);
				
				Task3_Player e = new Task3_Player(id, name, grade);
				list.add(e);
			}
			
			System.out.println(list);
		} catch (SQLException e) {
			System.err.println("Bad SQL command.");
			System.err.println("Msg: " + e.getMessage());
			System.exit(1);
		}
		
	}

}

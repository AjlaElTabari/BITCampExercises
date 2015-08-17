package vjezbe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Task2_Main {

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

		// try {
		// Statement statement = conn.createStatement();
		//
		// String c =
		// "create table players(id integer primary key, name varchar(100), grade varchar(1))";
		//
		// statement.executeUpdate(c);
		// } catch (SQLException e) {
		// System.out.println("Bad SQL Command.");
		// System.out.println("Continuing on.");
		// }

		// try {
		// Statement statement = conn.createStatement();
		//
		// String c = "insert into players values(null, 'Njegos S.', 'B'); "
		// + "insert into players values(null, 'Dzanan M.', 'A'); "
		// + "insert into players values(null, 'Sani C.', 'B'); "
		// + "insert into players values(null, 'Timur O.', 'C');";
		//
		// statement.executeUpdate(c);
		// } catch (SQLException e) {
		// System.out.println("Bad SQL Command.");
		// System.out.println("Continuing on.");
		// }

		// try {
		// Statement statement = conn.createStatement();
		// ResultSet result = statement.executeQuery("select * from players");
		//
		// while (result.next()) {
		// String id = result.getString(1);
		// String name = result.getString(2);
		// String grade = result.getString(3);
		//
		// System.out.println(id + " " + name + " " + grade);
		// }
		// } catch (SQLException e) {
		// System.err.println("Bad SQL command.");
		// System.err.println("Msg: " + e.getMessage());
		// System.exit(1);
		// }

//		try {
//			Statement statement = conn.createStatement();
//			ResultSet result = statement
//					.executeQuery("select * from players where grade = (select min(grade) from players)");
//
//			while (result.next()) {
//				String id = result.getString(1);
//				String name = result.getString(2);
//				String grade = result.getString(3);
//
//				System.out.println(id + " " + name + " " + grade);
//			}
//		} catch (SQLException e) {
//			System.err.println("Bad SQL command.");
//			System.err.println("Msg: " + e.getMessage());
//			System.exit(1);
//		}
		
		try {
			Statement statement = conn.createStatement();
			ResultSet result = statement
					.executeQuery("select * from players where (length(name) - 3) <= 7");

			while (result.next()) {
				String id = result.getString(1);
				String name = result.getString(2);
				String grade = result.getString(3);

				System.out.println(id + " " + name + " " + grade);
			}
		} catch (SQLException e) {
			System.err.println("Bad SQL command.");
			System.err.println("Msg: " + e.getMessage());
			System.exit(1);
		}
		

	}

}

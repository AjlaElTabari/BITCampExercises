package vjezbe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Task4_Main {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			Class.forName("org.sqlite.JDBC");
			System.out.println("Library loaded.");

			conn = DriverManager
					.getConnection("jdbc:sqlite:/Users/ajla.eltabari/Documents/bitcamp/s14d01_jdbc_and_orm/standings.db");
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
		
		//selectAllFromTheTeam(conn);
		
		//selectAllFromTheTeamSortedByScoredplus(conn);
		
		//selectAllFromTheTeamSortedByGroupAndPoints(conn);
		
		//selectTeamsByGroup(conn, "C");
		
		selectTeamsByGroupForKnockout(conn);
		
	}
	
	private static void selectAllFromTheTeam(Connection conn) {
		ArrayList<Task4_Team> list = new ArrayList<>();
		try {
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery("select * from team");
			
			while (result.next()) {					
				int id = result.getInt(1);
				String name = result.getString(2);
				int wins = result.getInt(3);
				int losses = result.getInt(4);
				int points = result.getInt(5);
				int scoredplus = result.getInt(6);
				int scoredminus = result.getInt(7);
				String fromgroup = result.getString(8);
				
				Task4_Team e = new Task4_Team(id, name, wins, losses, points, scoredplus, scoredminus, fromgroup);
				list.add(e);
			}
			
			System.out.println(list);
			
		} catch (SQLException e) {
			System.err.println("Bad SQL command.");
			System.err.println("Msg: " + e.getMessage());
			System.exit(1);
		}
	}
	
	private static void selectAllFromTheTeamSortedByScoredplus(Connection conn) {
		ArrayList<Task4_Team> list = new ArrayList<>();
		try {
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery("select * from team order by scoredplus desc");
			
			while (result.next()) {					
				int id = result.getInt(1);
				String name = result.getString(2);
				int wins = result.getInt(3);
				int losses = result.getInt(4);
				int points = result.getInt(5);
				int scoredplus = result.getInt(6);
				int scoredminus = result.getInt(7);
				String fromgroup = result.getString(8);
				
				Task4_Team e = new Task4_Team(id, name, wins, losses, points, scoredplus, scoredminus, fromgroup);
				list.add(e);
			}
			
			System.out.println(list);
			
		} catch (SQLException e) {
			System.err.println("Bad SQL command.");
			System.err.println("Msg: " + e.getMessage());
			System.exit(1);
		}
	}
	
	private static void selectAllFromTheTeamSortedByGroupAndPoints(Connection conn) {
		ArrayList<Task4_Team> list = new ArrayList<>();
		try {
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery("select * from (select * from team order by points desc) order by fromgroup");
			
			while (result.next()) {					
				int id = result.getInt(1);
				String name = result.getString(2);
				int wins = result.getInt(3);
				int losses = result.getInt(4);
				int points = result.getInt(5);
				int scoredplus = result.getInt(6);
				int scoredminus = result.getInt(7);
				String fromgroup = result.getString(8);
				
				Task4_Team e = new Task4_Team(id, name, wins, losses, points, scoredplus, scoredminus, fromgroup);
				list.add(e);
			}
			
			System.out.println(list);
			
		} catch (SQLException e) {
			System.err.println("Bad SQL command.");
			System.err.println("Msg: " + e.getMessage());
			System.exit(1);
		}
	}
	
	private static void selectTeamsByGroup(Connection conn, String group) {
		ArrayList<Task4_Team> list = new ArrayList<>();
		try {
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery("select * from team where fromgroup = '" + group + "'");
			
			while (result.next()) {					
				int id = result.getInt(1);
				String name = result.getString(2);
				int wins = result.getInt(3);
				int losses = result.getInt(4);
				int points = result.getInt(5);
				int scoredplus = result.getInt(6);
				int scoredminus = result.getInt(7);
				String fromgroup = result.getString(8);
				
				Task4_Team e = new Task4_Team(id, name, wins, losses, points, scoredplus, scoredminus, fromgroup);
				list.add(e);
			}
			
			
			System.out.println(list);
			
		} catch (SQLException e) {
			System.err.println("Bad SQL command.");
			System.err.println("Msg: " + e.getMessage());
			System.exit(1);
		}
	}
	
	private static void selectTeamsByGroupForKnockout(Connection conn) {
		ArrayList<Task4_Team> list = new ArrayList<>();
		ArrayList<Task4_Team> modifiedList = new ArrayList<>();
		try {
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery("select * from (select * from team order by points desc) order by fromgroup;");
			
			while (result.next()) {					
				int id = result.getInt(1);
				String name = result.getString(2);
				int wins = result.getInt(3);
				int losses = result.getInt(4);
				int points = result.getInt(5);
				int scoredplus = result.getInt(6);
				int scoredminus = result.getInt(7);
				String fromgroup = result.getString(8);
				
				Task4_Team e = new Task4_Team (id, name, wins, losses, points, scoredplus, scoredminus, fromgroup);
				list.add(e);
			}
			
			for (int i = 0; i < list.size(); i++) {
				int counter = 0;
				System.out.println(modifiedList.size());
				if (modifiedList.size() > 0) {					
					for (int j = 0; j < modifiedList.size(); i++) {
						if (list.get(i).getFromgroup().equals(modifiedList.get(j))) {
							counter++;
						}
					}
					if (counter < 2) {
						modifiedList.add(list.get(i));
					}
				}
			}
			
			System.out.println(modifiedList);
			
		} catch (SQLException e) {
			System.err.println("Bad SQL command.");
			System.err.println("Msg: " + e.getMessage());
			System.exit(1);
		}
	}
}

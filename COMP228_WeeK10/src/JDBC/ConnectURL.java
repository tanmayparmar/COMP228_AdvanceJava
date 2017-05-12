package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectURL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String connectionURL = "jdbc:sqlserver://localhost:1433;"
				+ "databaseName=TestDB;user=tan;password=password";

		Connection con = null; // Holds connection information to the DB
		Statement stmt = null; // Allows us to create SQL statement
		ResultSet rs = null; // Holds the results of a SQL query

		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con = DriverManager.getConnection(connectionURL);

			// connected!!!

			String sql = "SELECT * FROM [dbo].[Order]";
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				System.out.println(rs.getString(1) + " " + rs.getString("OrderName"));
			}

		}

		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();

		}

		finally {
			if (rs != null) {
				try {
					rs.close();

				}

				catch (Exception e) {
					// TODO: handle exception
				}

				if (stmt != null) {
					try {
						stmt.close();
					} catch (Exception e2) {
						// TODO: handle exception
					}
				}

				if (con != null) {
					try {
						con.close();
					} catch (Exception e2) {
						// TODO: handle exception
					}
				}
			}
		}
	}

}

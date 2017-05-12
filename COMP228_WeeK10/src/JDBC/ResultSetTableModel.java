package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.table.AbstractTableModel;

public class ResultSetTableModel extends AbstractTableModel {

	// variables
	private Connection connection;
	private Statement statement;
	private ResultSet resultSet;
	private ResultSetMetaData metaData;
	private int numberOfRows;

	private boolean connectedToDatabse = false;

	// constructor

	public ResultSetTableModel(String driver, String url, String username, String password, String query)
			throws SQLException, ClassNotFoundException

	{
		Class.forName(driver);

	//	connection = DriverManager.getConnection(url, username, password);
		connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;" + 
		         "databaseName=AdventureWorks2014;user=tan;password=password");
		statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

		connectedToDatabse = true;

		setQuery(query);

	}

	public Class getColumnClass(int column) throws IllegalStateException {

		if (!connectedToDatabse) {
			throw new IllegalStateException("Not connected to database");
		}

		try {
			String className = metaData.getColumnName(column + 1);
			return Class.forName(className);
		}

		catch (Exception e) {
			e.printStackTrace();
		}
		return Object.class;
	}

	@Override
	public int getColumnCount() throws IllegalStateException {

		if (!connectedToDatabse) {
			throw new IllegalStateException("Not connect to the databse");
		}

		try {
			return metaData.getColumnCount();
		}

		catch (Exception e) {
			// TODO: handle exception

			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return 0;
	}

	public String getColumnName(int column) throws IllegalStateException {
		if (!connectedToDatabse) {
			throw new IllegalStateException("Not connected to the database");
		}

		try {
			return metaData.getColumnName(column + 1);

		}

		catch (SQLException e) {
			// TODO: handle exception

			e.printStackTrace();
		}

		return " ";
	}

	@Override
	public int getRowCount() throws IllegalStateException {
		// TODO Auto-generated method stub

		if (!connectedToDatabse) {
			throw new IllegalStateException("Not connected to Database");
		}
		return numberOfRows;
	}

	@Override
	public Object getValueAt(int row, int column) throws IllegalStateException {
		// TODO Auto-generated method stub
		if (!connectedToDatabse) {
			throw new IllegalStateException("Not connected to Database");
		}
		try {
			resultSet.absolute(row + 1);
			return resultSet.getObject(column + 1);
		}

		catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return "";

	}

	public void setQuery(String query) throws SQLException, IllegalStateException

	{
		if (!connectedToDatabse) {
			throw new IllegalStateException("NOt connected to databse");

		}

		resultSet = statement.executeQuery(query);

		metaData = resultSet.getMetaData();

		// Obtain the number of rows in the result
		resultSet.last();
		numberOfRows = resultSet.getRow();

		fireTableDataChanged();

	}

	public void disconnectFromDatabase()
	{
		if(connectedToDatabse)
		{
			try
			{
				resultSet.close();
				statement.close();
				connection.close();
			}
			
			catch (SQLException e) {
				// TODO: handle exception
				
				e.printStackTrace();
			}
			
			finally
			{
				
			}
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
new DisplayQueryResults();
	}
}

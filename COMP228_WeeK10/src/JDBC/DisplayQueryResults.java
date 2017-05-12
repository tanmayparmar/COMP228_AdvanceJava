package JDBC;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.regex.PatternSyntaxException;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class DisplayQueryResults extends JFrame {

	public static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	public static final String DATABASE_URL = "jdbc:sqlserver://localhost:1433;databaseName=AdventureWorks2014";
	public static final String USERNAME = "user=tan";
	public static final String PASSWORD = "password=password";

	public static final String DEFAULT_QUERY = "Select * from Person.Person";

	private ResultSetTableModel tableModel;
	private JTextArea queryArea;

	public DisplayQueryResults()
	{
		super("Displaying query Results");
	
	
	try
	{
		tableModel = new ResultSetTableModel(DRIVER, DATABASE_URL, USERNAME, PASSWORD, DEFAULT_QUERY);
		
		//instantiate queryArea
		queryArea =  new  JTextArea(DEFAULT_QUERY,3,100);
		queryArea.setWrapStyleWord(true);
		queryArea.setLineWrap(true);
		
		JScrollPane scrollPane = new JScrollPane(queryArea, 
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		JButton submitButton = new JButton("Submit Query");
	
		Box boxNorth = Box.createHorizontalBox();
		boxNorth.add(scrollPane);
		boxNorth.add(submitButton);
		
		JTable resultTable = new JTable(tableModel);
		JLabel filterLabel = new JLabel("Filter:");
		JTextField filterText = new JTextField();
		JButton filterButton = new JButton("Apply Filter");
		
		Box boxSouth = boxNorth.createHorizontalBox();
		boxSouth.add(filterLabel);
		boxSouth.add(filterText);
		boxSouth.add(filterButton);
		
		add(boxNorth, BorderLayout.NORTH);
		add(new JScrollPane(resultTable), BorderLayout.CENTER);
		add(boxSouth, BorderLayout.SOUTH);
		
		submitButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try
				{
					tableModel.setQuery(queryArea.getText());
				}
				catch (SQLException ex) {
					// TODO: handle exception
				
				JOptionPane.showMessageDialog(null, ex.getMessage(),"Database Error",JOptionPane.ERROR_MESSAGE);
				tableModel.disconnectFromDatabase();
				System.exit(1);
				}
				
			}
		});
		
		TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(tableModel);
		resultTable.setRowSorter(sorter);
		
		filterButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String text = filterText.getText();
				
				if (text.length() == 0) {
					sorter.setRowFilter(null);
					
				}
				
				else {
					try
					{
						sorter.setRowFilter(RowFilter.regexFilter(text));
					}
					
					catch (PatternSyntaxException pse) {
						JOptionPane.showMessageDialog(null, "Bad regex Pattern","Bad regex Pattern", JOptionPane.ERROR_MESSAGE);
						
						// TODO: handle exception
					}
				}
			}
		});
	}
	catch (SQLException e) {
		// TODO: handle exception
		
		
		JOptionPane.showMessageDialog(null, e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
	
		tableModel.disconnectFromDatabase();
		System.exit(1);
	}
	catch (ClassNotFoundException e) {
		// TODO: handle exception
		JOptionPane.showMessageDialog(null, "Databse Driver not found","Driver not found", JOptionPane.ERROR_MESSAGE);
		System.exit(1);
	}
	
	setSize(500,250);
	setVisible(true);
	setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	
	addWindowListener(new WindowAdapter() {
		
		public void windowClosed(WindowEvent e)
		{
			tableModel.disconnectFromDatabase();
		}
	});
	}

}

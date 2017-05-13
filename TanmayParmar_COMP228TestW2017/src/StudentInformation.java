import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class StudentInformation extends JFrame {

	private Connection connection;
	private PreparedStatement preparedStatement;
	JButton btnSearch;
	JLabel labelCity;
	JTextField tfCityName;
	JTextArea displayResult;

	GridLayout gridLayout = new GridLayout(0, 2);

	public void addComponentsToPane(Container container) {

		JPanel controls = new JPanel();
		controls.setLayout(gridLayout);

		JPanel displayResultPane = new JPanel();
		displayResultPane.setLayout(gridLayout);

		labelCity = new JLabel("Select Students by City:");
		controls.add(labelCity);
		tfCityName = new JTextField();
		controls.add(tfCityName);
		btnSearch = new JButton("Display");
		controls.add(btnSearch);
		JTextArea taDisplayResult = new JTextArea();
		taDisplayResult.setWrapStyleWord(true);
		taDisplayResult.setLineWrap(true);
		
		//Scroll pane for to display textarea
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(BorderFactory.createTitledBorder("Student Infomration"));
		scrollPane.setViewportView(taDisplayResult);

		displayResultPane.add(scrollPane);
		container.add(controls, BorderLayout.NORTH);
		container.add(displayResultPane, BorderLayout.CENTER);

		
		//search button click event
		btnSearch.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				//connnection String
				String connectionURL = "jdbc:sqlserver://localhost:1433;"
						+ "databaseName=Student;user=tan;password=password";

				try {

					Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
					connection = DriverManager.getConnection(connectionURL);
					//Prepared statement for executing query
					preparedStatement = connection.prepareStatement(
							"Select studentID,firstName,lastName,address,city,province,postalCode from Students where city=? ");
					preparedStatement.setString(1, tfCityName.getText());
					ResultSet resultSet = preparedStatement.executeQuery();
					StringBuilder stringBuilder = new StringBuilder();

					
					  while (resultSet.next()) {
					  stringBuilder.append(resultSet.getString(1)).append(" ").
					  append(resultSet.getString(2)).append(" ").
					  append(resultSet.getString(3)).append(" ").
					  append(resultSet.getString(4)).append(" ").
					  append(resultSet.getString(5)).append(" ").
					  append(resultSet.getString(6)).append(" ").
					  append(resultSet.getString(7));
					  stringBuilder.append("\n"); }
					 
/**
					while (resultSet.next()) {
						stringBuilder.append(resultSet.getString("studentID") + "\t\t\t");
						stringBuilder.append(resultSet.getString("firstName") + "\t\t\t");
						stringBuilder.append(resultSet.getString("lastName") + "\t\t\t");
						stringBuilder.append(resultSet.getString("address") + "\t\t\t");
						stringBuilder.append(resultSet.getString("city") + "\t\t\t");
						stringBuilder.append(resultSet.getString("province") + "\t\t\t");
						stringBuilder.append(resultSet.getString("postalcode") + "\t\t\t");

						stringBuilder.append("\n");
 				}
 **/
					  
					taDisplayResult.setText(stringBuilder.toString());
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});
	}

	public void createAndShowGUI() {
		// Create and set up the window.
		StudentInformation frame = new StudentInformation();
		JScrollPane pane = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Set up the content pane.
		frame.addComponentsToPane(frame.getContentPane());
		// Display the window.

		frame.pack();
		frame.setSize(500, 350);
		frame.setVisible(true);
	}

}

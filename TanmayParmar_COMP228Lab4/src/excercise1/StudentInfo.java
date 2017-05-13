package excercise1;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.ScrollPane;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class StudentInfo extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// Declaring Fields For form
	Student studentObj = new Student();
	JLabel studentName, studentAddress, studentProvince, studentCity, studentPostelCode, studentPhoneNumber,
			studentEmail;

	TextField tfStudentName, tfStudentProvince, tfStudentCity, tfStudentPostelCode, tfStudentPhoneNumber,
			tfStudentEmail;

	TextField tfStudentAddress;

	JRadioButton jrbComputerScience, jrbBusiness;

	JCheckBox jcbStudentCouncil, jcbVolunteerWork;

	ButtonGroup radioGroup;

	JButton display;
	JComboBox<String> courserList;
	JTextArea displayInfo;

	JList<String> copyJList;

	JButton copyJButton; // button to copy selected names

	GridLayout gridLayout = new GridLayout(0, 2);

	String[] computerScienceSubject = { "Select", "JAVA", "C++", "Python", "C" }; // computer
	// Science
	// subject
	String[] businessSubject = { "Select", "Humam Resource", "Account", "Planning" }; // business
	// subject

	ArrayList<String> selectedCourse = new ArrayList<>();

	public StudentInfo() {
		super("Student Information Form");

		copyJList = new JList<String>(); // list to hold copied subject
		copyJList.setVisibleRowCount(5); // show 5 rows
		copyJList.setFixedCellWidth(100); // set width
		copyJList.setFixedCellHeight(15); // set height
		copyJList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);

		add(new JScrollPane(copyJList)); // add list with scrollpane

	}

	public void addComponentsToPane(Container container) {
		JPanel formFields = new JPanel();
		formFields.setLayout(gridLayout);
		JPanel controls = new JPanel();

		controls.setLayout(new GridLayout(4, 0));

		JPanel checkboxPanel = new JPanel();
		checkboxPanel.setLayout(new GridLayout(0, 1));

		
		GridBagLayout layout = new GridBagLayout();
		
		JPanel displayArea = new JPanel();
		displayArea.setLayout(layout);
		//displayArea.setLayout(new GridLayout(2, 0));
		GridBagConstraints gbc = new GridBagConstraints();
		

		studentName = new JLabel("Name:");
		formFields.add(studentName);
		tfStudentName = new TextField();
		studentObj.setStudentName(tfStudentName);
		formFields.add(tfStudentName);
		studentAddress = new JLabel("Address:");
		formFields.add(studentAddress);
		tfStudentAddress = new TextField();
		studentObj.setStudentAddress(tfStudentAddress);
		formFields.add(tfStudentAddress);
		studentProvince = new JLabel("Province");
		formFields.add(studentProvince);
		tfStudentProvince = new TextField();
		studentObj.setStudentProvince(tfStudentProvince);
		formFields.add(tfStudentProvince);
		studentCity = new JLabel("City");
		formFields.add(studentCity);
		tfStudentCity = new TextField();
		studentObj.setStudentCity(tfStudentCity);
		formFields.add(tfStudentCity);
		studentPostelCode = new JLabel("Postal Code");
		formFields.add(studentPostelCode);
		tfStudentPostelCode = new TextField();
		studentObj.setStudentPostelCode(tfStudentPostelCode);
		formFields.add(tfStudentPostelCode);
		studentPhoneNumber = new JLabel("Phone Number");
		formFields.add(studentPhoneNumber);
		tfStudentPhoneNumber = new TextField();
		studentObj.setStudentPhoneNumber(tfStudentPhoneNumber);
		formFields.add(tfStudentPhoneNumber);
		studentEmail = new JLabel("Email");
		formFields.add(studentEmail);
		tfStudentEmail = new TextField();
		studentObj.setStudentEmail(tfStudentEmail);
		formFields.add(tfStudentEmail);

		jcbStudentCouncil = new JCheckBox("Student Council");
		jcbVolunteerWork = new JCheckBox("Volunteer Work");
		checkboxPanel.add(jcbStudentCouncil);
		checkboxPanel.add(jcbVolunteerWork);

		jrbComputerScience = new JRadioButton("Computer Science", true);
		jrbBusiness = new JRadioButton("Business", false);

		courserList = new JComboBox<String>(computerScienceSubject);
		add(courserList);
		add(jrbComputerScience);
		add(jrbBusiness);

		radioGroup = new ButtonGroup();
		radioGroup.add(jrbBusiness);
		radioGroup.add(jrbComputerScience);

		// ComputerScience radio btn event
		jrbComputerScience.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//	System.out.println("inside click cs---");
				courserList.removeAllItems();
				for (int i = 0; i < computerScienceSubject.length; i++) {
					// System.out.println(computerScienceSubject[i]);
					courserList.addItem(computerScienceSubject[i]);
				}

			}

		});

		// Business radio btn event
		jrbBusiness.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//	System.out.println("inside click business---");
				courserList.removeAllItems();
				for (int i = 0; i < businessSubject.length; i++) {
					// System.out.println(businessSubject[i]);
					courserList.addItem(businessSubject[i]);
				}

			}
		});
		
		
		

		display = new JButton("Display");
	//	display.setMinimumSize(new Dimension(2, 2));
		
		displayInfo = new JTextArea(5, 43);

		// Adding components to container

		controls.add(jrbComputerScience);
		controls.add(jrbBusiness);

		controls.add(courserList);

		controls.add(copyJList);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 1;
		gbc.gridy = 1;
		displayArea.add(display,gbc);
		gbc.fill = GridBagConstraints.HORIZONTAL;
		
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth=5;
		displayArea.add(displayInfo,gbc);

	//	displayArea.add(display);
	//	displayArea.add(displayInfo);

		// Adding containers to layout for display
		container.add(formFields, BorderLayout.WEST);
		// container.add(new JSeparator(), BorderLayout.CENTER);
		container.add(controls, BorderLayout.EAST);

		// checkboxPanel.setPreferredSize(new Dimension(120, 120));

		container.add(checkboxPanel, BorderLayout.CENTER);

		container.add(displayArea, BorderLayout.SOUTH);
		
		// select drop down event (set value to jlist)
		courserList.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (courserList.getSelectedIndex() != -1) {
					if (courserList.getSelectedIndex() != 0) {
						String checkStr = courserList.getSelectedItem().toString();
						// System.out.println(selectedCourse.toString()+"==="+selectedCourse.contains(checkStr));
						if (!selectedCourse.contains(checkStr)) {
							selectedCourse.add(checkStr);
							String[] courseArray = selectedCourse.toArray(new String[selectedCourse.size()]);
							copyJList.setListData(courseArray);
						}
					} else {
						// if validation alert show ,write code here already
						// select course
					}
				} else {
					selectedCourse.clear();
					String[] courseArray = selectedCourse.toArray(new String[selectedCourse.size()]);
					copyJList.setListData(courseArray);
				}
			}

		});

		display.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				// ListenerClass listener = new ListenerClass();
				// copyJList.addListSelectionListener(listener);
				displayTextArea();

				copyJList = new JList<>();
				copyJList.addListSelectionListener(new ListSelectionListener() {

					@Override
					public void valueChanged(ListSelectionEvent e) {
						// TODO Auto-generated method stub

					}
				});
			}
		});

	}

	public void displayTextArea() {
		String str;
		JTextArea ta;

		str = tfStudentName.getText();
		displayInfo.append(str);
		displayInfo.append(". ");
		str = tfStudentAddress.getText();
		displayInfo.append(str);
		str = tfStudentCity.getText();
		displayInfo.append(str);
		displayInfo.append(". ");
		str = tfStudentProvince.getText();
		displayInfo.append(str);
		displayInfo.append(", ");
		str = tfStudentPostelCode.getText();
		displayInfo.append(str);
		displayInfo.append(", ");
		str = tfStudentPhoneNumber.getText();
		displayInfo.append(str);
		displayInfo.append(", ");
		str = tfStudentEmail.getText();
		displayInfo.append(str);
		displayInfo.append(". ");
		displayInfo.append("\n");
		displayInfo.append("Courses");
		//displayInfo.append("\n");
		String data = " ";
		
		
		ListModel model = copyJList.getModel();
		for(int i=0; i < model.getSize(); i++){
		     Object o =  model.getElementAt(i); 
		     displayInfo.append("\n"+o);
		     
		}

		
	}

	private class ListenerClass implements ListSelectionListener {

		public void valueChanged(ListSelectionEvent e) {
			displayInfo.setText(copyJList.getSelectedValue().toString());
		}
	}

	public void createAndShowGUI() {
		// Create and set up the window.
		StudentInfo frame = new StudentInfo();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Set up the content pane.
		frame.addComponentsToPane(frame.getContentPane());
		// Display the window.

		frame.pack();
		frame.setSize(500, 350);
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}

}
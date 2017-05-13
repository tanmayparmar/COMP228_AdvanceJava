package excercise2;

import java.util.ArrayList;
import java.util.Collection;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class StudentInfo extends Application {

	TextArea displayInfo = new TextArea();

	// Text field
	TextField nameText, addressText, provinceText, cityText, postalText, phoneText, emailText;
	// Label
	Text nameLabel, addressLabel, provinceLabel, cityLabel, postalLabel, phoneLabel, emailLabel;

	CheckBox studentCouncil, volunteerWork;
	ToggleGroup subject;
	RadioButton rdbcs, rdbbusiness;

	ChoiceBox subjectListCombo;
	ObservableList<String> business, computerScienceSubject, subjectListList, courseList;
	ListView copysubjectListView;

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub

		ArrayList<String> selectedCourse = new ArrayList<>();

		GridPane pane = new GridPane();
		GridPane pane1 = new GridPane();
		pane.setAlignment(Pos.CENTER);
		pane.setHgap(5.5); // Horizontal Gap
		pane.setVgap(5.5); // Vertical Gap

		nameText = new TextField();
		addressText = new TextField();
		provinceText = new TextField();
		cityText = new TextField();
		postalText = new TextField();
		phoneText = new TextField();
		emailText = new TextField();

		nameLabel = new Text("Name");
		addressLabel = new Text("Address");

		provinceLabel = new Text("Province");

		cityLabel = new Text("City");

		postalLabel = new Text("Postal Code");

		phoneLabel = new Text("Phone NUmber");

		emailLabel = new Text("Email");

		studentCouncil = new CheckBox("Student Council");
		studentCouncil.setIndeterminate(false);

		volunteerWork = new CheckBox("Volunteer Work");
		volunteerWork.setIndeterminate(false);

		subject = new ToggleGroup();
		rdbbusiness = new RadioButton("Business");
		rdbbusiness.setToggleGroup(subject);

		rdbcs = new RadioButton("Computer Science");
		rdbcs.setToggleGroup(subject);

		// String[] computerScienceSubject = { "Select", "JAVA", "C++",
		// "Python", "C" }; // computer
		// Science
		// subject
		// String[] businessSubject = { "Select", "Humam Resource", "Account",
		// "Planning" }; // business
		// subject

		ObservableList<String> business = FXCollections.observableArrayList("Human Resource", "Marketing",
				"Accounting");

		computerScienceSubject = FXCollections.observableArrayList("C", "C++", "JAVA", "Python");
		courseList = FXCollections.observableArrayList();

		subjectListList = FXCollections.observableArrayList();

		subjectListCombo = new ChoiceBox(subjectListList);

		// ComboBox<String> subjectListCombo = new ComboBox(subjectListList);

		copysubjectListView = new ListView();

		// copysubjectListView= new ListView<String>();
		copysubjectListView.setPrefSize(8, 8);

		subject.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {

			@Override
			public void changed(ObservableValue<? extends Toggle> arg0, Toggle arg1, Toggle arg2) {
				// TODO Auto-generated method stub

				if (rdbcs.isSelected()) {
					subjectListList.clear();
					// for (int i = 0; i < computerScienceSubject.size(); i++) {
					// System.out.println(businessSubject[i]);
					// subjectListList.add(computerScienceSubject[i]);
					// ChoiceBox business = new ChoiceBox();
					// subjectListList.add(computerScienceSubject[i]);
					subjectListList.addAll(computerScienceSubject);
					// }

				}

				else {
					subjectListList.clear();
					// ComboBox cs = new ComboBox();

					// for (int i = 0; i < business.size(); i++) {

					// subjectListList.add(businessSubject[i]);
					// ChoiceBox business = new ChoiceBox();
					subjectListList.addAll(business);
					// }
				}
			}
		});

		// subjectListCombo.valueProperty().addListener(new
		// ChangeListener<String>()

		ChangeListener<String> change = new ChangeListener<String>()

		{

			@Override
			public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
				// TODO Auto-generated method stub
				if (subjectListCombo.getSelectionModel().getSelectedIndex() != -1) {
					if (subjectListCombo.getSelectionModel().getSelectedIndex() != 0) {
						// String strChk = subjectListCombo.getValue();
						String strChk = subjectListCombo.getValue().toString();
						if (!selectedCourse.contains(strChk)) {
							selectedCourse.add(strChk);
							String[] courseArray = selectedCourse.toArray(new String[selectedCourse.size()]);
							copysubjectListView.getItems().addAll(courseArray);

						}
					}
				} else {
					selectedCourse.clear();
					String[] courseArray = selectedCourse.toArray(new String[selectedCourse.size()]);
					copysubjectListView.getItems().addAll(courseArray);
					copysubjectListView.setItems(FXCollections.observableArrayList(subjectListList));

				}
			}
		};
		// );
		subjectListCombo.getSelectionModel().selectedItemProperty().addListener(change);

		Button btDisplay = new Button("Display");
		btDisplay.setOnAction(e -> {
			displayTextArea();
		});

		pane.add(nameLabel, 0, 0);
		pane.add(nameText, 1, 0);
		pane.add(addressLabel, 0, 1);
		pane.add(addressText, 1, 1);
		pane.add(provinceLabel, 0, 2);
		pane.add(provinceText, 1, 2);
		pane.add(cityLabel, 0, 3);
		pane.add(cityText, 1, 3);
		pane.add(postalLabel, 0, 4);
		pane.add(postalText, 1, 4);
		pane.add(phoneLabel, 0, 5);
		pane.add(phoneText, 1, 5);
		pane.add(emailLabel, 0, 6);
		pane.add(emailText, 1, 6);

		pane.add(studentCouncil, 2, 2);
		pane.add(volunteerWork, 2, 3);

		pane.add(rdbbusiness, 4, 1);
		pane.add(rdbcs, 5, 1);
		// pane.add(subjectList, 0, 3);
		pane.add(subjectListCombo, 5, 2);
		pane.add(copysubjectListView, 5, 3);
		pane.add(btDisplay, 2, 10);
		pane1.add(displayInfo, 2, 13);
		BorderPane borderPane = new BorderPane();
		borderPane.setTop(pane);
		borderPane.setBottom(pane1);
		Scene scene = new Scene(borderPane);
		primaryStage.setTitle("Registration Form");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public void displayTextArea() {

		String str;
		str = nameText.getText();
		displayInfo.appendText(str);
		displayInfo.appendText(". ");
		str = addressText.getText();
		displayInfo.appendText(str);
		str = cityText.getText();
		displayInfo.appendText(str);
		displayInfo.appendText(". ");
		str = provinceText.getText();
		displayInfo.appendText(str);
		displayInfo.appendText(", ");
		str = postalText.getText();
		displayInfo.appendText(str);
		displayInfo.appendText(", ");
		str = phoneText.getText();
		displayInfo.appendText(str);
		displayInfo.appendText(", ");
		str = emailText.getText();
		displayInfo.appendText(str);
		displayInfo.appendText(". ");
		displayInfo.appendText("\n");
		displayInfo.appendText("Courses");
		// displayInfo.append("\n");
		String data = " ";

		Collection<ListView> list = FXCollections.observableArrayList(copysubjectListView);

		for (int i = 0; i < list.size(); i++) {
			Object o = copysubjectListView.getItems();
			displayInfo.appendText("\n" + o);

		}
	}

	public static void main(String args[]) {

		launch(args);
	}
}

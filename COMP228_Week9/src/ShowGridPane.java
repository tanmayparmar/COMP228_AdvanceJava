import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ShowGridPane extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub

		GridPane pane = new GridPane();

		pane.setAlignment(Pos.CENTER);
		pane.setHgap(5.5); // Horizontal Gap
		pane.setVgap(5.5); // Vertical Gap

		pane.add(new Label("First Name:"), 0, 0);
		pane.add(new TextField(),1,0);
		pane.add(new Label("MI:"), 0, 0);
		pane.add(new TextField(), 1, 1);
		pane.add(new Label("Last Name:"), 0, 0);
		pane.add(new TextField(), 1, 2);
		
		Button btAdd = new Button("Add Name:");
		pane.add(btAdd, 1, 3);
		GridPane.setHalignment(btAdd, HPos.RIGHT);
		Scene scene = new Scene(pane,200,500);
		
		primaryStage.setTitle("ShowGridPane");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}

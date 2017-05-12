import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HandleEvent extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		HBox pane = new HBox(10);
		pane.setAlignment(Pos.CENTER);
		Button btOK = new Button("OK");
		Button btCancel = new Button("Cancel");

		OKHandlerClass okHandler = new OKHandlerClass();
		btOK.setOnAction(okHandler);
		
		CancelHandlerClass cancelHandler = new CancelHandlerClass();
		btCancel.setOnAction(cancelHandler);
		
		pane.getChildren().addAll(btOK,btCancel);
		
		
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Event Handelr");
		
		primaryStage.setScene(scene);
		primaryStage.show();
				
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}

class OKHandlerClass implements EventHandler<ActionEvent> {

	@Override
	public void handle(ActionEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("OK Clicked");

	}
}


class CancelHandlerClass implements EventHandler<ActionEvent>
{

	@Override
	public void handle(ActionEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Cancel Clicked");
	}
	}
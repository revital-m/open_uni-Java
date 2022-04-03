import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class RandomMatrixFill extends Application{ 
	
	public void start(Stage stage) throws Exception{ 
		Parent root = (Parent) FXMLLoader.load(getClass().getResource("RandomMatrixFill.fxml")); 
		Scene scene = new Scene(root); 
		stage.setTitle("RandomMatrixFill"); 
		stage.setScene(scene); 
		stage.show(); 
	} 
	
	public static void main(String[] args) { 
		launch(args); 
		System.out.println();
	} 
}


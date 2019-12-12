import javafx.application.*;
import javafx.scene.*;
import javafx.scene.paint.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.*;

public class FirstRoot extends Application {
    // instance data variables incl controls
    private Button button;	
    TextField inputField;
    
    public static Boolean isIt = new Boolean("here" == "HERE");
    

    @Override
	public void start(Stage primaryStage) {
//		Group root = new Group();
		
		button = new Button();
		Group root = new Group(button);
//		root.getChildren().add(button);
		
		Scene scene = new Scene(root, 300, 300, Color.BEIGE);
		
		primaryStage.setTitle("TITLE");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
    
    
	public static void main(String[] args) {
	    launch(args);
	    
        System.out.println(isIt);
	}
}

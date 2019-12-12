import javafx.application.*;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class advJavMod4HW extends Application {
	
	public void start(Stage primaryStage) {
		Pane pane = new FlowPane();
		Text quoteText = new Text("You miss 100% of the shots you don't take, "
				+ "and about 95% of the shots you do. I'm sorry, "
				+ "but I'm cutting you from the basketball team.");
		quoteText.setFont(Font.font("Helvetica", 28));
		quoteText.setFill(Color.color(.25,  .4,  .15));
		pane.getChildren().add(quoteText);
		
		Scene scene = new Scene(pane, 200, 200, Color.GOLD);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Quote of the Day");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);

	}

}

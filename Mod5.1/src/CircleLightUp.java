import javafx.application.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.input.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.stage.*;


public class CircleLightUp extends Application {

    private final static int NUM_CIRCLES = 5;
    private final static int POSITION_SPACING = 100;
    private final static int RADIUS = 50;
	
    public void start(Stage primaryStage) {
        
        Pane pane = new Pane();
  
        for(int i=0; i<NUM_CIRCLES; i++) {

        	int center = POSITION_SPACING + i * POSITION_SPACING; 
            Circle circle = new Circle(center, center, RADIUS);
            pane.getChildren().add(circle);
            // YOUR CODE HERE: CODE A
        }
        Scene scene = new Scene(pane, 700, 700, Color.AZURE);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    // YOUR CODE HERE: CODE B
    
   
    public static void main(String[] args) {
        launch(args);

    }

}

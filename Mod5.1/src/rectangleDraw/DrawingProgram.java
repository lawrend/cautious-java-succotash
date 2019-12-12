package rectangleDraw;
import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class DrawingProgram extends Application {
	private Pane pane;
	private RadioButton redPenButton, yellowPenButton, greenPenButton, slimWidthButton, 
	wideWidthButton ;
	private Rectangle rect;
	

	@Override
	public void start(Stage primaryStage) throws Exception {
		pane = new Pane();
		pane.setOnMouseClicked(this::handleMouseClick);
		pane.setOnMouseMoved(this::handleMouseMotion);
		
		
		ToggleGroup widthGroup = new ToggleGroup();
		slimWidthButton = new RadioButton("Slim");
		slimWidthButton.setToggleGroup(widthGroup);
		slimWidthButton.setSelected(true);
		slimWidthButton.setOnAction(this::handleWidthButtons);
		
		wideWidthButton = new RadioButton("Wide");
		wideWidthButton.setToggleGroup(widthGroup);
		wideWidthButton.setOnAction(this::handleWidthButtons);
		
			
	
		
		ToggleGroup penGroup = new ToggleGroup();
		redPenButton = new RadioButton("Red");
		redPenButton.setToggleGroup(penGroup);
		redPenButton.setSelected(true);
		redPenButton.setOnAction(this::handlePenRadioButtons);
		
		yellowPenButton = new RadioButton("Yellow");
		yellowPenButton.setToggleGroup(penGroup);
		yellowPenButton.setOnAction(this::handlePenRadioButtons);
		
		greenPenButton = new RadioButton("Green");
		greenPenButton.setToggleGroup(penGroup);
		greenPenButton.setOnAction(this::handlePenRadioButtons);
		
        HBox radioButtonBox = new HBox(redPenButton, yellowPenButton, greenPenButton, slimWidthButton, wideWidthButton);
		radioButtonBox.setAlignment(Pos.CENTER);
		radioButtonBox.setSpacing(20);
		
		
		pane.getChildren().add(radioButtonBox);
		
		Scene scene = new Scene(pane, 500, 500, Color.BLUE);
		    primaryStage.setTitle("beginning");
		    primaryStage.setScene(scene);
		    primaryStage.show();
	
	}
	
	private void handleMouseClick(MouseEvent event) {
		double x = event.getX();
		double y = event.getY();
		
		rect = new Rectangle(x, y, 100, 100);
		
		pane.getChildren().add(rect);
		
	}
	
    private void handleMouseMotion(MouseEvent event) {
		double x = event.getX();
		double y = event.getY();
		
		
	}
    
	private void handlePenRadioButtons(ActionEvent event) {
		if(redPenButton.isSelected()) {
		    rect.setStroke(Color.RED);
		} else if(yellowPenButton.isSelected()) {
			rect.setStroke(Color.YELLOW);
		} else if(greenPenButton.isSelected()) {
			rect.setStroke(Color.GREEN);
		}
	}
	
	private void handleWidthButtons(ActionEvent event) {
		if(slimWidthButton.isSelected()) {
		    rect.setStrokeWidth(10);
		} else if(wideWidthButton.isSelected()) {
			rect.setStrokeWidth(25);
		}
	}


	public static void main(String[] args) {
		launch(args);
	}
		
}

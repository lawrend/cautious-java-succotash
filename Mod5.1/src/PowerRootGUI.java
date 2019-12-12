import javafx.application.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.text.*;
import javafx.stage.*;

public class PowerRootGUI extends Application {

	private Button powerButton, squareRootButton;
	private TextField numberField, powerField;
	private Text resultText;

	public void start(Stage primaryStage) {
		VBox mainVBox = new VBox();
		mainVBox.setStyle("-fx-background-color: cyan");
		mainVBox.setAlignment(Pos.CENTER);
		mainVBox.setSpacing(10);

		Text numberText = new Text("Number:");
		numberText.setFont(Font.font("Helvetica", 24));
		numberText.setFill(Color.BLUE);
		Text powerText = new Text("Exponent:");
		powerText.setFont(Font.font("Helvetica", 24));
		powerText.setFill(Color.BLUE);
		HBox textBox = new HBox(numberText, powerText);
		textBox.setAlignment(Pos.CENTER);
		textBox.setSpacing(20);
		mainVBox.getChildren().add(textBox);
		
		numberField = new TextField();
		numberField.setOnAction(this::handleButtons);
		powerField = new TextField();
		powerField.setOnAction(this::handleButtons);	
		HBox inputBox = new HBox(numberField, powerField);
		inputBox.setAlignment(Pos.CENTER);
		inputBox.setSpacing(10);
		mainVBox.getChildren().add(inputBox);

		powerButton = new Button("Calculate Power");
		powerButton.setOnAction(this::handleButtons);
		squareRootButton = new Button("Calculate Square Root");
		squareRootButton.setOnAction(this::handleButtons);

		HBox buttonBox = new HBox(powerButton, squareRootButton);
		buttonBox.setAlignment(Pos.CENTER);
		buttonBox.setSpacing(10);
		mainVBox.getChildren().add(buttonBox);

		resultText = new Text("Ready for Math?");
		resultText.setFont(Font.font("Helvetica", 28));
		resultText.setFill(Color.BLUE);

		HBox resultBox = new HBox(resultText);
		resultBox.setAlignment(Pos.CENTER);
		resultBox.setSpacing(10);
		mainVBox.getChildren().add(resultBox);

		Scene scene = new Scene(mainVBox, 300, 250);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	private void handleButtons(ActionEvent event) {
		// YOUR CODE HERE
	}

	public static void main(String[] args) {
		launch(args);

	}

}

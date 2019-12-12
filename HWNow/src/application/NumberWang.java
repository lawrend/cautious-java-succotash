package application;

import javafx.application.*;
import javafx.event.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.text.*;
import javafx.stage.*;

public class NumberWang extends Application {
	private Button button;
	private Text guessText;
	private TextField guess;
	private int intGuess;
	private int secretNumber;
	private Scene scene;
	private Text previousGuess;
	private Text guessLabel;
	private String replyText = "";
	
    public void start(Stage primaryStage) {
    	
    	getSecretNumber();
    	
    	GridPane pane = new GridPane();
		pane.setStyle("-fx-background-color: null;");
		pane.setVgap(30);
		
		guessLabel = new Text("Guess the Number! 1-100!");
		guess = new TextField();
		guess.setOnAction(this::checkGuess);
		TilePane guessPane = new TilePane(guessLabel, guess);
		pane.add(guessPane, 1, 1);
		
		button = new Button("Check");
		button.setOnAction(this::checkGuess);
		TilePane checkButtonTile = new TilePane(button);
		pane.add(checkButtonTile, 1, 3);
		
		guessText = new Text(replyText);
		guessText.setFont(Font.font(20));
		pane.add(guessText, 1, 0);
		
		scene = new Scene(pane, 600, 600);
		scene.setFill(Color.BEIGE);
		
		primaryStage.setTitle("Guess the Number!");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
    
    	
	private void checkGuess(ActionEvent event) {
		
		intGuess = Integer.parseInt(guess.getText());
		
		if(intGuess > secretNumber) {
			replyText = intGuess + " is Too High!";
			guess.clear();
		} else if(intGuess < secretNumber) {
			replyText = intGuess + " is Too Low!";
			guess.clear();
		} else {
			replyText = "Yes! It was " + intGuess + "! You Got It!! Go Again!";
			guess.clear();
			getSecretNumber();
		}
		guessText.setText(replyText);
	}
	
	private void getSecretNumber() {
    	secretNumber = (int)(Math.random() * 100);
	}
	
	public static void main(String[] args) {
		launch(args);

	}

}

//package application;
import java.io.*;
import java.nio.file.Files;
import java.util.*;

import application.CustomerInput.WrongCharacterException;
import javafx.application.*;
import javafx.event.*;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.text.*;
import javafx.stage.*;

public class CustomerInput extends Application {

    private Stage primaryStage;
    private Text statusText, resultText;
    private Button uploadButton;
    private ArrayList<Customer> customerList = new ArrayList<Customer>();
    private int orders = 0;
    private int newCustomers = 0;

    private final static Font RESULT_FONT = Font.font("Helvetica", 24);
    private final static Font INPUT_FONT = Font.font("Helvetica", 20);
     
    public class WrongCharacterException extends Exception {
    	public WrongCharacterException(String message) {
    		super(message);
    	}
    }

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;

        VBox primaryBox = new VBox();
        primaryBox.setAlignment(Pos.CENTER);
        primaryBox.setSpacing(20);
        primaryBox.setStyle("-fx-background-color: white");

        VBox uploadBox = new VBox();
        uploadBox.setAlignment(Pos.CENTER);
        uploadBox.setSpacing(20);
        Text uploadLabel = new Text("Upload a comma-separated file with customer data.");
        uploadLabel.setFont(INPUT_FONT);
        uploadButton = new Button("Upload data");
        uploadButton.setOnAction(this::processDataUpload);

        uploadBox.getChildren().add(uploadLabel);
        uploadBox.getChildren().add(uploadButton);
        primaryBox.getChildren().add(uploadBox);

        VBox resultsBox = new VBox();
        resultsBox.setAlignment(Pos.CENTER);
        resultsBox.setSpacing(20);
        statusText = new Text("");
        statusText.setVisible(false);
        statusText.setFont(RESULT_FONT);
        statusText.setFill(Color.RED);
		resultText = new Text("");
        resultText.setVisible(false);
        resultText.setFont(RESULT_FONT);
        resultsBox.getChildren().add(statusText);
        resultsBox.getChildren().add(resultText);
        primaryBox.getChildren().add(resultsBox);

        Scene scene = new Scene(primaryBox, 475, 200, Color.TRANSPARENT);
        primaryStage.setTitle("Customer Data Upload");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    private void processDataUpload(ActionEvent event) {
        statusText.setVisible(true);
        resultText.setVisible(true);
        uploadButton.setDisable(true);
        FileChooser fileChooser = new FileChooser();
        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("CSV files (*.csv)", "*.csv");
        fileChooser.getExtensionFilters().add(extFilter);
        File file = fileChooser.showOpenDialog(primaryStage);
        try {
			parseFile(file);
		} catch (WrongCharacterException ex) {
            statusText.setText("FAIL");
			resultText.setText(ex.getMessage() + " try again");
		}

    }
   

    private void parseFile(File file) throws WrongCharacterException {
    	String id = "";
    	int numberOfOrders = 0;

		try (FileReader reader = new FileReader(file);
				Scanner fileScan = new Scanner(reader)) {

			while (fileScan.hasNext()) {
				String oneLine = fileScan.nextLine();

				Scanner lineScan = new Scanner(oneLine);
				lineScan.useDelimiter(",");

				id = lineScan.next();
				numberOfOrders = Integer.parseInt(lineScan.next());
				if(id.indexOf('@')>=0) {
					throw new WrongCharacterException("@ is invalid");
				}

				Customer customer = new Customer(id, numberOfOrders);
				customerList.add(customer);
				orders += numberOfOrders;
				newCustomers++;
				
				statusText.setText("Success!");
                resultText.setText(newCustomers + " customers uploaded - " + orders + " total orders");
			}

		} catch (IOException ex) {
			System.out.println(ex.getMessage());
			statusText.setText("FAIL");
			resultText.setText(ex.getMessage() + " try again");
			uploadButton.setDisable(false);
		} catch (NumberFormatException ex) {
			statusText.setText("FAIL");
			resultText.setText(ex.getMessage() + " \nthis is not a number\nUpload a file with valid data");
			uploadButton.setDisable(false);
		} 

		for (Customer c : customerList) {
			System.out.println(c);
		}
		
	}

    public static void main(String[] args) {
        launch(args);
    }

}
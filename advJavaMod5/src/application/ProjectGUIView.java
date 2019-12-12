package application;
import javafx.collections.*;
import javafx.event.*;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.text.*;

public class ProjectGUIView {
	private TextField projNameField, projEstCostField;
	private Text nameLabel, estCostLabel, intro, projInfoLabel;
	private TextArea projInfo;
	private Button addButton, infoButton, budgetBreakdownButton;
	private VBox mainBox;
	
	private final static Font font = Font.font("Courier", 20);
	
	public ProjectGUIView() {
		System.setProperty("glass.accessible.force", "false");
		
		mainBox = new VBox();
		mainBox.setAlignment(Pos.CENTER);
		mainBox.setSpacing(20);
		mainBox.setStyle("-fx-background-color: white");
		
		intro = new Text("Add a project or \nget info about current projects");
		intro.setFont(font);
		VBox introBox = new VBox(intro);
		introBox.setAlignment(Pos.CENTER);
		introBox.setSpacing(10);
		mainBox.getChildren().add(intro);
		
		nameLabel = new Text("Project Name");
		nameLabel.setFont(font);
		projNameField = new TextField();
		VBox projNameBox = new VBox(nameLabel, projNameField);
		projNameBox.setAlignment(Pos.CENTER);
		projNameBox.setSpacing(10);
		mainBox.getChildren().add(projNameBox);
		
		estCostLabel = new Text("Estimated Cost");
		estCostLabel.setFont(font);
		projEstCostField = new TextField();
		VBox projCostBox = new VBox(estCostLabel, projEstCostField);
		projCostBox.setAlignment(Pos.CENTER);
		projCostBox.setSpacing(10);
		mainBox.getChildren().add(projCostBox);
		
		addButton = new Button("Add Project");
		infoButton = new Button("See project information");
		budgetBreakdownButton = new Button("Monthly Cost");
		
		HBox buttonBox = new HBox(addButton, infoButton, budgetBreakdownButton);
		buttonBox.setAlignment(Pos.CENTER);
		buttonBox.setSpacing(10);
		mainBox.getChildren().add(buttonBox);
	}
	
	public void displayProjInfo(String label, String info) {
		projInfoLabel.setVisible(true);
		projInfoLabel.setText(label);
		
		projInfo.clear();
		projInfo.setVisible(true);
		projInfo.setText(info);
	}
	
	public void hideProjInfo() {
		projInfo.clear();
		projInfo.setVisible(false);
		projInfoLabel.setVisible(false);
	}
	
	public Parent getParent() {
		return mainBox;
	}
	
	public void setAddProjectAction(EventHandler<ActionEvent> handler) {
		addButton.setOnAction(handler);
	}	
	
	public void clearInputs() {
		projNameField.clear();
		projEstCostField.clear();
	}
	
	public String getProjNameField() {
		return projNameField.getText();
	}

    public String getProjEstCostField() {
		return projEstCostField.getText();
	}
    
    public void setProjNameField(String text) {
    	projNameField.setText(text);
    }
    
    public void setProjEstCostField(String text) {
    	projEstCostField.setText(text);
    }
}

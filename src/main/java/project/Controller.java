package project;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {
    @FXML
    private Button myButton; // Example control

    @FXML
    private Label myLabel; // Example control

    @FXML
    private void handleButtonClick() {
        myLabel.setText("Button Clicked!");
    }
}

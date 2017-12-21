package viikko7;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

public class Controller implements Initializable {
    
    @FXML
    private Button but1;
    @FXML
    private Button but2;
    @FXML
    private Label label;
    @FXML
    private Button but3;
    @FXML
    private TextField field1;
    @FXML
    private TextField field2;
    @FXML
    private TextField field3;
    @FXML
    private TextField field4;
    
    @FXML
    private void handleAction(ActionEvent event) {

        String text = "Hello world!";
        
        label.setText(text);
    }
    
    @FXML
    private void textc(ActionEvent event) {

        System.out.println("Hello world");
    }
    
    @FXML
    private void textm(ActionEvent event) {

    	String s = field1.getText();
    	field2.setText(s);
    }
    
    
    @FXML
    private void text(ActionEvent event) {

    	String ss = field3.getText();
    	field4.setText(ss);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    
}
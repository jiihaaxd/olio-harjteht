package viikko9;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Mainclass9 extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Viikko7");
        
        Parent root = FXMLLoader.load(getClass().getResource("v9.fxml"));
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
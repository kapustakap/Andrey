package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import java.io.IOException;

public class Controller {

    @FXML
    private Button button;

    public void initialize() {
        button.setOnAction(actionEvent -> {
            button.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("introduction.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
                Parent root = loader.getRoot();
                Stage stage = new Stage();
                stage.setScene(new Scene(root, 600, 400));
                stage.show();


            }
        });
    }
}
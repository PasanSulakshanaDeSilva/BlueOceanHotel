package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class RoomsFormController {

    public AnchorPane RoomsContext;

    public void AddRoomOnAction(ActionEvent actionEvent) {
        new Alert(Alert.AlertType.INFORMATION,"Add Success!!!!").show();
    }

    public void DeleteRoomOnAction(ActionEvent actionEvent) {
        new Alert(Alert.AlertType.INFORMATION,"Delete  Success!!!!").show();
    }

    public void ModifyRoomOnAction(ActionEvent actionEvent) {
        new Alert(Alert.AlertType.INFORMATION,"Modify Success!!!!").show();
    }

    public void BackOnAction(ActionEvent actionEvent) throws IOException {
        setUi("AdminForm");
    }

    private void setUi(String location) throws IOException {
        Stage stage=(Stage) RoomsContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/"+location+".fxml"))));
    }
}

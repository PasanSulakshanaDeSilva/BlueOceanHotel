package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class REserverSingleRoomController {
    public AnchorPane SingleRoomContext;

    public void AdOnAction(ActionEvent actionEvent) {
        new Alert(Alert.AlertType.INFORMATION,"Add Success!!!!").show();
    }

    public void backOnAction(ActionEvent actionEvent) throws IOException {
        setUi("CheckRoomAvailabilityForm");
    }

    public void room1OnAction(ActionEvent actionEvent) {
    }
    private void setUi(String location) throws IOException {
        Stage stage=(Stage) SingleRoomContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/"+location+".fxml"))));
    }
}

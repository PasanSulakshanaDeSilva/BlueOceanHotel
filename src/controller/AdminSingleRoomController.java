package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminSingleRoomController {
    public AnchorPane RoomADDContext;

    public void ADDroomOnAction(ActionEvent actionEvent) {
        new Alert(Alert.AlertType.INFORMATION,"Add Success!!!!").show();
    }

    public void DeleteRoomOnAction(ActionEvent actionEvent) {
        new Alert(Alert.AlertType.INFORMATION,"Delete Success!!!!").show();
    }

    public void ModifyOnAction(ActionEvent actionEvent) {
        new Alert(Alert.AlertType.INFORMATION,"Modify Success!!!!").show();
    }

    public void room1OnAction(ActionEvent actionEvent) {
    }

    public void backOnAction(ActionEvent actionEvent) throws IOException {
        setUi("AdminRoomsForm");
    }

    public void editOnAction(ActionEvent actionEvent) {
        new Alert(Alert.AlertType.INFORMATION,"Edit  Success!!!!").show();
    }
    private void setUi(String location) throws IOException {
        Stage stage=(Stage)  RoomADDContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/"+location+".fxml"))));
    }
}

package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ReceptionOptionsController {
    public AnchorPane receptionOptionContext;

    public void reserverRoomOnAction(ActionEvent actionEvent) throws IOException {
        setUi("ResRoomForm");
    }

    public void backOnAction(ActionEvent actionEvent) throws IOException {
        setUi("ReceptionForm");
    }

    public void markRoomOnAction(ActionEvent actionEvent) throws IOException {
        setUi("MarkRoomMaintenceForm");
    }
    private void setUi(String location) throws IOException {
        Stage stage=(Stage) receptionOptionContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/"+location+".fxml"))));
    }
}

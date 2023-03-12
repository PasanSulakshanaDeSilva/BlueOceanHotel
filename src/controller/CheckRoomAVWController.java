package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class CheckRoomAVWController {
    public AnchorPane RoomsTypeContext;

    public void SingleRoomOnAction(ActionEvent actionEvent) throws IOException {
        setUi("ResSingleRoomForm");
    }

    public void DoubleRoomOnAction(ActionEvent actionEvent) throws IOException {
        setUi("ResDoubleRoomForm");
    }

    public void TripleRoomOnAction(ActionEvent actionEvent) throws IOException {
        setUi("ResTripleRoomForm");
    }

    public void QuadRoomOnAction(ActionEvent actionEvent) throws IOException {
        setUi("ResSquadRoomForm");
    }

    public void BackOnAction(ActionEvent actionEvent) throws IOException {
        setUi("ResRoomForm");
    }
    private void setUi(String location) throws IOException {
        Stage stage=(Stage) RoomsTypeContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/"+location+".fxml"))));
    }
}

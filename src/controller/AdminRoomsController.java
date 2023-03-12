package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminRoomsController {
    public AnchorPane roomcontext;

    public void SingleRoomONAction(ActionEvent actionEvent) throws IOException {
        setUi("AdminSingleRoomForm");
    }

    public void DoubleRoomOnAction(ActionEvent actionEvent) throws IOException {
        setUi("AdminDoubleRoomForm");
    }

    public void TripleRoomOnAction(ActionEvent actionEvent) throws IOException {
    setUi("AdminTripleRoomForm");
    }

    public void QuadRoomOnAction(ActionEvent actionEvent) throws IOException {
        setUi("AdminSquadRoomForm");
    }
    private void setUi(String location) throws IOException {
        Stage stage=(Stage) roomcontext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/"+location+".fxml"))));
    }

    public void backOnAction(ActionEvent actionEvent) throws IOException {
        setUi("AdminOptionForm");
    }
}

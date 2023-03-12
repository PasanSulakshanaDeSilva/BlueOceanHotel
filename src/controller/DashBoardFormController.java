package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class DashBoardFormController {
    public AnchorPane dashBoardContext;

    public void AdminOnAction(ActionEvent actionEvent) throws IOException {
        setUi("AdminForm");
    }

    public void ReceptionOnAction(ActionEvent actionEvent) throws IOException {
        setUi("ReceptionForm");
    }

    private void setUi(String location) throws IOException {
        Stage stage=(Stage) dashBoardContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/"+location+".fxml"))));
    }
}

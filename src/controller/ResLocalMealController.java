package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ResLocalMealController {
    public AnchorPane ResLocalContext;

    public void backOnAction(ActionEvent actionEvent) throws IOException {
        setUi("ReceptionMealPackagesForm");
    }

    public void package1OnAction(ActionEvent actionEvent) throws IOException {

    }

    public void package2OnAction(ActionEvent actionEvent) {
    }

    public void package3OnAction(ActionEvent actionEvent) {
    }
    private void setUi(String location) throws IOException {
        Stage stage=(Stage) ResLocalContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/"+location+".fxml"))));
    }
}

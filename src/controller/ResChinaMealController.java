package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ResChinaMealController {


    public AnchorPane ReschinamealContext;

    public void Package1OnAction(ActionEvent actionEvent) {
    }

    public void package3OnAction(ActionEvent actionEvent) {
    }

    public void package2OnAction(ActionEvent actionEvent) {
    }

    public void backOnAction(ActionEvent actionEvent) throws IOException {
        setUi("ReceptionMealPackagesForm");
    }
    private void setUi(String location) throws IOException {
        Stage stage=(Stage) ReschinamealContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/"+location+".fxml"))));
    }
}

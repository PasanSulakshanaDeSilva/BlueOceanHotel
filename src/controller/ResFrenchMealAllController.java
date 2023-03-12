package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ResFrenchMealAllController {
    public AnchorPane ResFrenchAllContext;

    public void Package1OnAction(ActionEvent actionEvent) throws IOException {
        setUi("ResItalyOneRottyForm");
    }

    public void Package2OnAction(ActionEvent actionEvent) {
    }

    public void Package3OnAction(ActionEvent actionEvent) {
    }

    public void backOnAction(ActionEvent actionEvent) throws IOException {
        setUi("ReceptionMealPackagesForm");
    }
    private void setUi(String location) throws IOException {
        Stage stage=(Stage)  ResFrenchAllContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/"+location+".fxml"))));
    }

}

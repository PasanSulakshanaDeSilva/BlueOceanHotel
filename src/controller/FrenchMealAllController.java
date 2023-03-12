package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class FrenchMealAllController {
    public AnchorPane FrenchAllContext;

    public void Package1OnAction(ActionEvent actionEvent) throws IOException {
        setUi("FrenchPackageForm");
    }

    public void Package2OnAction(ActionEvent actionEvent) {
    }

    public void Package3OnAction(ActionEvent actionEvent) {
    }

    public void backOnAction(ActionEvent actionEvent) throws IOException {
        setUi("AdminMealPackageForm");
    }
    private void setUi(String location) throws IOException {
        Stage stage=(Stage) FrenchAllContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/"+location+".fxml"))));
    }
}

package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ChineseMealController {
    public AnchorPane chinamealContext;

    public void Package1OnAction(ActionEvent actionEvent) {
    }

    public void package3OnAction(ActionEvent actionEvent) {
    }

    public void package2OnAction(ActionEvent actionEvent) {
    }

    public void backOnAction(ActionEvent actionEvent) throws IOException {
        setUi("AdminMealPackageForm");
    }
    private void setUi(String location) throws IOException {
        Stage stage=(Stage) chinamealContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/"+location+".fxml"))));
    }
}

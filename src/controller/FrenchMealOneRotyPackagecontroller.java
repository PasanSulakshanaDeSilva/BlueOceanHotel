package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class FrenchMealOneRotyPackagecontroller {

    public AnchorPane FrenchoooneRotyMealContext;

    public void BackOnAction(ActionEvent actionEvent) throws IOException {
        setUi("ResFrenchMealAllForm");
    }

    public void deleteOnAction(ActionEvent actionEvent) {
        new Alert(Alert.AlertType.INFORMATION,"Delete Success!!!!").show();
    }

    public void ADDonAction(ActionEvent actionEvent) {
        new Alert(Alert.AlertType.INFORMATION,"Add Success!!!!").show();
    }
    private void setUi(String location) throws IOException {
        Stage stage=(Stage)  FrenchoooneRotyMealContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/"+location+".fxml"))));
    }
}

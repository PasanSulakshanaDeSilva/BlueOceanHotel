package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminMealPackagesController {
    public AnchorPane AdminMealPackagecontext;

    public void LocalMealOnAction(ActionEvent actionEvent) throws IOException {
        setUi("LocalMealsForm");
    }

    public void ChinesMealsOnAction(ActionEvent actionEvent) throws IOException {
        setUi("ChineseMealForm");
    }

    public void FrenchMealOnAction(ActionEvent actionEvent) throws IOException {
        setUi("FrenchMealAllForm");
    }

    public void BackOnAction(ActionEvent actionEvent) throws IOException {
        setUi("AdminOptionForm");
    }
    private void setUi(String location) throws IOException {
        Stage stage=(Stage) AdminMealPackagecontext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/"+location+".fxml"))));
    }
}

package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ResMealPackagesController {
    public AnchorPane ResMealPackagecontext;

    public void LocalMealOnAction(ActionEvent actionEvent) throws IOException {
        setUi("ResLocalMealsForm");
    }

    public void ChinesMealsOnAction(ActionEvent actionEvent) throws IOException {
        setUi("ResChinaMealForm");
    }

    public void FrenchMealOnAction(ActionEvent actionEvent) throws IOException {
        setUi("ResFrenchMealAllForm");
    }

    public void BackOnAction(ActionEvent actionEvent) throws IOException {
        setUi("ResRoomForm");
    }
    private void setUi(String location) throws IOException {
        Stage stage=(Stage) ResMealPackagecontext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/"+location+".fxml"))));
    }
}

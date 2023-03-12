package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminOptionController {
    public AnchorPane AdminOptionContext;

    public void BackOnAction(ActionEvent actionEvent) throws IOException {
        setUi("AdminForm");
    }

    public void RoomOnAction(ActionEvent actionEvent) throws IOException {
        setUi("AdminRoomsForm");
    }

    public void MealPackagesOnAction(ActionEvent actionEvent) throws IOException {
    setUi("AdminMealPackageForm");
    }

    public void IncomeReportOnAction(ActionEvent actionEvent) throws IOException {
        setUi("AdminIncomeForm");
    }
    private void setUi(String location) throws IOException {
        Stage stage=(Stage) AdminOptionContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/"+location+".fxml"))));
    }
}

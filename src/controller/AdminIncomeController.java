package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminIncomeController {
    public AnchorPane incomeContext;

    public void backOnaction(ActionEvent actionEvent) throws IOException {
        setUi("AdminOptionForm");
    }

    public void ViewMonthlyOnAction(ActionEvent actionEvent) throws IOException {
        setUi("ViewMonthlyIncomeForm");

    }

    public void ViewAnnualyOnAtion(ActionEvent actionEvent) throws IOException {
        setUi("ViewAnnualyIncomeForm");
    }
    private void setUi(String location) throws IOException {
        Stage stage=(Stage) incomeContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/"+location+".fxml"))));
    }
}

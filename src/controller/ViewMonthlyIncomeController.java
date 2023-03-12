package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewMonthlyIncomeController {
    public AnchorPane MonthlyContext;

    public void backOnAction(ActionEvent actionEvent) throws IOException {
        setUi("AdminIncomeForm");
    }
    private void setUi(String location) throws IOException {
        Stage stage=(Stage) MonthlyContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/"+location+".fxml"))));
    }
}

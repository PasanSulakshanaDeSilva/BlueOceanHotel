package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ReserverRoomController {
    public AnchorPane reseverContext;

    public void checkRoomOnAction(ActionEvent actionEvent) throws IOException {
        setUi("CheckRoomAvailabilityForm");
    }

    public void SelectMealOnAction(ActionEvent actionEvent) throws IOException {
        setUi("ReceptionMealPackagesForm");
    }

    public void AddGuestOnAction(ActionEvent actionEvent) throws IOException {
        setUi("AddGuestDetailsForm");
    }

    public void backOnAction(ActionEvent actionEvent) throws IOException {
        setUi("ReceptionOptionForm");
    }
    private void setUi(String location) throws IOException {
        Stage stage=(Stage) reseverContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/"+location+".fxml"))));
    }
}

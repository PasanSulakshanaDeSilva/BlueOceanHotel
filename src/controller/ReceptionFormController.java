package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ReceptionFormController {
    public TextField UsernameTXT;
    public PasswordField passwordTxt;
    public AnchorPane receptionContext;

    public void backOnaction(ActionEvent actionEvent) throws IOException {
        setUi("DashBoardForm");
    }

    public void LoginOnAction(ActionEvent actionEvent) throws IOException {
        System.out.println(UsernameTXT.getText());
        String tempUsername=UsernameTXT.getText();
        String tempPassword=passwordTxt.getText();
        if (tempUsername.equals("User")&&tempPassword.equals("7027")){
            new Alert(Alert.AlertType.CONFIRMATION,"SUCCESS!").show();
            setUi("ReceptionOptionForm");
        }else{
            new Alert(Alert.AlertType.WARNING,"Try Again!!").show();
        }

    }
    private void setUi(String location) throws IOException {
        Stage stage=(Stage) receptionContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/"+location+".fxml"))));
    }
}

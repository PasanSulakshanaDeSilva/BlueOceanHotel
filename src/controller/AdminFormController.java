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

public class AdminFormController {
    public AnchorPane adminFormContext;
    public TextField usernameTXT;
    public PasswordField passwordTXT;


    public void BackHomeOnAction(ActionEvent actionEvent) throws IOException {
        setUi("DashBoardForm");
    }
    public void LoginOnAction(ActionEvent actionEvent) throws IOException {
        System.out.println(usernameTXT.getText());
        String tempUsername=usernameTXT.getText();
        String tempPassword=passwordTXT.getText();
        if (tempUsername.equals("Pasi")&&tempPassword.equals("Pasi@2003")){
            new Alert(Alert.AlertType.CONFIRMATION,"SUCCESS!").show();;
            setUi("AdminOptionForm");
        }else{
            new Alert(Alert.AlertType.WARNING,"Try Again!!").show();
        }
    }

    private void setUi(String location) throws IOException {
        Stage stage=(Stage) adminFormContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/"+location+".fxml"))));
    }


}

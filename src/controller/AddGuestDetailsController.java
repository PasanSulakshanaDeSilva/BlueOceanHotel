package controller;

import db.Dataset;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.Guest;

import java.io.IOException;

public class AddGuestDetailsController {
    public AnchorPane guestDetailsContext;
    public TextField emailTxt;
    public TextField addressTxt;
    public TextField nicTxt;
    public TextField telephoneTxt;
    public TextField nameTxt;

    public void backOnAction(ActionEvent actionEvent) throws IOException {
    setUi("ResRoomForm");
    }



    public void UpdateOnAction(ActionEvent actionEvent) {
        new Alert(Alert.AlertType.INFORMATION,"Update Success!!!!").show();
    }

    public void RemoveOnAction(ActionEvent actionEvent) {
        for (Guest temp: Dataset.guestArrayList){
            if(temp.getName().equals(nameTxt.getText())){
                Dataset.guestArrayList.remove(temp);
                new Alert(Alert.AlertType.WARNING,"Delete Success!!!!!");
                return;
            }
        }
        new Alert(Alert.AlertType.WARNING,"Empty Result!!!!");
    }
    private void setUi(String location) throws IOException {
        Stage stage=(Stage) guestDetailsContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/"+location+".fxml"))));
    }


    public void saveOnAction(ActionEvent actionEvent) {
        Guest guest = new Guest(
                nicTxt.getText(), nameTxt.getText(), emailTxt.getText(), telephoneTxt.getText(), addressTxt.getText());
        if (Dataset.guestArrayList.add(guest))
            new Alert(Alert.AlertType.CONFIRMATION, "Saved!!").show();
    else{
            new Alert(Alert.AlertType.ERROR,"Something Went Wrong!!!").show();
        }

    }
    public void SearchtotableOnAction(ActionEvent actionEvent) {
        search();
    }
    public void searchNameOnAction(ActionEvent actionEvent) {
        search();
    }
    private void search(){
        for (Guest temp: Dataset.guestArrayList){
            if(temp.getName().equals(nameTxt.getText())){
              nicTxt.setText(temp.getNic());
                emailTxt.setText(temp.getEmail());
                telephoneTxt.setText(temp.getTelephone());// iterate krnn[e kiyanne ema okkoma search krla hrima customer kaud blnn
                addressTxt.setText(temp.getAddress());
                return;
            }
        }
        new Alert(Alert.AlertType.WARNING,"Empty Result!!!!");
    }
}

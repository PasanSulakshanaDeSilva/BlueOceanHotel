package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MarkRoomMaintenceController {
    public AnchorPane MainteneneContext;
    public ComboBox <String>RoomTypecmb;
    public ComboBox <String>RoomNumbercmb;
    public TextArea textAreaMaintain;


    public void backOnAction(ActionEvent actionEvent) throws IOException {
        setUi("ReceptionOptionForm");
    }
    private void setUi(String location) throws IOException {
        Stage stage=(Stage) MainteneneContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/"+location+".fxml"))));
    }

    public void AddOnAction(ActionEvent actionEvent) {
        textAreaMaintain.setText(RoomTypecmb.getValue()+"\t"+RoomNumbercmb.getValue());
    }
    public void initialize(){
        ObservableList<String >Rt= FXCollections.observableArrayList();
        Rt.add("Single");
        Rt.add("Double");
        Rt.add("Triple");
        Rt.add("Quad");
        RoomTypecmb.setItems(Rt);

        ObservableList<String >RiD=FXCollections.observableArrayList();
        RiD.add("s0001");
        RiD.add("s0002");
        RiD.add("s0003");
        RiD.add("s0004");
        RiD.add("s0005");
        RiD.add("s0006");
        RiD.add("d0001");
        RiD.add("d0002");
        RiD.add("d0003");
        RiD.add("d0004");
        RiD.add("d0005");
        RiD.add("d0006");
        RiD.add("t0001");
        RiD.add("t0002");
        RiD.add("t0003");
        RiD.add("t0004");
        RoomNumbercmb.setItems(RiD);

    }
}

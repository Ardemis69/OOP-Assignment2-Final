package com.example.oopassignment2final;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class TodoViewController implements Initializable {

    @FXML
    private Button addTaskBtn;

    @FXML
    private TextField descTextField;

    @FXML
    private TextField priorityTextField;

    @FXML
    private TextField titleTextField;

    @FXML
    private ListView<Tasks> todoListView;

    @FXML
    void submit(ActionEvent event) {

    }

    ObservableList<Tasks> list= FXCollections.observableArrayList();
    private void addTaskBtn( Event e){
        Tasks t5 = new Tasks(titleTextField.getText(),descTextField.getText(), Integer.parseInt(priorityTextField.getText()));

        list.add(t5);
        //todoListView.setItems(list);

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        //Tasks t5 = new Tasks(titleTextField.getText(),descTextField.getText(), Integer.parseInt(priorityTextField.getText()));

        //todoListView.getItems().addAll();

        todoListView.setItems(list);

    }
}

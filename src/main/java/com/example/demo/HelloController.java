package com.example.demo;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private TableColumn<znak, String> client;

    @FXML
    private TableColumn<znak, String> data;

    @FXML
    private TableColumn<znak, String> forma;

    @FXML
    private TableColumn<znak, String> full_name;

    @FXML
    private TableColumn<znak, String> id;

    @FXML
    private TableColumn<znak, String> nomer;

    @FXML
    private TableColumn<znak, String> organ;

    @FXML
    private TableColumn<znak, String> short_name;
    @FXML
    private TableView<znak> table;

List<znak> znaks = Arrays.asList(new znak("Сидоров Вадим Александрович", "ООО","Агросервис","123","1", "ФНС","Агро","12.06.2023"),
        new znak("Сидорик Владимир Александрович", "ЗАО","Магнит","12","2", "ФНС","Мага","1.10.2023"),
        new znak("Зенцов Сергей Сергеевич", "ИП","Золотые ручки ","44","3", "ФНС","ручки","11.01.2023"),
        new znak("Донской Валерий Сергеевич", "ООО","Сельмаш цех ","02","4", "ФНС","Сельмаш","15.11.2023"));
ArrayList<znak> arrznak = new ArrayList<>(znaks);

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        client.setCellValueFactory(new PropertyValueFactory<znak,String>("client"));
        forma.setCellValueFactory(new PropertyValueFactory<znak,String>("forma"));
        full_name.setCellValueFactory(new PropertyValueFactory<znak,String>("full_name"));
        id.setCellValueFactory(new PropertyValueFactory<znak,String>("id"));
        nomer.setCellValueFactory(new PropertyValueFactory<znak,String>("nomer"));
        organ.setCellValueFactory(new PropertyValueFactory<znak,String>("organ"));
        short_name.setCellValueFactory(new PropertyValueFactory<znak,String>("short_name"));
        data.setCellValueFactory(new PropertyValueFactory<znak,String>("data"));
        table.setItems(FXCollections.observableList(arrznak));
    }
}

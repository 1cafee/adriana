package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class TemperaturaController {

    @FXML
    private Label lbl_mes;

    @FXML
    private Button btn_check;

    @FXML
    private Button btn_voltar;

    @FXML
    private TextField txt_mes;

    @FXML
    void checar(ActionEvent event) {
        int temperatura = Integer.parseInt(txt_mes.getText());
        switch (temperatura) {
            case 1:
                lbl_mes.setText("Janeiro - 24C, Temperatura Agradavel");
                break;
            case 2:
                lbl_mes.setText("Fevereiro - 24C, Temperatura Agradavel");
                break;
            case 3:
                lbl_mes.setText("Março- 24C, Temperatura Agradavel");
                break;
            case 4:
                lbl_mes.setText("Abril - 22C, Temperatura Agradavel");
                break;
            case 5:
                lbl_mes.setText("Maio - 19C, Temperatura Agradavel");
                break;
            case 6:
                lbl_mes.setText("Junho - 18C, Frio");
                break;
            case 7:
                lbl_mes.setText("Julho - 18C, Frio");
                break;
            case 8:
                lbl_mes.setText("Agosto - 19C, Temperatura Agradavel");
                break;
            case 9:
                lbl_mes.setText("Setembro - 20C, Temperatura Agradavel");
                break;
            case 10:
                lbl_mes.setText("Outubro - 22C, Temperatura Agradavel");
                break;
            case 11:
                lbl_mes.setText("Novembro - 23C, Temperatura Agradavel");
                break;
            case 12:
                lbl_mes.setText("Dezembro - 24C, Temperatura Agradavel");
                break;
            default:
        }

    }

    @FXML
    void voltar(ActionEvent event) throws IOException {
        App.setRoot("menu");
    }

}

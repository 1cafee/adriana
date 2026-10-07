package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class CamelosController {

    @FXML
    private Button btn_calculo;

    @FXML
    private Button btn_voltar;

    @FXML
    private Label totalcamelos;

    @FXML
    private TextField txt_camelos;

    @FXML
    void calcula_camelos(ActionEvent event) {
        double old, mid, bot, restante;
        double camelos = Double.parseDouble(txt_camelos.getText());
        old = (camelos / 2);
        mid = (camelos / 3);
        bot = (camelos / 9 );
        restante = camelos - old - mid - bot;
        totalcamelos.setText("O mais velho terá "+old+" camelos.\n"
                +"O do meio terá "+mid+" camelos.\n"
                + "O mais novo terá "+bot+" camelos.\n"
                +"E no fim ainda sobrará "+restante+" camelos!\n");
    }

    @FXML
    void voltar(ActionEvent event) throws IOException {
        App.setRoot("menu");
    }

}

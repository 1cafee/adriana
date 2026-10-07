package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;

public class ViagemController {

    @FXML
    private Button btn_voltar;

    @FXML
    private TextField txt_combustivel;

    @FXML
    private TextField txt_kms_viagem;

    @FXML
    void voltar(ActionEvent event) throws IOException {
        App.setRoot("menu");
    }

}

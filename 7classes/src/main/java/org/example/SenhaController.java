package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;

public class SenhaController {

    @FXML
    private Button btn_entrar;

    @FXML
    private Button btn_voltar;

    @FXML
    private Label lbl_senharesult;

    @FXML
    void entrar(ActionEvent event) {

    }

    @FXML
    void voltar(ActionEvent event) throws IOException {
        App.setRoot("menu");
    }

}

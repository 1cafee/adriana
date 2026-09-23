package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class MenuController {

    @FXML
    private Button btn_aluguel;

    @FXML
    private Button btn_camelos;

    @FXML
    private Button btn_descontos;

    @FXML
    private Button btn_multiplo;

    @FXML
    private Button btn_senha;

    @FXML
    private Button btn_tempetura;

    @FXML
    private Button btn_viagem;

    @FXML
    void aluguel(ActionEvent event) throws IOException {
        App.setRoot("aluguel");
    }

    @FXML
    void camelos(ActionEvent event) throws IOException {
        App.setRoot("camelos");
    }

    @FXML
    void descontos(ActionEvent event) throws IOException {
        App.setRoot("descontos");
    }

    @FXML
    void multiplo(ActionEvent event) throws IOException {
        App.setRoot("multiplo");
    }

    @FXML
    void senha(ActionEvent event) throws IOException {
        App.setRoot("senha");
    }

    @FXML
    void temperatura(ActionEvent event) throws IOException {
        App.setRoot("temperatura");
    }

    @FXML
    void viagem(ActionEvent event) throws IOException {
        App.setRoot("viagem");
    }

}

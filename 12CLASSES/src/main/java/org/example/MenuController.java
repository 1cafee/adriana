package org.example;

import java.io.IOException;
import javafx.fxml.FXML;

public class MenuController {

    @FXML
    private void abrirCamisaSocial() throws IOException {
        App.setRoot("camisaSocial");
    }

    @FXML
    private void abrirCalcaSocial() throws IOException {
        App.setRoot("calcaSocial");
    }

    @FXML
    private void abrirTerno() throws IOException {
        App.setRoot("terno");
    }

    @FXML
    private void abrirBicicletaTrilha() throws IOException {
        App.setRoot("bicicletaTrilha");
    }

    @FXML
    private void abrirCiclista() throws IOException {
        App.setRoot("ciclista");
    }

    @FXML
    private void abrirTrilha() throws IOException {
        App.setRoot("trilha");
    }

    @FXML
    private void abrirMascaraMadeira() throws IOException {
        App.setRoot("mascaraMadeira");
    }

    @FXML
    private void abrirMascaraPintada() throws IOException {
        App.setRoot("mascaraPintada");
    }

    @FXML
    private void abrirMascaraCerimonial() throws IOException {
        App.setRoot("mascaraCerimonial");
    }

    @FXML
    private void abrirPenteadoCurto() throws IOException {
        App.setRoot("penteadoCurto");
    }

    @FXML
    private void abrirPenteadoLongo() throws IOException {
        App.setRoot("penteadoLongo");
    }

    @FXML
    private void abrirPenteadoEspetado() throws IOException {
        App.setRoot("penteadoEspetado");
    }
}

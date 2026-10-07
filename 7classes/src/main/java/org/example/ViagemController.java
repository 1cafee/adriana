
package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class ViagemController {


    @FXML
    private Label resultadoviagem;

    @FXML
    private Button btn_calcular;

    @FXML
    private Button btn_voltar;

    @FXML
    private TextField txt_combustivel;

    @FXML
    private TextField txt_kms_viagem;

    @FXML
    void calculaviagem(ActionEvent event) {
        double litros, preco;
        Double kms = Double.parseDouble(txt_kms_viagem.getText());
        Double combus = Double.parseDouble(txt_combustivel.getText());
        litros = (kms / 12);
        if (kms > 500) {
            preco = (litros * combus * 0.95);
            resultadoviagem.setText("A viagem vai custar: R$" + preco);

        } else {
            preco = (litros * combus);
            resultadoviagem.setText("A viagem vai custar: R$" + preco);
        }

    }

    @FXML
    void voltar(ActionEvent event) throws IOException {
        App.setRoot("menu");
    }

}

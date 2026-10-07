
package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class AluguelController {

    @FXML
    private Button btn_calculo;

    @FXML
    private Button btn_voltar;

    @FXML
    private Label totalalugel;

    @FXML
    private TextField txt_dias;

    @FXML
    private TextField txt_kms;

    @FXML
    void calcula_aluguel(ActionEvent event) {
        double taxa, total;
        int diaria = Integer.parseInt(txt_dias.getText());
        double kms = Double.parseDouble(txt_kms.getText());
        if (kms / diaria > 100){
            taxa = (kms / diaria - 100 );
            total = ( diaria * 200 + (taxa * 1.50));
        }
        else{
            total = (diaria * 200);

        }
        totalalugel.setText("O seu total ficou em: R$"+ total);

    }

    @FXML
    void voltar(ActionEvent event) throws IOException {
        App.setRoot("menu");
    }

}

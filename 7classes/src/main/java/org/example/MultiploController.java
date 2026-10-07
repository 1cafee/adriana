
package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class MultiploController {

    @FXML
    private Label resultmultiplo;

    @FXML
    private Button btn_calculo;

    @FXML
    private Button btn_voltar;

    @FXML
    private TextField txt_num1;

    @FXML
    private TextField txt_num2;

    @FXML
    void calculamultiplo(ActionEvent event) {
        int num1 = Integer.parseInt(txt_num1.getText());
        int num2 = Integer.parseInt(txt_num2.getText());
        double result;
        result = num1 % num2;

        if (result == 0) {
            resultmultiplo.setText("Os números são multilplos.");
        }
        else {
            resultmultiplo.setText("Os números não são multiplos.");
        }


    }


    @FXML
    void voltar(ActionEvent event) throws IOException {
        App.setRoot("menu");
    }

}

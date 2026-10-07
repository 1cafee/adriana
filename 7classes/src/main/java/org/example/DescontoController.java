package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;

public class DescontoController {

    @FXML
    private Button btn_verify;

    @FXML
    private Button btn_voltar;

    @FXML
    private Label totalcamelos2;

    @FXML
    private Label totaldesconto;

    @FXML
    void verificadesc(ActionEvent event) {

        int arroz = 30, feijao = 20, oleo= 7, acucar = 4, cafe = 30, macarrao = 3, farinha = 6, fuba = 3, molho =3, sal = 3;
        double subtotal = arroz + feijao + oleo + acucar + cafe + macarrao + farinha + fuba + molho + sal;

        double desconto;
        if (subtotal > 100){
            desconto = (subtotal - (subtotal * 0.10));

        }
        else {desconto = subtotal;
        }
        totaldesconto.setText("Total: R$"+ desconto);
    }

    @FXML
    void voltar(ActionEvent event) throws IOException {
        App.setRoot("menu");
    }

}

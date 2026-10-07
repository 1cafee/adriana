package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.Scanner;

public class SenhaController {


    Scanner s = new Scanner(System.in);

    @FXML
    private Button btn_entrar;

    @FXML
    private Button btn_voltar;

    @FXML
    private Label lbl_senharesult;

    @FXML
    private TextField txt_senha;

    @FXML
    void entrar(ActionEvent event) {
        int senhacorreta = 1234;

       int senha = Integer.parseInt(txt_senha.getText());

        if (senha == senhacorreta) {
            lbl_senharesult.setText("Acesso Permitido!");}

        else {lbl_senharesult.setText("Acesso Negado.");

        }
    }
    @FXML
    void voltar(ActionEvent event) throws IOException {
        App.setRoot("menu");
    }
}

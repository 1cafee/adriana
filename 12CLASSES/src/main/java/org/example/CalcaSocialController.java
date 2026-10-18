package org.example;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalcaSocialController {
    @FXML private TextField marcaField;
    @FXML private TextField tamanhoField;
    @FXML private TextField precoField;
    @FXML private Label resultadoLabel;

    @FXML
    private void executar() {
        try {
            CalcaSocial objeto = new CalcaSocial(texto(marcaField), texto(tamanhoField), decimal(precoField));
            resultadoLabel.setText(objeto.gerarEtiqueta()
                    + "\nValor com ajuste de R$ 20: R$ " + objeto.calcularValorComAjuste(20));
        } catch (IllegalArgumentException ex) {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Dados inválidos");
            alerta.setHeaderText("Confira os campos preenchidos");
            alerta.setContentText("Preencha todos os campos. Nos campos numéricos, use apenas números (pode usar vírgula ou ponto nos decimais). ");
            alerta.showAndWait();
        }
    }

    private String texto(TextField campo) {
        String valor = campo.getText();
        if (valor == null || valor.trim().isEmpty()) {
            throw new IllegalArgumentException("Campo obrigatório");
        }
        return valor.trim();
    }

    private double decimal(TextField campo) {
        return Double.parseDouble(texto(campo).replace(',', '.'));
    }

    private int inteiro(TextField campo) {
        return Integer.parseInt(texto(campo));
    }

    @FXML
    private void voltar() throws IOException {
        App.setRoot("menu");
    }
}

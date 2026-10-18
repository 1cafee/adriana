package org.example;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MascaraCerimonialController {
    @FXML private TextField nomeField;
    @FXML private TextField finalidadeField;
    @FXML private TextField estadoConservacaoField;
    @FXML private Label resultadoLabel;

    @FXML
    private void executar() {
        try {
            MascaraCerimonial objeto = new MascaraCerimonial(texto(nomeField), texto(finalidadeField), texto(estadoConservacaoField));
            resultadoLabel.setText(objeto.mostrarFicha()
                    + "\nEstá bem conservada: " + (objeto.estaBemConservada() ? "Sim" : "Não"));
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

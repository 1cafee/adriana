package org.example;

public class PenteadoLongo {
    private String cor;
    private String tipoFranja;
    private double comprimentoCm;

    public PenteadoLongo(String cor, String tipoFranja, double comprimentoCm) {
        this.cor = cor;
        this.tipoFranja = tipoFranja;
        this.comprimentoCm = comprimentoCm;
    }

    public double calcularComprimentoFinal(double acrescimoCm) {
        return comprimentoCm + Math.max(0, acrescimoCm);
    }

    public void alterarFranja(String novaFranja) {
        tipoFranja = novaFranja;
    }

    public String descricao() {
        return String.format("Penteado longo | Cor: %s | Franja: %s | %.1f cm", cor, tipoFranja, comprimentoCm);
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipoFranja() {
        return tipoFranja;
    }

    public void setTipoFranja(String tipoFranja) {
        this.tipoFranja = tipoFranja;
    }

    public double getComprimentoCm() {
        return comprimentoCm;
    }

    public void setComprimentoCm(double comprimentoCm) {
        this.comprimentoCm = comprimentoCm;
    }
}

package org.example;

public class CamisaSocial {
    private String marca;
    private String tamanho;
    private double preco;

    public CamisaSocial(String marca, String tamanho, double preco) {
        this.marca = marca;
        this.tamanho = tamanho;
        this.preco = preco;
    }

    public double calcularPrecoComDesconto(double percentual) {
        double desconto = Math.max(0, Math.min(100, percentual));
        return preco - (preco * desconto / 100);
    }

    public boolean confereTamanho(String tamanhoDesejado) {
        return tamanho != null && tamanho.equalsIgnoreCase(tamanhoDesejado);
    }

    public String gerarEtiqueta() {
        return String.format("Camisa social: %s | Tamanho: %s | R$ %.2f", marca, tamanho, preco);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}

package org.example;

public class BicicletaTrilha {
    private String marca;
    private int aro;
    private int marchaAtual;

    public BicicletaTrilha(String marca, int aro, int marchaAtual) {
        this.marca = marca;
        this.aro = aro;
        this.marchaAtual = marchaAtual;
    }

    public String trocarMarcha(int novaMarcha) {
        if (novaMarcha < 1) {
            novaMarcha = 1;
        }
        this.marchaAtual = novaMarcha;
        return "Marcha trocada para " + marchaAtual + ".";
    }

    public String frear() {
        return "A bicicleta esta freando.";
    }

    public String exibirDados() {
        return String.format("Bicicleta %s | Aro %d | Marcha atual: %d", marca, aro, marchaAtual);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAro() {
        return aro;
    }

    public void setAro(int aro) {
        this.aro = aro;
    }

    public int getMarchaAtual() {
        return marchaAtual;
    }

    public void setMarchaAtual(int marchaAtual) {
        this.marchaAtual = marchaAtual;
    }
}

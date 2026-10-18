public class PenteadoCurto {
    private String cor;
    private String textura;
    private double comprimentoCm;

    public PenteadoCurto(String cor, String textura, double comprimentoCm) {
        this.cor = cor;
        this.textura = textura;
        this.comprimentoCm = comprimentoCm;
    }

    public void mudarCor(String novaCor) {
        cor = novaCor;
    }

    public String classificarComprimento() {
        return comprimentoCm <= 10 ? "Curto" : "Medio";
    }

    public String descricao() {
        return String.format("Penteado curto | Cor: %s | Textura: %s | %.1f cm", cor, textura, comprimentoCm);
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTextura() {
        return textura;
    }

    public void setTextura(String textura) {
        this.textura = textura;
    }

    public double getComprimentoCm() {
        return comprimentoCm;
    }

    public void setComprimentoCm(double comprimentoCm) {
        this.comprimentoCm = comprimentoCm;
    }
}

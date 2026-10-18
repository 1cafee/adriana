public class PenteadoEspetado {
    private String cor;
    private double alturaTopeteCm;
    private int nivelDetalhe;

    public PenteadoEspetado(String cor, double alturaTopeteCm, int nivelDetalhe) {
        this.cor = cor;
        this.alturaTopeteCm = alturaTopeteCm;
        this.nivelDetalhe = nivelDetalhe;
    }

    public void ajustarTopete(double novaAltura) {
        alturaTopeteCm = Math.max(0, novaAltura);
    }

    public int calcularPontosDeDetalhe() {
        return Math.max(0, nivelDetalhe) * 5;
    }

    public String descricao() {
        return String.format("Penteado espetado | Cor: %s | Topete: %.1f cm | Detalhe: %d", cor, alturaTopeteCm, nivelDetalhe);
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getAlturaTopeteCm() {
        return alturaTopeteCm;
    }

    public void setAlturaTopeteCm(double alturaTopeteCm) {
        this.alturaTopeteCm = alturaTopeteCm;
    }

    public int getNivelDetalhe() {
        return nivelDetalhe;
    }

    public void setNivelDetalhe(int nivelDetalhe) {
        this.nivelDetalhe = nivelDetalhe;
    }
}

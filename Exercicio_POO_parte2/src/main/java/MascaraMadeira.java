public class MascaraMadeira {
    private String origem;
    private String tipoMadeira;
    private double alturaCm;

    public MascaraMadeira(String origem, String tipoMadeira, double alturaCm) {
        this.origem = origem;
        this.tipoMadeira = tipoMadeira;
        this.alturaCm = alturaCm;
    }

    public double calcularAlturaEmMetros() {
        return alturaCm / 100.0;
    }

    public String descreverMaterial() {
        return "Peca feita em " + tipoMadeira + ", com origem em " + origem + ".";
    }

    public String mostrarFicha() {
        return String.format("Mascara de madeira | Origem: %s | Madeira: %s | Altura: %.1f cm", origem, tipoMadeira, alturaCm);
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getTipoMadeira() {
        return tipoMadeira;
    }

    public void setTipoMadeira(String tipoMadeira) {
        this.tipoMadeira = tipoMadeira;
    }

    public double getAlturaCm() {
        return alturaCm;
    }

    public void setAlturaCm(double alturaCm) {
        this.alturaCm = alturaCm;
    }
}

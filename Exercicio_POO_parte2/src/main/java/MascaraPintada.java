public class MascaraPintada {
    private String corPrincipal;
    private String estilo;
    private double preco;

    public MascaraPintada(String corPrincipal, String estilo, double preco) {
        this.corPrincipal = corPrincipal;
        this.estilo = estilo;
        this.preco = preco;
    }

    public void alterarCor(String novaCor) {
        corPrincipal = novaCor;
    }

    public double aplicarDesconto(double percentual) {
        double desconto = Math.max(0, Math.min(100, percentual));
        return preco - (preco * desconto / 100);
    }

    public String mostrarFicha() {
        return String.format("Mascara pintada | Cor: %s | Estilo: %s | R$ %.2f", corPrincipal, estilo, preco);
    }

    public String getCorPrincipal() {
        return corPrincipal;
    }

    public void setCorPrincipal(String corPrincipal) {
        this.corPrincipal = corPrincipal;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}

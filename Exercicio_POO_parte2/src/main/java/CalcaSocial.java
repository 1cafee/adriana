public class CalcaSocial {
    private String marca;
    private String tamanho;
    private double preco;

    public CalcaSocial(String marca, String tamanho, double preco) {
        this.marca = marca;
        this.tamanho = tamanho;
        this.preco = preco;
    }

    public void ajustarTamanho(String novoTamanho) {
        tamanho = novoTamanho;
    }

    public double calcularValorComAjuste(double custoAjuste) {
        return preco + Math.max(0, custoAjuste);
    }

    public String gerarEtiqueta() {
        return String.format("Calca social: %s | Tamanho: %s | R$ %.2f", marca, tamanho, preco);
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

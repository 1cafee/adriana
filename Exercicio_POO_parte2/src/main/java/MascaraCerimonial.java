public class MascaraCerimonial {
    private String nome;
    private String finalidade;
    private String estadoConservacao;

    public MascaraCerimonial(String nome, String finalidade, String estadoConservacao) {
        this.nome = nome;
        this.finalidade = finalidade;
        this.estadoConservacao = estadoConservacao;
    }

    public void atualizarConservacao(String novoEstado) {
        estadoConservacao = novoEstado;
    }

    public boolean estaBemConservada() {
        if (estadoConservacao == null) {
            return false;
        }
        String estado = estadoConservacao.toLowerCase();
        return estado.equals("boa") || estado.equals("otima") || estado.equals("ótima");
    }

    public String mostrarFicha() {
        return String.format("Mascara cerimonial | %s | Finalidade: %s | Conservacao: %s", nome, finalidade, estadoConservacao);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFinalidade() {
        return finalidade;
    }

    public void setFinalidade(String finalidade) {
        this.finalidade = finalidade;
    }

    public String getEstadoConservacao() {
        return estadoConservacao;
    }

    public void setEstadoConservacao(String estadoConservacao) {
        this.estadoConservacao = estadoConservacao;
    }
}

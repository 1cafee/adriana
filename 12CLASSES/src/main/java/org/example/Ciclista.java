package org.example;

public class Ciclista {
    private String nome;
    private int idade;
    private String nivel;

    public Ciclista(String nome, int idade, String nivel) {
        this.nome = nome;
        this.idade = idade;
        this.nivel = nivel;
    }

    public String pedalar(double distanciaKm) {
        if (distanciaKm < 0) {
            throw new IllegalArgumentException("A distancia nao pode ser negativa.");
        }
        return String.format("%s pedalou %.1f km.", nome, distanciaKm);
    }

    public String avaliarExperiencia() {
        if (nivel == null) {
            return "Nivel nao informado.";
        }
        String nivelAtual = nivel.toLowerCase();
        if (nivelAtual.contains("iniciante")) {
            return "Percurso leve recomendado.";
        }
        if (nivelAtual.contains("intermediario")) {
            return "Percurso moderado recomendado.";
        }
        return "Percurso avancado recomendado.";
    }

    public String exibirFicha() {
        return String.format("Ciclista: %s | Idade: %d | Nivel: %s", nome, idade, nivel);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
}

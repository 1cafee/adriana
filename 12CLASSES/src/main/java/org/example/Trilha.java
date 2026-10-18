package org.example;

public class Trilha {
    private String nome;
    private double distanciaKm;
    private String dificuldade;

    public Trilha(String nome, double distanciaKm, String dificuldade) {
        this.nome = nome;
        this.distanciaKm = distanciaKm;
        this.dificuldade = dificuldade;
    }

    public double calcularTempoEstimado(double velocidadeMedia) {
        if (velocidadeMedia <= 0) {
            throw new IllegalArgumentException("A velocidade deve ser maior que zero.");
        }
        return distanciaKm / velocidadeMedia;
    }

    public boolean exigeExperiencia() {
        return dificuldade != null && (dificuldade.equalsIgnoreCase("alta") || dificuldade.equalsIgnoreCase("dificil") || dificuldade.equalsIgnoreCase("difícil"));
    }

    public String exibirResumo() {
        return String.format("Trilha: %s | %.1f km | Dificuldade: %s", nome, distanciaKm, dificuldade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDistanciaKm() {
        return distanciaKm;
    }

    public void setDistanciaKm(double distanciaKm) {
        this.distanciaKm = distanciaKm;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }
}

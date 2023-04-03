package me.brunosantana.exercicios.exercicio1;

public abstract class Veiculo {
    private String modelo;
    private double preco;

    public Veiculo(String modelo, double preco) {
        this.modelo = modelo;
        this.preco = preco;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPreco() {
        return preco;
    }

    public abstract void printDados();

}

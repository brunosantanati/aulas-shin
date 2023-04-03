package me.brunosantana.exercicios.exercicio1;

import java.util.Scanner;

public class Carro extends Veiculo{

    private double km;

    public Carro(String modelo, double preco) {
        super(modelo, preco);
    }

    public double getPreco(){
        return super.getPreco();
    }

    public void setKm(double km) {
        this.km = km;
    }

    @Override
    public void printDados() {
        System.out.println("Carro{" +
                " modelo=" + getModelo() +
                ", preco=" + getPreco() +
                ", km=" + km +
                " }");
    }

    //insertDados ?
    public void insertData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a kilometragem do carro");
        double kmDoCarro = scanner.nextDouble();
        this.setKm(kmDoCarro);
    }
}

package me.brunosantana.exercicios.exercicio1;

import java.util.Scanner;

public class Moto extends Veiculo {

    private int ano;

    public Moto(String modelo, double preco) {
        super(modelo, preco);
    }

    public double getPreco(){
        return super.getPreco();
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public void printDados() {
        System.out.println("Moto{" +
                " modelo=" + getModelo() +
                ", preco=" + getPreco() +
                ", ano=" + ano +
                " }");
    }

    //insertDados ?
    public void insertData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o ano da moto:");
        int anoDaMoto = scanner.nextInt();
        this.setAno(anoDaMoto);
    }
}

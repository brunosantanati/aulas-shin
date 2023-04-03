package me.brunosantana.exercicios.exercicio1;

public class Principal {

    public static void main(String[] args) {
        Moto moto = new Moto("Titan", 12000);
        moto.insertData();
        moto.printDados();

        Carro carro = new Carro("Polo", 70000);
        carro.insertData();
        carro.printDados();
    }

}

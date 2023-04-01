package me.brunosantana;

import java.security.InvalidParameterException;

public class Armario {

    private int numeroDePortas;
    private int numeroDeGavetas;

    public int getNumeroDePortas(){
        return this.numeroDePortas;
    }

    public void setNumeroDePortas(int numeroDePortas){
        if(numeroDePortas <= 0){
            throw new InvalidParameterException("Número de portas não pode ser menor igual a zero");
        }
        this.numeroDePortas = numeroDePortas;
    }

    public int getNumeroDeGavetas() {
        return numeroDeGavetas;
    }

    public void setNumeroDeGavetas(int numeroDeGavetas) {
        this.numeroDeGavetas = numeroDeGavetas;
    }

    void abrirPorta(){
        System.out.println("Abrindo porta...");
    }

    void fecharPorta(){
        System.out.println("Fechando porta...");
    }

    void abrirGaveta(){
        System.out.println("Abrindo gaveta...");
    }

    void fecharGaveta(){
        System.out.println("Fechando gaveta...");
    }

}

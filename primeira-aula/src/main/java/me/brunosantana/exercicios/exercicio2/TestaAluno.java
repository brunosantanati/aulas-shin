package me.brunosantana.exercicios.exercicio2;

import java.util.Scanner;

public class TestaAluno {

    public static void main(String[] args) {
        System.out.println("########### aluno 1");

        Aluno aluno = new Aluno();
        aluno.apresentar();

        Scanner s = new Scanner(System.in);
        System.out.println("Digite o id:");
        int id = s.nextInt();
        System.out.println("Digite o nome:");
        String nome = s.next();
        System.out.println("Digite a idade:");
        int idade = s.nextInt();

        aluno.setId(id);
        aluno.setNome(nome);
        aluno.setIdade(idade);

        aluno.apresentar();

        System.out.println("########### aluno 2");

        Aluno aluno2 = new Aluno(id, nome, idade);
        aluno2.apresentar();
    }

}

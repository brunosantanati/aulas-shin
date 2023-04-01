package me.brunosantana;

public class Principal {

    public static void main(String[] args) {
        Armario armario1 = new Armario();

        armario1.setNumeroDePortas(4);
        armario1.setNumeroDeGavetas(6);
        System.out.println("Num portas:" + armario1.getNumeroDePortas());
        System.out.println("Num gavetas:" + armario1.getNumeroDeGavetas());

        armario1.abrirPorta();
        armario1.fecharPorta();
        armario1.abrirGaveta();
        armario1.fecharGaveta();

        System.out.println("################################");

        Armario armario2 = new Armario();

        armario2.setNumeroDePortas(8);
        armario2.setNumeroDeGavetas(10);
        System.out.println("Num portas:" + armario2.getNumeroDePortas());
        System.out.println("Num gavetas:" + armario2.getNumeroDeGavetas());

        armario2.abrirPorta();
        armario2.fecharPorta();
        armario2.abrirGaveta();
        armario2.fecharGaveta();

    }

}

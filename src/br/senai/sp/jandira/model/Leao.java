package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Leao {

    String name,apelido;
    int idade;

    Scanner teclado = new Scanner(System.in);

    public void cadastrarLeao(){
        System.out.println("-------- Leao --------\n");
        System.out.println("Informe o nome: ");
        name = teclado.nextLine();
        System.out.println("Informe o Apelido: ");
        apelido = teclado.nextLine();
        System.out.println("Informe a idade: ");
        idade = teclado.nextInt();
        teclado.nextLine();
        System.out.println("\n----------------------");


    }


}

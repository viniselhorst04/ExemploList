package br.senai.sp.jandira.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zoo {
    Scanner teclado = new Scanner(System.in);

    List<Leao> leaoList = new ArrayList<>();

    public void menu(){

        boolean continuar = true;

        while (continuar) {

            Leao leao = new Leao();


            System.out.println(" ------- Menu ------- \n");
            System.out.println("1- Cadastrar Leao");
            System.out.println("2- Listar Leoes");
            System.out.println("3- Sair");
            System.out.println("\n --------     ------- ");

            int optionUser = teclado.nextInt();

            switch (optionUser) {

                case 1:
                    leao.cadastrarLeao();
                    adicionarLeao(leao);
                    leaoList.size();
                    System.out.println(leaoList.size());
                    break;

                case 2:
                    listarLeao();

                    break;

                case 3:
                    continuar=false;
                    break;
            }

        }

    }

    public void adicionarLeao(Leao leao){
        leaoList.add(leao);
    }

    public void listarLeao(){

        for (Leao leao : leaoList){
            System.out.println("Nome da Zebra:" + leao.name);
            System.out.println("Apelido da Zebra:" + leao.apelido);
            System.out.println("Idade da Zebra:" + leao.idade);

        }

    }

}

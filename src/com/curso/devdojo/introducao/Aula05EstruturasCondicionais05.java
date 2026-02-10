package com.curso.devdojo.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        //print days of the week
        //1 is sunday
        int dia = 4;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um número de 0 a 7");
        int chooseNumber = scanner.nextInt();

        switch (dia){
            case 1:
                System.out.println(+ chooseNumber+"Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("terça");
                break;
            case 4:
                System.out.println("quarta");
                break;
            case 5:
                System.out.println("quinta");
                break;
            case 6:
                System.out.println("sexta");
                break;
            case 7:
                System.out.println("sábado");
                break;
        }


    }
}

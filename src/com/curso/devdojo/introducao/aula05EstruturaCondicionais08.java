package com.curso.devdojo.introducao;

import java.util.Scanner;

public class aula05EstruturaCondicionais08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quantos dias tem o ano : ");
        int ano = sc.nextInt();

        if ((ano % 4 == 0 && ano % 100 != 0 ) ||( ano % 400 ==0)){
            System.out.println("ano bissexto");
        }else {
            System.out.println("Ano não bissexto");
        }
    }
}

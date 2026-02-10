package com.curso.devdojo.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        //values = 1 to 7
        //print weekend and week
        // 1 is sunday

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um número de 0 a 7");

        int dia = scanner.nextInt();

        switch (dia){
            case 1:
                System.out.println("Sunday" );
                break;
            case 2:
                System.out.println("monday");
                break;
            case 3:
                System.out.println("tuesday" );
                break;
            case 4:
                System.out.println("wednesday");
                break;
            case 5:
                System.out.println("thursday");
                break;
            case 6:
                System.out.println("friday" );
                break;
            case 7:
                System.out.println("saturday" );
                break;
        }
        scanner.close();
    }
}

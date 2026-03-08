package com.curso.devdojo.introducao;

import java.util.Scanner;

public class aula05EstruturaCondicionais07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite  o lado 1 do triângulo");
        int lado1 = sc.nextInt();

        System.out.print("Digite  o lado 2 do triângulo");
        int lado2 = sc.nextInt();


        System.out.print("Digite  o lado 3 do triângulo");
        int lado3 = sc.nextInt();

        if (lado1 > lado3 && lado2 > lado3){
            System.out.println("é triângulo!!");
        }else{
            System.out.println("não é triângulo!!");
        }


    }
}

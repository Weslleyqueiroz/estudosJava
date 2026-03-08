package com.curso.devdojo.introducao;

import java.util.Scanner;

public class aula05EstruturasCondicionais08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        double newDiscount;
        System.out.println("Digite o valor da sua compra:");
        double valorCompra = sc.nextDouble();

        if (valorCompra> 100 && valorCompra <200){
            newDiscount = valorCompra * 10/100;
            System.out.println("valor com desconto: " + newDiscount);
        } else if (valorCompra>200) {
            newDiscount = valorCompra * 20/100;
            System.out.println("valor com desconto: " + newDiscount);
        }else{
            System.out.println("Sem desconto");
        }
    }
}

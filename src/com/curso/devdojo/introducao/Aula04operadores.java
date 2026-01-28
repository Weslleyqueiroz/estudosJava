package com.curso.devdojo.introducao;

public class Aula04operadores {
    public static void main(String[] args) {

        // +-/*
        int numero1 = 1;
        int numero2 = 5;

        System.out.println("Concatenação: " + numero1 + numero2);
        System.out.println(numero2 + numero1 + " Soma");

        // %
        int resto = 20 % 2;
        System.out.println(resto);

        //<> <= >= == !=

        boolean isTen = 10 > 20;
        boolean isLow = 10 < 20;
        boolean isEqual = 10 == 20;
        boolean isDiferent = 10 != 20;

        System.out.println(isTen);
        System.out.println(isLow);
        System.out.println(isEqual);
        System.out.println(isDiferent);

        // and(&&) or(||) not(!)
        int age = 35;
        double salary = 2000;
        boolean custommerOld = age > 30 && salary >=4000;
        boolean custommerYoung = age < 30 && salary >=3381;

        System.out.println("O operador é : " + custommerOld);
        System.out.println("O operador é : " + custommerYoung);

        double allValue = 200;
        double allValueTwo = 3000;

        int playstation = 2000;

        boolean IsBuying = allValue >= playstation || allValueTwo > playstation;
        System.out.println("Da pra comprar? " + IsBuying);


        // = += -= *= %=
        double bonus = 1800;
        bonus = bonus + 1000;
        System.out.println("you earned a bonus of : " + bonus);

        //
        int contador = 0;
        contador =  contador +1;
        System.out.println(contador);
        }

}

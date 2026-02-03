package com.curso.devdojo.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        //idade<15 categoria infantil
        //idade>=15 && idade< 18 categorial juvenil
        //idade>=18 adulto
        int idade = 25;
        String category;

        if(idade<15){
            category = "infantil";
            System.out.println("Your age is: " + idade + " you aren´t current adult category: " + category);
        } else if (idade>= 15 && idade< 18) {
            category = "juvenil";
            System.out.println("Your category is: " + category + " you aren´t adult too " + category);
        }else{
            System.out.println("You are adult!!!");
        }

    }
}

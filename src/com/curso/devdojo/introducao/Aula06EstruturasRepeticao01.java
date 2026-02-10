package com.curso.devdojo.introducao;

public class Aula06EstruturasRepeticao01 {
    public static void main(String[] args) {
        //while - Do while and For
        int c = 0;

        while (c<10){
            c = c +1;
            System.out.println(c);
        }
        do {
            System.out.println("Inside of do-while");
        }while (c <10);

        for (int i=0; i <10; i++){
            System.out.println(i);
        }
    }
}

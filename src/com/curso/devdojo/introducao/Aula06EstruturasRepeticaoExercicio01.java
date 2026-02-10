package com.curso.devdojo.introducao;

public class Aula06EstruturasRepeticaoExercicio01 {
    public static void main(String[] args) {
        //print numbers 0 to 1000000

        for (int i = 0 ; i<=1000000; i++){
            if (i %2 ==0){
                System.out.println("Numeros pares: " + i);
            }

        }
    }
}

package com.curso.devdojo.introducao;

public class Aula06EstruturasRepeticaoExercicio02 {
    public static void main(String[] args) {
        //até 25 e depois para

        for (int i = 0; i<=50; i++){
            System.out.println(i);
            if (i == 25){
                break;
            }
            System.out.println(i);
        }
    }
}

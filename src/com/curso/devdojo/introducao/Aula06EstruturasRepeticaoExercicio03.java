package com.curso.devdojo.introducao;

import java.util.Scanner;

public class Aula06EstruturasRepeticaoExercicio03 {
    public static void main(String[] args) {
        //carro = 30000
        //cndição, valorparcela >=1000
        int valorCarro = 30000;

        for (int parcela = 1; parcela<=valorCarro; parcela++){
           int valorParcela = valorCarro/parcela;
            if (valorParcela <1000){
                break;
            }
            System.out.println("Minhas parcelas serão de: " + parcela + " No valor de R$: " +valorParcela);
        }
    }
}

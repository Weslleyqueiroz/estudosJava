package com.curso.devdojo.introducao;

public class Aula06EstruturasRepeticaoExercicio04 {
    public static void main(String[] args) {

        int valorCarro = 30000;

        for (int parcela = valorCarro; parcela >= 1; parcela--) {
            int valorParcela = valorCarro / parcela;

            if (valorParcela<1000){
                continue;
            }
            System.out.println("Minhas parcelas serão de: " + parcela + " No valor de R$: " +valorParcela);
        }
    }
}

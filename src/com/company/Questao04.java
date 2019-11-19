package com.company;

import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] notas = new double[2][2];
        double media = 0;
        int num;
        for (int l = 0; l <notas.length; l++) {
            num = 0;
            for (int c = 0; c < notas.length; c++) {
                if (l < 1) {
                    num += 1;
                    System.out.print("Informe a " + num + "º nota: ");
                    notas[l][c] = sc.nextDouble();
                }else{
                    num += 1;
                    System.out.print("Informe o peso da " + num + "º nota, com valores entre 0 e 1: ");
                    notas[l][c] = sc.nextDouble();
                    while (notas[1][c] > 1 || notas[1][c] < 0) {
                        System.out.println("VALOR INCORRETO!");
                        System.out.print("favor informar um valor entre 0 e 1: ");
                        notas[l][c] = sc.nextDouble();
                    }
                }
            }
        }
        media = Funcoes.ponderadaQ04(notas);
        System.out.println(" A sua média é "+media);
    }
}
package com.company;

import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] data = new int[1][3];
        int[][] novadata = new int[1][3];
        for (int l = 0; l < 1; l++) {
            for (int c = 0; c < 3; c++) {
                if (c == 0) {
                    System.out.println("Informe o dia: ");
                    data[l][c] = sc.nextInt();
                } else {
                    if (c == 1) {
                        System.out.println("Informe o mês: ");
                        data[l][c] = sc.nextInt();
                        novadata[l][c] = data[l][c];
                    } else {
                        System.out.println("Informe o ano: ");
                        data[l][c] = sc.nextInt();
                        novadata[l][c] = data[l][c];
                    }
                }
            }
        }
        novadata[0][0] = Funcoes.datanteriorQ06(data);
        System.out.print("Data atual: ");
        for (int l = 0; l < 1; l++) {
            for (int c = 0; c < 3; c++) {
                if (c < 2) {
                    System.out.print(data[l][c] + "/");
                }else{
                    System.out.print(data[l][c]);
                }
            }
            System.out.println();
        }
        System.out.print("Data anterior: ");
        for (int l = 0; l < 1; l++) {
            for (int c = 0; c < 3; c++) {
                if (c < 2) {
                    System.out.print(novadata[l][c] + "/");
                }else{
                    System.out.print(novadata[l][c]);
                }
            }
            System.out.println();
        }
    }
}
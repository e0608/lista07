package com.company;

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] dias_da_semana = {" D ", " S ", " T ", " Q ", " Q ", " S ", " S "};
        int[][] calendario = new int[4][7];
        int soma = 2;

        System.out.println("\t"+"   C A L E N D A R I O    ");

        for (int c = 0; c < 7; c++) {
            System.out.print("\t" + dias_da_semana[c]);
        }
        System.out.println();
        System.out.print("                         1   2");
        System.out.println();
        for (int l = 0; l < 4; l++) {
            for (int c = 0; c < 7; c++) {
                calendario[l][c] = soma += 1;
                System.out.print("\t" + calendario[l][c]);
            }
            System.out.println();
        }

        System.out.print("\t"+"selecione o dia: ");
        int dia = sc.nextInt();

        String texto = Funcoes.semanaQ02(dia);
        System.out.println(texto);
    }
}

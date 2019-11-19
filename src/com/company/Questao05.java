package com.company;

import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\t"+"FATORIAL"+"\t");
        System.out.print("Informe um número: ");
        int n = sc.nextInt();
        int fat = Funcoes.fatorialQ05(n);
        System.out.println("O fatorial de "+n+" é "+fat);

    }
}

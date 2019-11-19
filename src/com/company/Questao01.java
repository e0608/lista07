package com.company;

import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Informe os segundos: ");
        int n = sc.nextInt();
        System.out.println("Seu computador se auto destruirar em "+n+" segundos!");
        n += 1;
        System.out.println("== contagem iniciada! ==");

        while (n > 0) {
            n = Funcoes.contadorQ01(n);

            System.out.println(n+" . . ");
        }
    }
}

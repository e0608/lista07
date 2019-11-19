package com.company;

import java.util.Scanner;
public class Questao03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Par ou Impar     ");
        System.out.print("Informe um número: ");
        int n = sc.nextInt();
        String I;
        I = Funcoes.ParOuImparQ03(n);
        System.out.println(I);
    }
}

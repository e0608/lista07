package com.company;

public class
Funcoes {
    static int contadorQ01(int x) {
        // metodo contador
        x -= 1;
        return x;
    }
    static String semanaQ02(int x){
        String D  = "";
        switch (x){
            case 3:
            case 10:
            case 17:
            case 24:
                D = "\t"+"Domingo";
                break;
            case 4:
            case 11:
            case 18:
            case 25:
                D = "\t"+"Segunda - feira";
                break;
            case 5:
            case 12:
            case 19:
            case 26:
                D = "\t"+"Terça - feira";
                break;
            case 6:
            case 13:
            case 20:
            case 27:
                D = "\t"+"Quarta - feira";
                break;
            case 7:
            case 14:
            case 21:
            case 28:
                D = "\t"+"Quinta - feira";
                break;
            case 8:
            case 15:
            case 22:
            case 29:
                D = "\t"+"Sexta - feira";
                break;
            case 9:
            case 16:
            case 23:
            case 30:
                D = "\t"+"Sabado ";
                break;
        }
        return D;
    }
    static String ParOuImparQ03(int x){
        String P = "";
        if (x % 2 == 0){
            P = "O número "+x+" é Par ";
        }else{
            P = "O número "+x+" é Impar ";
        }
        return P;
    }
    static double ponderadaQ04(double calculo[][]){
        double soma[] = new double[2];
        double result = 0;
        soma[0] = calculo[0][0] * calculo[1][0];
        soma[1] = calculo[0][1] * calculo[1][1];
        result = soma[0] + soma [1]/calculo[1][0] + calculo[1][1];
        return result;
    }
    static int fatorialQ05(int x){
        int aux = 1;
        for (int c; x > 1; x--){
            aux = aux * x;
        }
        x = aux;
        return x;
    }
    static int datanteriorQ06(int newdate[][]) {
        int[][] aux = new int[1][3];
        aux[0][0] = newdate[0][0] - 1;
        return aux[0][0];
    }
}

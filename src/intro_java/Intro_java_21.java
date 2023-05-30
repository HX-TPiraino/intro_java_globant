/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro_java;

import java.util.Objects;
import java.util.Scanner;

/**
 * Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
 * 3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
 * dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
 * se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
 * que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
 * la matriz M en la cual empieza el primer elemento de la submatriz P.
 * 
 * @author tpira
 */


public class Intro_java_21 {
    public static void main(String[] args) {
        int[][] matrizDe10 = new int[10][10];
        int[][] matrizDe3 = new int[3][3];
        
        matrizFiller(matrizDe10, 10);
        showMatriz(matrizDe10, 10);
        
        matrizManualFiller(matrizDe3, 3);
        System.out.println("");
        showMatriz(matrizDe3, 3);
        
        System.out.println();
 
        if (validadorDeDuplicado(matrizDe10, matrizDe3, 10, 3)) {
            System.out.println("Está contenida");
        } else {
            System.out.println("No está contenida");
        }
    }
    
    public static void matrizManualFiller(int[][] matriz, int largoMatriz){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Agregue los numero de la matriz menor");
        for (int i = 0; i < largoMatriz; i++) {
            for (int j = 0; j < largoMatriz; j++) {
                int newNum = (int) scanner.nextInt();
                matriz[i][j] = newNum;
            }
        }
    }
    
    public static void showMatriz(int[][] matriz, int largoMatriz){
        for (int i = 0; i < largoMatriz; i++) {
            for (int j = 0; j < largoMatriz; j++) {
                System.out.print(" [ " + matriz[i][j] + " ] ");
            }
            System.out.println("");
        }
    }
    
    public static void matrizFiller(int[][] matriz, int largoMatriz){
        for (int i = 0; i < largoMatriz; i++) {
            for (int j = 0; j < largoMatriz; j++) {
                int newNum = (int) Math.round(Math.random() * 9);
                matriz[i][j] = newNum;
            }
        }
    }
    
    public static boolean validadorDeDuplicado(int[][] matrizMayor, int[][] matrizMenor, int largoMatrizMayor, int largoMatrizMenor){
        for (int i = 0; i < largoMatrizMayor - largoMatrizMenor + 1; i++) {
            for (int j = 0; j < largoMatrizMayor - largoMatrizMenor + 1; j++) {
                if (matricesIguales(matrizMayor, matrizMenor, i, j, largoMatrizMenor)) {
                    System.out.println("Coincidencia encontrada en la fila " + i + " y columna " + j);
                    return true;
                }
            }
        }
        return false;
    }
    
    public static boolean matricesIguales(int[][] matrizMayor, int[][] matrizMenor, int filaInicial, int columnaInicial, int largoMatrizMenor) {
        for (int i = 0; i < largoMatrizMenor; i++) {
            for (int j = 0; j < largoMatrizMenor; j++) {
                if (matrizMayor[filaInicial + i][columnaInicial + j] != matrizMenor[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}

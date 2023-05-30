/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro_java;
import java.util.Scanner;

/**
 * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
 * suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
 * permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
 * El programa deberá comprobar que los números introducidos son correctos, es decir,
 * están entre el 1 y el 9.
 * 
 * @author tpira
 */
public class Intro_java_20 {
    public static void main(String[] args) {
        
        Long[][] matriz = manualFilled();
        
        showMatriz(matriz, 3);
    
        if(checkColumnas(matriz, 3) == checkFilas(matriz, 3) && checkFilas(matriz, 3) == checkDiagonales(matriz, 3)){
            System.out.println("Es magiqueeee");   
        } else {
            System.out.println("No es magiquee");
        }
    }
    
    public static Long[][] manualFilled(){
        Scanner scanner = new Scanner(System.in);
        Long[][] matriz = new Long[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Inserte un numero entre 0 y 9");
                matriz[i][j] = scanner.nextLong();
            }
        }
        return matriz;
    }
    
    public static void showMatriz(Long[][] matriz, int largoMatriz){
        System.out.println("");
        for (int i = 0; i < largoMatriz; i++) {
            for (int j = 0; j < largoMatriz; j++) {
                System.out.print(" [ " + matriz[j][i] + " ] ");
            }
            System.out.println("");
        }
     }
    
    public static int checkColumnas(Long[][] matriz, int largoMatriz){
        int[] auxArray = new int[3];
        int suma = 0;
        for (int i = 0; i < largoMatriz; i++) {
            for (int j = 0; j < largoMatriz; j++) {
                suma += matriz[i][j];
            }
        auxArray[i] = suma;
        suma = 0;
        }
        
        for (int i = 1; i < 3; i++) {
            if(auxArray[i] != auxArray[i-1]){
               return -1; 
            } else {
                suma = auxArray[i];
            }
        }
        return suma;
    }
    
    public static int checkFilas(Long[][] matriz, int largoMatriz){
        int[] auxArray = new int[3];
        int suma = 0;
        for (int i = 0; i < largoMatriz; i++) {
            for (int j = 0; j < largoMatriz; j++) {
                suma += matriz[j][i];
            }
        auxArray[i] = suma;
        suma = 0;
        }

        for (int i = 1; i < 3; i++) {
            if(auxArray[i] != auxArray[i-1]){
               return -1; 
            } else {
                suma = auxArray[i];
            }
        }
        return suma;
    }
    
        public static int checkDiagonales(Long[][] matriz, int largoMatriz){
        int[] auxArray = new int[3];
        int diagonal = 0;
        int diagonalNegativa = 0;
        for (int i = 0; i < largoMatriz; i++) {
            for (int j = 0; j < largoMatriz; j++) {
                if(i == j){
                    diagonal += matriz[i][j];
                }
                if(i == Math.abs(j - 2) || (i == j && i == Math.floor(largoMatriz / 2))){
                    diagonalNegativa += matriz[i][j];
                }
            }
        }
        if(diagonalNegativa == diagonal) {
            return diagonal;    
        }
        return -2;
    }
}

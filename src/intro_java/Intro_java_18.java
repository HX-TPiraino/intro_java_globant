/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro_java;

/**
 * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
 * traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
 * cambiando sus filas por columnas (o viceversa).
 * 
 * @author tpira
 */
public class Intro_java_18 {
    public static void main(String[] args) {
        Long[][] matriz = new Long[4][4];
    
        matrizFiller(matriz,4);
        
        System.out.println("Matriz Inicial");
        
        showMatriz(matriz, 4);
        
        System.out.println("");
        
        matriz = matrizTranspiler(matriz, 4);
        
        System.out.println("");
        
        System.out.println("Matriz Final");
        
        showMatriz(matriz, 4);
    }
    
    public static void matrizFiller(Long[][] matriz, int largoMatriz){
        for (int i = 0; i < largoMatriz; i++) {
            for (int j = 0; j < largoMatriz; j++) {
                Long newNum = Math.round(Math.random() * 10);
                matriz[i][j] = newNum;
            }
        }
    }
    
    public static Long[][] matrizTranspiler(Long[][] matriz, int largoMatriz){
        Long[][] resMatriz = new Long[4][4];
        for (int i = 0; i < largoMatriz; i++) {
            for (int j = 0; j < largoMatriz; j++) {
                resMatriz[i][j] = matriz[j][i];
            }
        }
        
        return resMatriz;
    }
    
    public static void showMatriz(Long[][] matriz, int largoMatriz){
        for (int i = 0; i < largoMatriz; i++) {
            for (int j = 0; j < largoMatriz; j++) {
                System.out.print(" [ " + matriz[j][i] + " ] ");
            }
            System.out.println("");
        }
    }
}

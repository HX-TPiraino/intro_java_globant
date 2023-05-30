/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro_java;

/**
 * 
 * 
 * 
 * @author tpira
 */
public class Intro_java_19 {
        public static void main(String[] args) {
         Long[][] matriz = new Long[4][4];

         matrizFiller(matriz,4);

         System.out.println("Matriz Inicial");

         showMatriz(matriz, 4);

         System.out.println("");

         Long[][] matrizTranspilada = matrizTranspiler(matriz, 4);

         System.out.println("");

         System.out.println("Matriz Final");

         showMatriz(matrizTranspilada, 4);
         
         validator(matriz,4,matrizTranspilada);
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
                 resMatriz[i][j] = -matriz[j][i];
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
     
     public static void validator(Long[][] matriz1, int largoMatriz, Long[][] matriz2){
         int validador = 0;
            for (int i = 0; i < largoMatriz; i++) {
                for (int j = 0; j < largoMatriz; j++) {
                 if(matriz1[i][j] == -matriz2[i][j]){
                     validador++;
                 }
                }
            }
            System.out.println("");
            if(validador == largoMatriz * largoMatriz) {
                System.out.println("Soy Anti - Simetrica");
            } else {
                System.out.println("No Soy Anti - Simetrica");
            }
     }
    }

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro_java;
import java.util.Scanner;

/**
 * Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
 * usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
 * numero y si se encuentra repetido
 * @author tpira
 */
public class Intro_java_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Long[] vector; 
        int numToLook;
        
        vector = new Long[100];
        vectorFiller(100, vector);
        
        System.out.println("Ingrese numero entre 0 y 100 a buscar");
        numToLook = scanner.nextInt();
        
        vLookUp(100, vector, numToLook);
        
    }
    
    public static void vectorFiller(int vectorSize, Long[] vector) {

        for (int i = 0; i < vectorSize; i++) {
            vector[i] = Math.round(Math.random() * 100);
        }
    }
    
    public static void vLookUp(int vectorSize, Long[] vector, int numToLook) {
        
        for (int i = 0; i < vectorSize; i++) {
            if(vector[i] == numToLook) {
                System.out.println("Estoy en i = " + i);
            }
        }
    }
}

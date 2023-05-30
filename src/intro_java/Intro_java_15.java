/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro_java;

/**
 * Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
 * muestre por pantalla en orden descendente.
 * @author tpira
 */
public class Intro_java_15 {

    public static void main(String[] args) {
        Long[] vector = new Long[100];
        vectorFiller(100, vector);
        
        System.out.print("[ ");
        for (int i = 99; i >= 0; i--) {
            
            System.out.print(vector[i] + " ");
        }
        System.out.print("]");
    }
    
    public static void vectorFiller(int vectorSize, Long[] vector) {
        
        for (int i = 0; i < vectorSize; i++) {
            vector[i] = Math.round(Math.random() * 100);
        }
    }
}

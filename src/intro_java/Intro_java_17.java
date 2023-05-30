/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro_java;

/**
 * Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
 * de 2 dígitos, etcétera (hasta 5 dígitos).
 * 
 * @author tpira
 */
public class Intro_java_17 {
    public static void main(String[] args) {
        Long[] vector; 
        
        vector = new Long[100];
        vectorFiller(100, vector);
        
        showVector(100, vector);
        
        System.out.println("Total con 1 digito: " + lookUp(100, vector, 1));
        System.out.println("Total con 2 digito: " + lookUp(100, vector, 2));
        System.out.println("Total con 3 digito: " + lookUp(100, vector, 3));
        System.out.println("Total con 4 digito: " + lookUp(100, vector, 4));
        System.out.println("Total con 5 digito: " + lookUp(100, vector, 5));
        
    }
        
    public static int lookUp(int vectorSize, Long[] vector, int digitsToLookFor){
        
        int apearences = 0;
        for (int i = 0; i < vectorSize; i++) {
            if(String.valueOf(vector[i]).length() == digitsToLookFor) {
                apearences++;
            }
        }
        return apearences;
    }
    
    public static void vectorFiller(int vectorSize, Long[] vector) {

        for (int i = 0; i < vectorSize; i++) {
            vector[i] = Math.round(Math.random() * 10000);
        }
    }
    
    public static void showVector(int vectorSize, Long[] vector) {
        
        System.out.print("[ ");
        for (int i = vectorSize - 1; i >= 0; i--) {

            System.out.print(vector[i] + " ");
        }
        System.out.println("]");
    }
}

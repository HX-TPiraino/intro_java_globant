/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro_java;
import java.util.Scanner;

/**
 * Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
 * en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 * 
 * @author tpira
 */
public class Intro_java_03 {
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Ingrese su frase!");
        String frase = lector.nextLine();
        
        System.out.println(frase.toLowerCase());
        System.out.println(frase.toUpperCase());

        lector.close();
    }
}

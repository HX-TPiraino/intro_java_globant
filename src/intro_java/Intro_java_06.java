/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro_java;
import java.util.Scanner;

/**
 * Crear un programa que dado un numero determine si es par o impar.
 * @author tpira
 */
public class Intro_java_06 {
    
    public static void main(String[] args) {
        
    Scanner givenNumber = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int numero_ingresado = givenNumber.nextInt();
        
        if(numero_ingresado % 2 == 0) {
            System.out.println("Es par");  
        } else {
            System.out.println("Es inpar");
        };

        givenNumber.close();
    }
}

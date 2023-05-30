/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro_java;
import java.util.Scanner;

/**
 * Escribir un programa que lea un número entero por teclado y muestre por pantalla el
 * doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 * @author tpira
 */
public class Intro_java_05 {
    
    public static void main(String[] args) {
        
        Scanner numLector = new Scanner(System.in);
        
        System.out.println("Ingrese el numero a operar");
        double num = numLector.nextDouble();
        
        System.out.println(num * 2);
        System.out.println(num * 3);
        System.out.println(Math.sqrt(num));
        
        numLector.close();
    }
}

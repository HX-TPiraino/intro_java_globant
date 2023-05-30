/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro_java;
import java.util.Scanner;

/**
 *
 * @author tpira
 */
public class Intro_java_01 {

    /**
     * @param args the command line arguments
     * Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
     * usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
     */
    public static void main(String[] args) {
        Scanner numLector = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero");
        int firstNumber = numLector.nextInt();
        
        System.out.println("Ingrese el segundo numero");
        int secondNumber = numLector.nextInt();
        
        System.out.println(firstNumber + secondNumber);

        numLector.close();
    }
    
}

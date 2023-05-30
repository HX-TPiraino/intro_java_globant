/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro_java;
import java.util.Scanner;

/**
 * Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
 * números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 * @author tpira
 */
public class Intro_java_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese un valor limite positivo !");
        int cota_superior = scanner.nextInt();
        int suma = 0;
        
        while(cota_superior > suma) {
            System.out.println("Ingrese numero a sumar");
            suma += scanner.nextInt();
        }    
        System.out.println("Su suma salio en " + suma);
        scanner.close();
    }
}

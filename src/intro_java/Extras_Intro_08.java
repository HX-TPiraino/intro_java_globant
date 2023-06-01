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
public class Extras_Intro_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numEntero;
        int numsPares = 0;
        int numsInpares = 0;
        int numsTotales = 0;
        
        while(true){
            System.out.println("Ingrese un numero entero");
            numEntero = scanner.nextInt();
            
            numsTotales++;
            
            if(numEntero % 2 == 0) {
                numsPares++;
            } else {
                numsInpares++;
            }

            if(numEntero % 5 == 0) {
                break;
            }            
        }
        
        System.out.println("Numero totales: " + numsTotales);
        System.out.println("Numero pares: " + numsPares);
        System.out.println("Numero inpares: " + numsInpares);
    }
}

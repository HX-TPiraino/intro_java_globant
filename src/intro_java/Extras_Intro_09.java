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
public class Extras_Intro_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el dividendo: ");
        int dividendo = scanner.nextInt();

        System.out.print("Ingrese el divisor: ");
        int divisor = scanner.nextInt();

        int cociente = 0;
        int residuo = dividendo;

        while (residuo >= divisor) {
            residuo -= divisor;
            cociente++;
        }

        System.out.println("El cociente es: " + cociente);
        System.out.println("El residuo es: " + residuo);
    }
}

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
public class Intro_java_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del cuadrado:");
        int n = scanner.nextInt();

        // Dibujar la primera fila de asteriscos
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println();

        // Dibujar las filas intermedias
        for (int i = 0; i < n - 2; i++) {
            System.out.print("* ");
            for (int j = 0; j < n - 2; j++) {
                System.out.print("  "); // Espacio en blanco
            }
            System.out.println("*");
        }

        // Dibujar la última fila de asteriscos
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println();
        scanner.close();
    }
}

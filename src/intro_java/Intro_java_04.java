/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro_java;
import java.util.Scanner;

/**
 * Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
 * Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 * @author tpira
 */
public class Intro_java_04 {
    
        public static void main(String[] args) {
            Scanner grados_ingresados = new Scanner(System.in);
            
            System.out.println("Ingrese una cantidad de grados");
            double g_centigrados = grados_ingresados.nextDouble();
            
            System.out.println(32 + (g_centigrados * 9 / 5));
            
            grados_ingresados.close();
        }
}

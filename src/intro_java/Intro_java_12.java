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
public class Intro_java_12 {
    
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int good_cases = 0;
        int bad_cases = 0;
        String cadena;
        
        do {
            System.out.println("Ingrese su cadena");
            cadena = scanner.nextLine();
        
            if(cadena.toUpperCase().startsWith("A") && cadena.substring(cadena.length()-1).equalsIgnoreCase("X") && cadena.length() <= 5) {
                good_cases++;
            } else {
                bad_cases++;
            }
        } while (!cadena.equals("&&&&&"));
        
        System.out.println(bad_cases - 1);
        System.out.println(good_cases);
        scanner.close();
    }
}

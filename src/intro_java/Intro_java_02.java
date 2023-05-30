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
 * Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
 * pantalla.
 */
public class Intro_java_02 {
    
      public static void main(String[] args) {
        Scanner nameLector = new Scanner(System.in);
        
        System.out.println("Ingrese nombre !");
        String firstName = nameLector.nextLine();
        
        System.out.println(firstName);

        nameLector.close();
      }
}

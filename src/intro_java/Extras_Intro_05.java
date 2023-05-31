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
public class Extras_Intro_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String categoria;
        int precioProducto = (int) Math.round(Math.random() * 1000);
        
        System.out.println("Ingrese su categoria de socio");
        categoria = scanner.nextLine();
        
        switch(categoria.toUpperCase()) {
            case "A":
                System.out.println("su producto le saldra: " + (precioProducto * 0.5));
                break;
            case "B":
                System.out.println("su producto le saldra: " + (precioProducto - precioProducto * 0.35));
                break;
            default:
                System.out.println("su producto le saldra: " + precioProducto);
        }
    }
}

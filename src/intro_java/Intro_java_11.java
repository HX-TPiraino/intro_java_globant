/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro_java;
import java.util.Scanner;

/**
 * Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
 * es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que
 * diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar
 * la función Substring y equals() de Java.
 * @author tpira
 */
public class Intro_java_11 {
    
    public static void main(String[] args) {
        String confirm_close;
        boolean end = true;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero entero");
        int num1 = scanner.nextInt();
        
        
        System.out.println("Ingrese el segundo numero entero");
        int num2 = scanner.nextInt();
        
        System.out.println("Menu");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.println("Elija una opcion !");
        
        
        while(end){
            
            int num_menu = scanner.nextInt();
            
            switch(num_menu) {
                case 1:
                    System.out.println(num1 + num2);
                    continue;
                case 2:
                    System.out.println(num1 - num2);
                    continue;
                case 3:
                    System.out.println(num1 * num2);
                    continue;
                case 4:
                    System.out.println(num1 / num2);
                    continue;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    scanner.nextLine();
                    confirm_close = scanner.nextLine();
                    
                    if(confirm_close.equals("S")) {
                        System.out.println("Adios");
                        end = false;
                        
                        scanner.close();
                        break;
                    } else {
                        System.out.println("Prosiga");
                        continue;
                    }
                default:
                    System.out.println("Elija otro numero");
            }
        } 
    }
}

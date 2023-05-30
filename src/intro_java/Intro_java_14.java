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
 * Crea una aplicación que a través de una función nos convierta una cantidad de euros
 * introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
 * función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
 * una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
 * (void).
 * El cambio de divisas es:
    * 0.86 libras es un 1 €
    * 1.28611 $ es un 1 €
    * 129.852 yenes es un 1 €
 */
public class Intro_java_14 {
 
    public static void main(String[] args) {
        int libras;
        String changeTo;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese una cantidad de libras");
        libras = scanner.nextInt();
        scanner.nextLine();
            
        System.out.println("Porfavor ingrese el tipo de cambio que desea");
        changeTo = scanner.nextLine();
        
        exchanger(libras, changeTo);
    }
    
    public static void exchanger(int libras, String changeTo) {
        switch(changeTo) {
            case "Dolar":
                System.out.println(libras * 1.28);
                break;
            case "Yen":
                System.out.println(libras * 0.86);
                break;
            case "Libra":
                System.out.println(libras * 129.85);
                break;
            default:
                System.out.println("No tenemos ese tipo de cambio");
                break;
        }
    }
}

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
public class Extras_Intro_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numIngresado;
        double numMaximo = Double.NEGATIVE_INFINITY;
        double numMinimo = Double.POSITIVE_INFINITY;
        double suma = 0;
        int cantidaAIngresar = (int) Math.round(Math.random() * 5);
        int i = 0;
        
        while(i < cantidaAIngresar) {
            
        System.out.println(" Ingrese numero ");
        numIngresado = scanner.nextInt();
        
        if(numMaximo < numIngresado){
            numMaximo = numIngresado;
        }
        if(numMinimo > numIngresado) {
            numMinimo = numIngresado;
        }
        
        suma += numIngresado;
        i++;
        }
        
        
        System.out.println("Su numero maximo fue: " + numMaximo);
        System.out.println("Su numero minimo fue: " + numMinimo);
        System.out.println("El promedio de valor de los numeros es: " + suma / cantidaAIngresar);
    }
}

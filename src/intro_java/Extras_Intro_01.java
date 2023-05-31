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
public class Extras_Intro_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tiempoMins = scanner.nextInt();
        int dias;
        int horas;
        int minsRestantes;
        
        dias = Math.round(tiempoMins / 1440);
        horas = Math.round((tiempoMins % 1440) / 60);
        minsRestantes = Math.round((tiempoMins % 60));
        
        System.out.println("Serian: " + dias + ":" + horas + ":" + minsRestantes);
        
    }
}

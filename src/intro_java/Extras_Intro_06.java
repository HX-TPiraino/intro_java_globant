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
public class Extras_Intro_06 {
    public static void main(String[] args) {
        int suma = 0;
        int cantPersonas = (int) Math.round(Math.random() * 9) + 1;
        int currentHigth;
        int promedioGeneral;
        int promedioBajoM60 = 0;
        
        for (int i = 0; i < cantPersonas; i++) {
            currentHigth =  (int) (Math.random() * 300);
            suma += currentHigth;
            if(currentHigth < 160){
                promedioBajoM60++;
            }
        }
        
        promedioGeneral = Math.round( suma / cantPersonas );
        promedioBajoM60 = (promedioBajoM60*100) / cantPersonas;
        
        System.out.println("El promedio de altura es: " + promedioGeneral / 100 + "Mts");
        System.out.println("El promedio de altura de menores de 1.60Mts es: " + promedioBajoM60 + "%");
    }
}

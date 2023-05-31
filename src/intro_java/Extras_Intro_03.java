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
public class Extras_Intro_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String letra = scanner.nextLine();
        
        if(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")){
            System.out.println("Soy vocal");
        } else {
            System.out.println("No soy vocal");
        }
    }
}

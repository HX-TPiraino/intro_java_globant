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
public class Extras_Intro_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numDec = scanner.nextInt();
        
        switch(numDec){
            case 1:
                System.out.println("|");
                break;
            case 2:
                System.out.println("||");
                break;
            case 3:
                System.out.println("|||");
                break;
            case 4:
                System.out.println("|V");
                break;
            case 5:
                System.out.println("V");
                break;
            case 6:
                System.out.println("V|");
                break;
            case 7:
                System.out.println("V||");
                break;
            case 8:
                System.out.println("V||");
                break;
            case 9:
                System.out.println("|X");
                break;
            case 10:
                System.out.println("X");
                break;
            default:
                System.out.println("No es un numero valido");
        }
    }
}

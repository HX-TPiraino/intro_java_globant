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
public class Extras_Intro_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomNum = (int) Math.round(Math.random() * 10);
        int numTry;
        
        while(true) {
            numTry = scanner.nextInt();
            
            if(numTry == randomNum) {
                break;
            }
            System.out.println("Siga tratando");
        }
        System.out.println("Felicitaciones!");
        
    }
}

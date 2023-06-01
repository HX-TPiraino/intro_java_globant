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
public class Extras_Intro_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myNumber;
        int aux=0;
        
        System.out.println("Ingrese un numero");
        myNumber = scanner.nextInt();
        
        // 1231 / 10 -> 103 / 10 -> 10 / 10 -> 1 / 10 -> 0
        
        while(true){
          myNumber = (int)(Math.round(myNumber / 10));
          aux++;
          if(myNumber == 0){
              System.out.println("Tiene " + aux + " cifras");
              break;
          }
        }
    }
}

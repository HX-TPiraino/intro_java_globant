/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro_java;

/**
 *
 * @author tpira
 */
public class Extras_Intro_12 {
    public static void main(String[] args) {
        String auxI;
        String auxJ;
        String auxK;
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    if(i == 3 || j == 3 || k == 3) {
                        auxI = i == 3 ? "E" : String.valueOf(i);
                        auxJ = j == 3 ? "E" : String.valueOf(j);
                        auxK = k == 3 ? "E" : String.valueOf(k);
                        System.out.println(auxI + " " + auxJ + " " + auxK); 
                    } else {
                     System.out.println(i + " " + j + " " + k);   
                    }
                }
            }
        }
    }
}

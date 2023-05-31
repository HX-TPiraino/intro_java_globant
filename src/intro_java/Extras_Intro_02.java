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
public class Extras_Intro_02 {
    public static void main(String[] args) {
        int a = 3; // 0
        int b = 2; // 1
        int c = 1; // 3
        int d = 0; // 2
        
        int aux;
        int auxForD;
        
        //B toma el valor de c
        aux = b;
        auxForD = b;
        b = c;
        
        //C toma el valor de a
        aux = c;
        c = a;
        
        //A toma el valor de d
        aux = a;
        a = d;
        
        //D toma el valor de b
        d = auxForD;
        
        System.out.println(a + " " + b + " " + c + " " + d);
    }
}

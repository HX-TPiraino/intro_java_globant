/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro_java;

import java.util.Arrays;

/**
 *
 * @author tpira
 */
public class Extras_Intro_24 {
    public static void main(String[] args) {
        int n = 10;
        int[] fibonacci = new int[n];
        fibonacci[0] = 1;
        fibonacci[1] = 1;
        fibonacci[2] = 2;
        
        for (int i = 3; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        
        System.out.println(Arrays.toString(fibonacci));
    }
}

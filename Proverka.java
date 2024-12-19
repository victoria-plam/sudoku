/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proekt;

import java.io.FileNotFoundException;

/**
 *
 * @author boyanvb1
 */
public class Proverka {

    public static void main(String[] args) throws FileNotFoundException {
        Proekt obj = new Proekt();
        Fily gg = new Fily();
        int masiv[][] = obj.Random();
        String arr[][] = gg.Check();
        for (int i = 0; i < 1; i++) {
            for (int k = 0; k < 18; k++) {
                System.out.println(arr[masiv[i][k]][masiv[i+1][k]]);
            }
            System.out.println("");
        }

    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tests;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author boyanvb1
 */
public class TESTS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        File file = new File("C:\\Users\\Boyanvb1\\Documents\\sudoku.txt");
        Random rand = new Random();
        int number = rand.nextInt(5);
        Scanner fileReader = new Scanner(file);
        int line = 0;
        String save;
        String masiv[][] = new String[9][9];
        int p = 0;
        while (fileReader.hasNextLine()) {
            save = fileReader.nextLine();
            
            //for (int i = 0; i < 9; i++) {
                if (line >= number * 10 && line <= number * 10 + 8) {
                    if (p < 9) {
                        masiv[p] = save.split(" ");
                        p++;
                    }
                }
               
              //  save = fileReader.nextLine();
           // }
            line++;

        }
        for (int i = 0; i < 9; i++) {
            for (int k = 0; k < 9; k++) {
                System.out.print(masiv[i][k]);
            }
            System.out.println("");
        }
    }
}

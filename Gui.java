/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proekt;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author boyanvb1
 */
public class Gui {

    public static void main(String[] args) throws FileNotFoundException {
        
        JFrame frame = new JFrame("Sudoku");
        Proekt obekt = new Proekt();
        Fily chok = new Fily();
        frame.setSize(500, 500);
        frame.setLayout(new BorderLayout());
        JPanel panel = new JPanel();
        JTextField texts = new JTextField();
        panel.setLayout(new GridLayout(9, 9));
        int masivI[][] = obekt.Random();
        String masivS[][] = chok.Check();//file
        TextField[][] arr = new TextField[9][9];
        for (int i = 0; i < 9; i++) {
            for (int k = 0; k < 9; k++) {
                arr[i][k] = new TextField();
                arr[i][k].x = i;
                arr[i][k].y = k;

                panel.add(arr[i][k]);
            }
        }
        for (int i = 0; i < 1; i++) {
            for (int k = 0; k < 18; k++) {
                arr[masivI[i][k]][masivI[i + 1][k]].setText(masivS[masivI[i][k]][masivI[i + 1][k]]);
                arr[masivI[i][k]][masivI[i + 1][k]].setEditable(false);
            }
        }
       
        for (int i = 0; i < 9; i++) {
            for (int k = 0; k < 9; k++) {
                arr[i][k].addKeyListener(new KeyListener() {

                    @Override
                    public void keyTyped(KeyEvent arg0) {
                        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }

                    @Override
                    public void keyPressed(KeyEvent button) {
                        if (button.getKeyCode() == KeyEvent.VK_ENTER) {
                            String check = arr[button.getComponent().getX()][button.getComponent().getY()].getText();
                            Pattern p = Pattern.compile("\\d{1}$");
                            Matcher m = p.matcher(check);
                            boolean cifra = m.matches();
                            if(cifra==false){
                                JOptionPane.showMessageDialog(null, "Въведете само една цифра ", " Грешка", JOptionPane.ERROR_MESSAGE);
                            }
                            System.out.println(button.getComponent().getX()+"  "+button.getComponent().getY());
                            System.out.println(arr[button.getComponent().getX()][button.getComponent().getY()].getText());
                            int a=button.getComponent().getX();
                            int b = button.getComponent().getY();
                            if(arr[a][b].getText().equals(masivS[a][b])){
                                arr[a][b].setEditable(false);
                            }else{
                                JOptionPane.showMessageDialog(null,"Въведеното число е грешно "," Грешка",JOptionPane.ERROR_MESSAGE);
                                for(int i = 0;i<9;i++){
                                    for(int k = 0;k<9;k++){
                                        if(arr[i][k].getText().equals(masivS[i][k])){
                                         arr[i][k].setEditable(false);
                                    }else{
                                             arr[i][k].setText("");
                                        }
                                       
                                    }
                                }
                               
                            }
                            //int x2 = button.getSource();
                        } //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }

                    @Override
                    public void keyReleased(KeyEvent arg0) {
                        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }

                });

            }
        }
        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}

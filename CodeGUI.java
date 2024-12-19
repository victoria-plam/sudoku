/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proekt;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Boyanvb1
 */
public class CodeGUI {

    public static void main(String[] args) {
        // Създаване на основния JFrame
        
        JFrame frame = new JFrame("GAME WORDS");
        frame.setSize(500, 500);
        frame.setLayout(new BorderLayout());
        //BorderLayout() задава layout manager, който позволява  да компонентите да подредите компонентите в
        // пет различни региона: North (север), South (юг), East (изток), West (запад) и Center (център).

        // Създаване на JPanel за бутоните
        JPanel pnlPanel = new JPanel();
        pnlPanel.setLayout(new GridLayout(8, 6)); // Подреждане в 5 реда и 6 колони

        // Създаване на JTextField за извеждане на натиснатата буква
        JTextField textField = new JTextField();
        textField.setEditable(false); // Забранява директното въвеждане
        textField.setFont(new Font("Arial", Font.BOLD, 20));//Задава шрифт и големина на текста в това поле
        frame.add(textField, BorderLayout.NORTH);

     
        // Масив от JButton
        JButton[] buttons = new JButton[((int) 'Z' + 1) - (int) 'A'];

        // Създаване на бутоните и добавяне в панела
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton(String.valueOf((char) ('A' + i)));
            buttons[i].setFont(new Font("Arial", Font.BOLD, 18));

            // Добавяне на ActionListener към всеки бутон
            buttons[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    textField.setText(((JButton) e.getSource()).getText()); // Извежда текста на бутона в JTextField
                }
            });

            pnlPanel.add(buttons[i]);
        }

        // Добавяне на панела с бутоните към основния JFrame
        frame.add(pnlPanel, BorderLayout.CENTER);

        // Показване на прозореца
        frame.setVisible(true);
    }
}

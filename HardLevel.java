/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectsudoku;

import java.util.Random;

/**
 *
 * @author viktoriyaip
 */
public class HardLevel {

    Random generator = new Random();
    private int length;

    public void setLength(int lengths) {
        if (lengths > 0) {
            length = lengths;
        }
    }

    public HardLevel() {
        this(18);
    }

    public HardLevel(int length) {
        setLength(length);
    }

    public void Random(int numbers[][]) {

        int save[][] = new int[2][18];
        save[0][0] = generator.nextInt(8);
        save[0][1] = generator.nextInt(8);
        for (int i = 1; i < 18; i++) 
        {
            int p = generator.nextInt(8);
            int m = generator.nextInt(8);
            for (int j = 0; j <  i; j++) {
                boolean flag = false;
                if(p == save[0][j] && m ==save[1][j])
                {
                    flag=true; 
                }
                if(flag==true)
                {
                    p=generator.nextInt(8);
                    m=generator.nextInt(8);
                    j=0;
                }
            }
            save[i][0]=p;
            save[i][1]=m;
        }
    }
}

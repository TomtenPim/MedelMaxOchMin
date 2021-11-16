package com.company;

import javax.swing.*;
import java.util.Scanner;

public class MedelMaxMin {

    public static void main(String[] args) {

        int inputantal = Integer.parseInt(JOptionPane.showInputDialog("Hur många tal?" ));
	    int [] input = new int[inputantal];

        Scanner tgb = new Scanner(System.in);

        for(int i = 0 ; i < input.length ; i++) {
            System.out.println("Ange tal " + (i + 1) + ":");
            input[i] = tgb.nextInt();
        }

            int summa = 0;
            int max = input[1];
            int min = input[1];

        for(int i = 0; i < input.length; i++) {
             if (max < input[i]);
             max = input[i];

             if (min < input[i]);
             min = input[i];

             summa += input[i];
        }

            int medel = summa/inputantal;
            System.out.printf("Medeltalet är: " + medel + "\n Högsta talet är: " + max + "\n Minsta talet är: " + min);
    }
}

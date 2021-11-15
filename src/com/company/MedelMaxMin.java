package com.company;

import javax.swing.*;
import java.util.Scanner;

public class MedelMaxMin {

    public static void main(String[] args) {
        int inputantal = Integer.parseInt(JOptionPane.showInputDialog("Hur många tal?" ));
	    int [] input = new int[inputantal];
        Scanner tgb = new Scanner(System.in);
        for(int i = 0 ; i < input.length ; i++) {
            System.out.println("Ange resultat " + (i+1) + ":");
            input[i] = tgb.nextInt();
        }
    }
}

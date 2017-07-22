/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strangercounter;

import java.util.Scanner;

/**
 *
 * @author Sohail Arshad
 */
public class StrangerCounter {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long t = in.nextLong(), n = 2;
        while (3 * (n - 1) < t) n = 2 * n;
        System.out.println((3 * (n - 1) - t + 1));
    }
}

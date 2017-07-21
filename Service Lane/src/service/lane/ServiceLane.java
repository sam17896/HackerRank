/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.lane;

import java.util.Scanner;

/**
 *
 * @author Sohail Arshad
 */
public class ServiceLane {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();
        int width[] = new int[n];
        for(int width_i=0; width_i < n; width_i++){
            width[width_i] = in.nextInt();
        }
        for(int a0 = 0; a0 < t; a0++){
            int i = in.nextInt();
            int j = in.nextInt();
            int min = width[i];
            for(int q = i+1;q<=j;q++){
                if (width[q]<min){
                    min = width[q];
                }
            }
            System.out.println(min);
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the.hurdle.race;

import java.util.Scanner;

/**
 *
 * @author AHSAN
 */
public class TheHurdleRace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] height = new int[n];
        int max = Integer.MIN_VALUE;
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
            if(height[height_i] > max){
                max = height[height_i];
            }
        }
        if(max>k){
            System.out.println(max - k);
        }else{
            System.out.println(0);
        }
    }
    
}

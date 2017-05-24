/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appleaorange;

import java.util.Scanner;

/**
 *
 * @author AHSAN
 */
public class AppleAOrange {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int s = in.nextInt(); //sam's house start
        int t = in.nextInt(); //sam's house end
        int a = in.nextInt(); //position of apple tree
        int b = in.nextInt(); //position of orange tree
        int m = in.nextInt(); // number of apples
        int n = in.nextInt(); // number of oranges
        
        int[] apple = new int[m];
        
        int count_apple = 0;
        int count_orange = 0;
        
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
            
            int dist = apple[apple_i] + a;
            
            if(dist >= s && dist <= t){
                count_apple++;
            }            
            
        }
        
        int[] orange = new int[n];
        
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
            
            int dist = orange[orange_i] + b;
            
            if(dist >= s && dist <= t){
                count_orange++;
            }
        }
        
        System.out.println(count_apple);
        System.out.println(count_orange);
        
    }
    
}

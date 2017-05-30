/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package climibingtheleaderboard;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author AHSAN
 */
public class ClimibingTheLeaderboard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] scores = new long[n];
        
        long[] position = new long[n];        
        
        
        
        
        for(int scores_i=0; scores_i < n; scores_i++){
            scores[scores_i] = in.nextInt();
        }
        
       
        
        position[0] = scores[0];
        
        long max = scores[0];
        int j=1;
        for(int i=0;i<n;i++){
            if(scores[i] < max){
                max = scores[i];
                position[j] = max;
                j++;
            }
            
        }
        Arrays.sort(position);
        int m = in.nextInt();
        int l = 0;
        long[] alice = new long[m];
        for(int alice_i=0; alice_i < m; alice_i++){
            alice[alice_i] = in.nextInt();
            for(int i=l;i<n;i++){
                if(position[i] > alice[alice_i]){
                    System.out.println(n-i+1);
                    l = i;
                    break;
                } else if(position[i] == alice[alice_i]){
                    System.out.println(n-i);
                    l = i;
                    break;
                } else if(alice[alice_i]> position[i]){
                    if(i==n-1){
                        System.out.println(n-i);
                        break;
                    }
                }
            }
        }
    }
}

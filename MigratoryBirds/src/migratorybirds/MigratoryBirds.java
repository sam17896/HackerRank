/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package migratorybirds;

import java.util.Scanner;

/**
 *
 * @author AHSAN
 */
public class MigratoryBirds {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] types = new int[n];
        
        int[] count = new int[5];
        
        for(int types_i=0; types_i < n; types_i++){
            types[types_i] = in.nextInt();
            count[types[types_i]-1]++;
        }
        
        int max = Integer.MIN_VALUE;
        for(int i=0;i<5;i++){
            if(count[i] > max){
                max = count[i];
            }
        }
        
        for(int i=0;i<5;i++){
            if(count[i] == max){
                System.out.println(i+1 + " ");
            }
        }
    }
    
}

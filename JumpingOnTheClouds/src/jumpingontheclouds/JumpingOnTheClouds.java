/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jumpingontheclouds;

import java.util.Scanner;

/**
 *
 * @author AHSAN
 */
public class JumpingOnTheClouds {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        
        int e = 100;
        int pos = 0;
        
        do {
            pos = (pos + k)%n;
            e--;
            if(c[pos]==1){
                e = e-2;
            }
        }while(pos!=0);
        
        System.out.println(e);
    }
    
}

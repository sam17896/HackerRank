/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sockmarchent;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author AHSAN
 */
public class SockMarchent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        
        int count = 0;
        
        Arrays.sort(c);
        
        for(int i=0;i<n-1;i++){
            if(c[i]==c[i+1]){
                i++;
                count++;
            }
        }
        
        
        System.out.println(count);
    }
    
}

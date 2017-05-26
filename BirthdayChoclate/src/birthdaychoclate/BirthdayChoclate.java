/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package birthdaychoclate;

import java.util.Scanner;

/**
 *
 * @author AHSAN
 */
public class BirthdayChoclate {

    /**
     * @param args the command line arguments
     */
    static int solve(int n, int[] s, int d, int m){
        
       // Complete this function
        int count = 0;    
        if(n==1){
            if (s[0]==d)
                count = 1;
        }
        else{
            for(int i=0;i<n;i++){
                int sum=0;
                for(int j=i;j<i+m;j++){
                    if(j<n)
                    sum += s[j];
                }
                if(sum == d)
                    count++;

            }
        }
        
            return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = solve(n, s, d, m);
        System.out.println(result);
    }
}

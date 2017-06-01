/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beutifuldaysatthemovies;

import java.util.Scanner;

/**
 *
 * @author AHSAN
 */
public class BeutifulDaysAtTheMovies {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        int j = scan.nextInt();
        int k = scan.nextInt();
        int count = 0;
        for(int m = i;m<=j;m++){
            int x = reverse(m);
            int sub = Math.abs(x-m);
            if(sub%k==0){
                count++;
            }
        }
        System.out.println(count);
    }
    
    public static int reverse(int x){
        int temp = 0;
        while(x>0){
            temp = temp*10 + x%10;
            x = x/10;
        }
        return temp;
    }
    
}

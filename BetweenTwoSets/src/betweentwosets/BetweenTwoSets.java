/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package betweentwosets;

import java.util.Scanner;

/**
 *
 * @author AHSAN
 */
public class BetweenTwoSets {

   static int getTotalX(int[] a, int[] b){
        // Complete this function
       int x = 0;
       
       
       boolean a_b = true;
       boolean b_b = true;
       
       for(int i=1;i<100;i++){
           for(int a_i=0;a_i<a.length;a_i++){
               if(i%a[a_i]==0){
                   continue;
               }else{
                   a_b = false;
               }
           }
           
           for(int b_i=0;b_i<b.length;b_i++){
               if(b[b_i]%i==0){
                   continue;
               }else{
                   b_b = false;
               }
           }
           
           if(b_b && a_b){
               x++;
           }
           
           b_b = true;
           a_b = true;
       }
       
       return x;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i=0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        int total = getTotalX(a, b);
        System.out.println(total);
    }
}

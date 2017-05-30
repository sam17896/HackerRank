/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pickingnumbers;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author AHSAN
 */
public class PickingNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        Arrays.sort(a);
        
        int j=0;
        
        
        
        int min = a[j];
        int count = 1;
        int max_count = 1;
        for(int i=1;i<n;i++){
            if(a[i] - min < 2){
                System.out.println(a[i] - min);
                count++;
            } else {
                j++;
                min = a[j];
                i = j;
                //System.out.println(count);
                if(count > max_count){
                    max_count = count;
                  //  System.out.println(max_count);
                }
                count = 0;
            }
        }
        
        if(count>max_count){
            max_count=count;
        }
        
        System.out.println(max_count);
    }
    
}

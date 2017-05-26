/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package closest.number;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author AHSAN
 */
public class ClosestNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        long[] arr = new long[n];
        
        long max = Long.MIN_VALUE;
        
        for(int i=0;i<n;i++){
            arr[i] = scan.nextLong();
        }

        Arrays.sort(arr);
        
        long minSum = Long.MAX_VALUE;
        
        for(int i=0;i<n-1;i++){
            
            if( arr[i+1] - arr[i] < minSum){
                minSum = arr[i+1] - arr[i];
            }
            
        }
        
        String result = "";
        
        for(int i=0;i<n-1;i++){
            
            if( arr[i+1] - arr[i] == minSum){
                result+=arr[i] +" " + arr[i+1] + " " ;
            }
            
        }
        
        
        System.out.println(result);
    }
    
}

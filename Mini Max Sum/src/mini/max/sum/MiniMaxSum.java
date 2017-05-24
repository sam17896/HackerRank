package mini.max.sum;

import java.util.Scanner;

public class MiniMaxSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long[] arr = new long[5];
        
        long min = Integer.MAX_VALUE;
        long max = Integer.MIN_VALUE;
        
        int i_min = -1;
        int i_max = -1;
        
        for(int i=0; i < 5; i++) {
            arr[i] = in.nextInt();
            
            if(arr[i] > max){
                max = arr[i];
                i_max = i;
            }
            
            
            if(arr[i] < min){
                min = arr[i];
                i_min = i;
            }
        }
        
        long sum_min = 0;
        long sum_max = 0;
        
        for(int i=0;i<5;i++){
            if(i!= i_max){
                sum_min += arr[i];
            }
            
            if(i!= i_min){
                sum_max +=arr[i];
            }
        }
        
        System.out.println(sum_min + "  " + sum_max);
    }
    
}

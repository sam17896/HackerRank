/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equalizethearray;

import java.util.Scanner;

/**
 *
 * @author AHSAN
 */
public class EqualizeTheArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] count = new int[102];
        for(int i=0;i<n;i++){
            int m = scan.nextInt();
            count[m+1]++;
        }
        int max = -1;
        for(int i=1;i<=100;i++){
            if(count[i]>max){
                max = count[i];
            }
        }
        System.out.println(n-max);
    }
    
}

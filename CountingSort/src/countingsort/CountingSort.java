/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countingsort;

import java.util.Scanner;

/**
 *
 * @author AHSAN
 */
public class CountingSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int[] number = new int[n];
        String[] string = new String[n];
        
        String temp = scan.nextLine();
        for(int i=0;i<n;i++){
           
            temp = scan.nextLine();
            String[] word = temp.split(" ");
            number[i] = Integer.parseInt(word[0]);
            string[i] = word[1];
        }
        
        int count;
        for(int i=1; i<101; i++){
            count = 0;
            if (i < n){
            for(int j=0;j<n;j++){
                if(number[j] < i){
                    count++;
                }
            }    
                System.out.print(count + " ");
            } else {
               System.out.print(n+" ");
            }
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertionsort2;

import java.util.Scanner;

/**
 *
 * @author AHSAN
 */
public class InsertionSort2 {

    public static void insertionSortPart2(int[] array)
    {       
           // Fill up the code for the required logic here
           // Manipulate the array as required
           // The code for Input/Output is already provided
        
        for (int i = 1; i < array.length; i++) {
        int j = i;
        int value = array[i];
        while (j >= 1 && array[j-1] > value) {
            array[j] = array[j-1];
            j--;
        }
        array[j] = value;
        printArray(array);
    }
    }  
    
    
      
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int s = in.nextInt();
       int[] ar = new int[s];
       for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
       }
       insertionSortPart2(ar);    
                    
    }    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
}

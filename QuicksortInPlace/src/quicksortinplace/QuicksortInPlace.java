/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksortinplace;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sohail Arshad
 */
public class QuicksortInPlace {

 static void quickSort(ArrayList<Integer> array, int low, int high){
        
        if(low < high){
            int p = partition(array,low,high);
             
            printArray(array);
            quickSort(array,low,p-1);
            quickSort(array,p+1,high);
        }
    }
    
    static int partition(ArrayList<Integer> array, int low, int high){
        int pivot = array.get(high);
         
        int i = low;
        for(int j = low; j < high; j++){
            if(array.get(j) < pivot){
                array = swap(array,i,j);
                ++i;
            }
        }
        array = swap(array,i,high);
     
        return i;
    }
    
    static ArrayList<Integer> swap(ArrayList<Integer> array, int position1, int position2){
        int smallerValue = array.get(position1);
        int biggerValue = array.get(position2);
        array.set(position1,biggerValue);
        array.set(position2,smallerValue);
        
        return array;
    }

    
    static void printArray(ArrayList<Integer> array){
        for(int i : array){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfElements = sc.nextInt();
        ArrayList <Integer> unsortedArray = new ArrayList<Integer>();
        while(sc.hasNext()){
            unsortedArray.add(sc.nextInt());
        }
        
        quickSort(unsortedArray, 0, numberOfElements-1);
           
    }  
    
}

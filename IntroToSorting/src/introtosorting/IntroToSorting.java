/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introtosorting;

import java.util.Scanner;

/**
 *
 * @author AHSAN
 */
public class IntroToSorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int element = scan.nextInt();
        int n = scan.nextInt();
        int[] numbers = new int[n];
        int index = -1;
        for(int i=0;i<n;i++){
            numbers[i] = scan.nextInt();
            if(numbers[i]==element){
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
    
}

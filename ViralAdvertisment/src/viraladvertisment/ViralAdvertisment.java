/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viraladvertisment;

import java.util.Scanner;

/**
 *
 * @author AHSAN
 */
public class ViralAdvertisment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int count = 5;
        int sum = 0;
        int n = scan.nextInt();
        for(int i=0;i<n;i++){
            count = count/2;
            sum += count;
            count = count*3;
            
        }
        System.out.println(sum);
    }
    
}

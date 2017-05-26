/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bonappetit;

import java.util.Scanner;

/**
 *
 * @author AHSAN
 */
public class BonAppetit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] c = new int[n];
        
        int sum =0;
        
        for(int i=0;i<n;i++){
            c[i] = scan.nextInt();
            if(i!=k){
                sum+=c[i];
            }
        }
        
        int total = scan.nextInt();
        
        if(total - sum/2 == 0){
            System.out.println("Bon Appetit");
        }else{
            System.out.println(total-sum/2);
        }
    }
    
}

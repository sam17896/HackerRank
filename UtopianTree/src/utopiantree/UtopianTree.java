/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utopiantree;

import java.util.Scanner;

/**
 *
 * @author AHSAN
 */
public class UtopianTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int height;
        for(int a0 = 0; a0 < t; a0++){
            height = 1;
            int n = in.nextInt();
            for(int i=0;i<n;i++){
                if(i%2==0){
                    height *= 2;
                }else{
                    height++;
                }
            }
            System.out.println(height);
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catsandamouse;

import java.util.Scanner;

/**
 *
 * @author AHSAN
 */
public class CatsandaMouse {

   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            
            int A = Math.abs(x-z);
            int B = Math.abs(y-z);
            
            if(A>B){
                System.out.println("Cat B");
            }else if(A<B){
                System.out.println("Cat A");
            }else{
                System.out.println("Mouse C");
            }
        }
    }
    
}

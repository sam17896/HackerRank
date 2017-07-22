/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fair.rations;

import java.util.Scanner;

/**
 *
 * @author Sohail Arshad
 */
public class FairRations {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int N = in.nextInt();
    int B[] = new int[N];
    int sum = 0;
    for(int B_i=0; B_i < N; B_i++){
        B[B_i] = in.nextInt();
        sum+=B[B_i];
    }

    int count = 0;
    if(sum % 2 == 1){
        System.out.println("NO");
    }
    else{
        for(int i = 0; i<N; i++){
            if(B[i] % 2 != 0){
                B[i] = B[i] + 1;
                B[i+1] = B[i+1] + 1;
                count+=2;
            }



        }
        System.out.println(count);
    }
}
}

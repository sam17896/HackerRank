/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finddigits;

import java.util.Scanner;

/**
 *
 * @author AHSAN
 */
public class FindDigits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int temp = n;
            int count=0;
            while(temp>0){
                int x = temp%10;
                temp = temp/10;
                if(x==0){
                    
                } else if(n%x==0){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
    
}

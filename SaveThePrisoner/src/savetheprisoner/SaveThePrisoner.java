/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package savetheprisoner;

import java.util.Scanner;

/**
 *
 * @author AHSAN
 */
public class SaveThePrisoner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextInt();
            long m = in.nextInt();
            long s = in.nextInt();
            long result = (s+m -1)%n;
            if(result==0)
                System.out.println(n);
            else if(result==-1)
                System.out.println(n-1);
            else 
                System.out.println(result);
        }
        
    }
    
}

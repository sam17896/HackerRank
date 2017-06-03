/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extralongfactorial;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author AHSAN
 */
public class ExtraLongFactorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        BigInteger fac = BigInteger.valueOf(n);
        while(n>1){
            n = n-1;
            fac = fac.multiply(BigInteger.valueOf(n));
           // System.out.println(n + " " + fac);
        }
        System.out.println(fac);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigsorting;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author AHSAN
 */
public class BigSorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] unsorted = new String[n];
        BigInteger[] num = new BigInteger[n];
        for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
            unsorted[unsorted_i] = in.next();
        }
        
  Arrays.sort(unsorted, new Comparator<String>() {
  @Override
  public int compare(String arg0, String arg1) {
    if (arg0.length() > arg1.length())
        return 1;
    else if (arg0.length() < arg1.length())
        return -1;
    else if (arg0.length() == arg1.length()) {
         for (int i = 0; i < arg0.length(); i++) {
             if (arg0.charAt(i) > arg1.charAt(i))
                return 1;
             if (arg0.charAt(i) < arg1.charAt(i))
                 return -1;
             }
    }
    return 0;
    }
}); 
  
  for(int i=0;i<n;i++){
      System.out.println(unsorted[i]);
  }
        
        
        
  }
    
}

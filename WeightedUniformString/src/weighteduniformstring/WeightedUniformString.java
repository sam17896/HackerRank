/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weighteduniformstring;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Sohail Arshad
 */
public class WeightedUniformString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int n = in.nextInt();
        char [] charArray = s.toCharArray();
        int contigentString = 1;
        int lastAlphaNum = 0;
        Set<Integer> numList = new HashSet<Integer>();
        for(int i=0 ;i< charArray.length; i ++){
            int alphaNum = charArray[i] -'a'+1;
            if(alphaNum == lastAlphaNum){
                contigentString++;
            }
            else{
                contigentString = 1;
                lastAlphaNum = alphaNum;
            }
            int num = (alphaNum) * contigentString;
            numList.add(num); 
        }
        for(int a0 = 0; a0 < n; a0++){
            int x = in.nextInt();
            if(numList.contains(x) ){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}

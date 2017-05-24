/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package breakingtherecord;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author AHSAN
 */
public class BreakingTheRecord {

    /**
     * @param args the command line arguments
     */
    static int[] getRecord(int[] s){
        // Complete this function
        int[] result = new int[2];
        
        int highest = s[0];
        int lowest = s[0];
        
        for(int i=1;i<s.length;i++){
            if(s[i]>highest){
                highest = s[i];
                result[0]++;
            }
            
            if(s[i]<lowest){
                lowest = s[i];
                result[1]++;
            }
        }
        
        
        
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int[] result = getRecord(s);
        String separator = "", delimiter = " ";
        for (int val : result) {
            System.out.print(separator + val);
            separator = delimiter;
        }
        System.out.println("");
    }    
}

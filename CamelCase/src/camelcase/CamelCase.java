/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package camelcase;

import java.util.Scanner;

/**
 *
 * @author AHSAN
 */
public class CamelCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        String s = in.next();
        
        int count =1;
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)> 64&& s.charAt(i)<91){
                count++;
            }
        }
        System.out.println(count);
        
    }
    
}

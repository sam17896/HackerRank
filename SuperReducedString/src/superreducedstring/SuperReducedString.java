/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superreducedstring;

import java.util.Scanner;

/**
 *
 * @author AHSAN
 */
public class SuperReducedString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        boolean trim = false;
        while(s.length()>0){
            trim = false;
            for(int i=0;i<s.length()-1;i++){
                if(s.charAt(i) == s.charAt(i+1)){
                    s = s.substring(0, i) + s.substring(i+1+1);
                   // System.out.println(s);
                    trim = true;
                    break;
                }
            }
            if(!trim){
                break;
            }
        }
        
        if(s.length()>0){
            System.out.println(s);
        } else {
            System.out.println("Empty String");
        }
    }
    
}

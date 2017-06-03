/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appendanddelete;

import java.util.Scanner;

/**
 *
 * @author AHSAN
 */
public class AppendAndDelete {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        int k = in.nextInt();
        if(s.equals(t)){
            System.out.println("YES");
            return;
        }
        int x = s.length();
        int l = t.length();
       
        int commonLength = 0;
        
        for (int i=0; i<java.lang.Math.min(s.length(),t.length());i++){
            if (s.charAt(i)==t.charAt(i))
                commonLength++;
            else
                break;
        }
        if((s.length()+t.length()-2*commonLength)>k){
            System.out.println("No");
        }
        else if((s.length()+t.length()-2*commonLength)%2==k%2){
            System.out.println("Yes");
        }
        else if((s.length()+t.length()-k)<0){
            System.out.println("Yes");
        }

        else{
            System.out.println("No");
        }
    }
    
}

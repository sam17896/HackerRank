/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countingvalleys;

import java.util.Scanner;

/**
 *
 * @author AHSAN
 */
public class CountingValleys {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String str = scan.next();
        
        int count = 0;
        
        int level =0;
        
        int Ucount =0;
        int Dcount =0;
        
        for(int i=0;i<n;i++){
            
            if (str.charAt(i) == 'U'){
                level++;
            }else{
                level--;
            }
            
            if(level <= 0){
                if(str.charAt(i) == 'U'){
                    Ucount++;
                }else{
                    Dcount++;
                }
                    
            }
            
            
            
            if(level == 0){
                if(Ucount==Dcount){
                    count++;
                    System.out.println("here");
                }
                
                Ucount = 0;
                Dcount = 0;
            }
            
            
        }
        
        System.out.println(count);
        
    }
    
}

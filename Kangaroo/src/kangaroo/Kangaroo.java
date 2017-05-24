/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kangaroo;

import java.util.Scanner;

/**
 *
 * @author AHSAN
 */
public class Kangaroo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        
        int curr_1 = x1;
        int curr_2 = x2;
        
        boolean Yes = false;
        
        if(v1 > v2){
            do{
                curr_1 +=v1;
                curr_2 +=v2;
                if(curr_1==curr_2){
                    System.out.println("YES");
                    Yes = true;
                    break;
                }
            }while(curr_1 < curr_2);
        }else{
            do{
                curr_1 +=v1;
                curr_2 +=v2;
                if(curr_1==curr_2){
                    System.out.println("YES");
                    Yes = true;
                    break;
                }
            }while(curr_2 < curr_1);
        }
        
        if(!Yes){
            System.out.println("NO");
        }
        
    }
    
}

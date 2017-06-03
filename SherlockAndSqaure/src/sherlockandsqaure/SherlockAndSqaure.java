/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sherlockandsqaure;

import java.util.Scanner;

/**
 *
 * @author AHSAN
 */
public class SherlockAndSqaure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i=0;i<t;i++){
            int x = scan.nextInt();
            int y = scan.nextInt();
            int count =0;
            for(int j=0;j<Integer.MAX_VALUE;j++){
                if(j*j>=x&&j*j<=y){
                    count++;
                } else if (j*j > y) {
                    break;
                }
                
            }
            System.out.println(count);
        }
    }
    
}

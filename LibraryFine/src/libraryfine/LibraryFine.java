/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryfine;

import java.util.Scanner;

/**
 *
 * @author AHSAN
 */
public class LibraryFine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner in = new Scanner(System.in);
        int d1 = in.nextInt();
        int m1 = in.nextInt();
        int y1 = in.nextInt();
        int d2 = in.nextInt();
        int m2 = in.nextInt();
        int y2 = in.nextInt();
        
        if(y1<y2){
            System.out.println(0);
            return;
        } else if (y1==y2 && m1<m2){
            System.out.println(0);
            return;
        }
        
        
        if(y1 != y2){
            System.out.println(10000);
            return;
        } else {
            if(m1 != m2){
                System.out.println(500 * (m1-m2));
                return;
            } else {
                if(d1>d2){
                    System.out.println(15 * (d1-d2));
                    return;
                } else{
                    System.out.println(0);
                }
            }
        }
    }
    
}

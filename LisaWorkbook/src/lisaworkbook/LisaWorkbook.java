/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lisaworkbook;

import java.util.Scanner;

/**
 *
 * @author Sohail Arshad
 */
public class LisaWorkbook {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int page = 1;
        int j;
        int special =0;
        for(int i=0;i<n;i++){
            int m = in.nextInt();
            for(j=1;j<=m;j++){
                if(j==page){
                    special++;
                }    
                if(j%k == 0)
                    page++;
            }
            if((j-1)%k!=0)
                page++;
        }
        System.out.println(special);
    }
    
}

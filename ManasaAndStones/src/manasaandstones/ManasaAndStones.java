/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manasaandstones;

import java.util.Scanner;

/**
 *
 * @author Sohail Arshad
 */
public class ManasaAndStones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int t=in.nextInt();
    for(int x=0;x<t;x++){
        int n=in.nextInt();
        int a=in.nextInt();
        int b=in.nextInt();
        if(a==b)System.out.print((n-1)*a);
        else {
            if(a>b){
            int temp=a;
            a=b;
            b=temp;
        }
        for(int i=0;i<n;i++)System.out.print(i*b+(n-1-i)*a+" ");
        }
        System.out.println();
    }
}
    
}

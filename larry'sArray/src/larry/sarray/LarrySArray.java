/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package larry.sarray;

import java.util.Scanner;

/**
 *
 * @author Sohail Arshad
 */
public class LarrySArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t>0){
       int n=sc.nextInt();
        int a[]=new int [n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        int swap=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]>a[j]){
                    int S=a[i];
                    a[i]=a[j];
                    a[j]=S;
                    swap++;
                }
            }
        }
        System.out.println(swap%2==0?"YES":"NO");

        t--;
    }
}
}

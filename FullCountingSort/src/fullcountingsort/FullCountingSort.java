/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fullcountingsort;

import java.util.Scanner;

/**
 *
 * @author AHSAN
 */
public class FullCountingSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    int size=Integer.parseInt(scan.nextLine());
    StringBuffer[] st=new StringBuffer[100]; 

    for(int i=0;i<100;i++)
    {
        st[i]=new StringBuffer();
    }

    for(int i=0;i<size;i++)
    {
        String sts=scan.nextLine();
        String[] str=sts.split("[\\s]+");
        int k=Integer.parseInt(str[0]);
        String s;
        if(i<size/2)
            s="- ";
        else
            s=str[1]+" ";
        st[k]=st[k].append(s);
    }

    for(int i=0;i<100;i++)
    {
        System.out.print(st[i]);
    }
    
    }
    
    
}

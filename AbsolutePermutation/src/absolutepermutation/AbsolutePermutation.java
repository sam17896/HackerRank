/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package absolutepermutation;

import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author Sohail Arshad
 */
public class AbsolutePermutation {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    for(int a0 = 0; a0 < t; a0++){
        int n = in.nextInt();
        int k = in.nextInt();
        TreeMap<Integer,Integer> map=new TreeMap<>();
        for(int i=1;i<=n;i++){
            boolean flag=false;
            int pos=i-k;
            if(pos>=1 && pos<=n && map.get(pos)==null){
                map.put(pos,i);
                flag=true;
            }
            else{
                pos=i+k;
                if(pos>=1 && pos<=n && map.get(pos)==null){
                    map.put(pos,i);
                    flag=true;
                }
            }
            if(!flag)
                break;
        }
        if(map.size()!=n){
            System.out.println("-1");
        }
        else{
            for(int val :map.values())
                System.out.print(val+" ");
            System.out.println();
        }
    }
}
    
}

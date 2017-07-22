/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package happyladybugs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Sohail Arshad
 */
public class HappyLadyBugs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Q = in.nextInt();
        for(int a0 = 0; a0 < Q; a0++){
            int n = in.nextInt();
            String s = in.next();
            Map<Character,Integer> list = new HashMap<Character,Integer>();
            Set<Character> set = new HashSet<Character>();
            int max = 0,count=0;
            for(int i=0; i < n; i++){
                char b = s.charAt(i);
                if(b != '_'){
                    set.add(b);
                    if(list.containsKey(b))
                        list.put(b,list.get(b)+1);
                   else
                        list.put(b,1);
                    max = Math.max(max,list.get(b));
                }else
                    count++;
            }
            boolean flag = true;
            
            for(int i=1; i < n; i++){
                if(s.charAt(i) == s.charAt(i-1)){
                    set.remove(s.charAt(i));
                } 
            }
            
            for(Map.Entry pair: list.entrySet()){
               char key = (char)pair.getKey();
               int value = (int)pair.getValue();
                if((value < 2 || count < 1) && set.contains(key)){
                    System.out.println("NO");
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println("YES");
            }
            

        }
    }
    
}

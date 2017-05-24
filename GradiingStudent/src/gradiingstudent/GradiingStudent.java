/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradiingstudent;

import java.util.Scanner;

/**
 *
 * @author AHSAN
 */
public class GradiingStudent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");    
    }
    
    public static int[] solve(int[] grades){
        int[] result;
        int count = 0;
        
        for(int i=0;i<grades.length;i++){
         if(grades[i] < 38)
             continue;
         else
         {
             int muliple = grades[i] / 5;
             muliple++;
             count++;
             int difference = muliple*5 - grades[i];
             if(difference < 3){
                 grades[i] = grades[i] + difference;
             }
         }
        }
        
        result = new int[count];
        
        int j=0;
        for(int i=0;i<grades.length; i++){
            if(grades[i] >= 40){
                result[j] = grades[i];
                j++;
            }
        }
        
        return grades;
    }
    
}

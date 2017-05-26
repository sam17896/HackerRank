/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dayoftheprogrammer;

import java.util.Scanner;

/**
 *
 * @author AHSAN
 */
public class DayOfTheProgrammer {

    /**
     * @param args the command line arguments
     */
    static void solve(int year){
        // Complete this function
        if(year==1918){
            if(year%4 == 0){
                System.out.println("25.09."+year);
            }else
                System.out.println("26.09."+year);
        }
        else if(year>1918){
            if( (year%400==0) || (year%4==0&&year%100!=0) ){
                System.out.println("12.09." + year);
            }else{
                System.out.println("13.09." + year);
            }
        }
        else
        {
            if(year % 4 == 0){
                System.out.println("12.09." + year);
            }else{
                System.out.println("13.09." + year);
            }
        }
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        solve(year);
        
    }
    
}

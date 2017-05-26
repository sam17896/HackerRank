/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawing.book;

import java.util.Scanner;

/**
 *
 * @author AHSAN
 */
public class DrawingBook {

  static int solve(int n, int p){
        // Complete this function
      int count_front = 0;
      int count_back = 0;
      int count = 0; 
      
      for(int i=1;i<=n;i++){
          if(i==1){
              if(i==p){
                  count_front=0;
                  break;
              }
          }else{
              count_front++;
              if(i==p||i+1==p)
                  break;
              i++;
          }
      }
      
      for(int i=n;i>0;i--){
          
          if(i==n){
            if(n%2==0){
                if(i==p){
                    count_back =0;
                    break;
                }
            }else{
                if(i==p||i-1==p){
                    count_back =0;
                    break;
                }
                i--;
            }
          }else{
              count_back++;
                if(i==p||i-1==p){
                     break;
                }
                i--;
          }
      }
      
      if(count_back<count_front)
          count = count_back;
      else
          count = count_front;
      
      return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int result = solve(n, p);
        System.out.println(result);
    }
    
}

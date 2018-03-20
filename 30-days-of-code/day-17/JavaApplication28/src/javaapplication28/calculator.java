/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication28;

import java.util.Scanner;

    public class calculator{

     int a;
     int b;
      
       public int  power(int n,int p) throws numberexception {
        if((n <= 0) ||(p <= 0)){
           throw new numberexception();
        } //throw new Exception("throws exception!!");
        else
        {
            int ans=(int)Math.pow(p, n);
            return(ans);
        }
       }
        private static class numberexception extends Exception {
          public numberexception() {
           System.out.println("n and p should be non-negative");
        }}
  public static void main(String[] args) throws numberexception {
    
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t > 0) {
        
            int n = in.nextInt();
            int p = in.nextInt();
            calculator myCalculator = new calculator();
            try {
                int ans = myCalculator.power(n,p);
                System.out.println(ans);
            }
            catch (numberexception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }

     
    }
    
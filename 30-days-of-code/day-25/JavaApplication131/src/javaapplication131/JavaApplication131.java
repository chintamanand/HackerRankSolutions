/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication131;
import java.util.*;
public class JavaApplication131 {
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        
        while(t-->0){
            int fcount=0;
          int m=scan.nextInt();
          int n=m/2;
            for(int i=2;i<=n;i++){
                if(n==1||n==0){
                System.out.println("Not prime");
                }
             if(m%i==0){
              fcount++;
             }
            }
            if(fcount==0){
            System.out.println("Prime");
            }
            else{
            System.out.println("Not prime");
            }
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication138;
import java.util.*;
public class JavaApplication138 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        //int count=0;
        while(t-->0){
         int n=scan.nextInt();
         int k=scan.nextInt();
         int s[]=new int[n];
         for(int i=0;i<n;i++){
          s[i]=i;
          System.out.println(s[i]);
         }
         int max=0;
         for(int i=1;i<=n;i++){
          for(int j=i+1;j<=n;j++){
            if((i& j)<k && max<(i & j)){
             max=(i & j);
               // count++;
           }
          }
         }
         System.out.println("count will be : "+max);
        }
    }
    
}

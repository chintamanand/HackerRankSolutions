/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;
import java.util.Scanner;
public class JavaApplication7 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        String a="1";
        int n=scan.nextInt();
        String output=Integer.toBinaryString(n);
        System.out.println(output);
        int m=output.length();
        for(int k=0;k<m;k++){
        if(output.equals(a)){
        int count=0;
        count=count+1;
          System.out.println("count will be"+count);
        }}
          System.out.println("base-10 to base-2 conversion is:");
          
          int b=10;
          int count1=0;
          System.out.println("base-10 to base-2 conversion " + Integer.toBinaryString(b));
          System.out.println("base-10 to base-2 conversion " + Integer.toString(b,2));
          //while(b>0)
          {
           int re=b%2;
           b=b/2;
           count1++;
          
          for(int i=count1-1;i>0;i--){
          int arr1[]=new int[count1];
          arr1[i]=re;
          System.out.println(arr1[i]);
          }
          //}
        
      
        
    }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bubblesort;
import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        //size
        int n=scan.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
        a[i]+=scan.nextInt();
        }
        
        int count=0;
        for(int i=0;i<n;i++){
         for(int j=0;j<n-1;j++){
             if(a[j]>a[j+1]){
                 //swap(a[j], a[j + 1]);
                 int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
             count++;
             }
         }
        }
        
        System.out.println("Array is sorted in "+ count +" swaps.");
        System.out.println("First Element: "+a[0]);
        System.out.println("Last Element: "+a[n-1]);
        
    }
    
}

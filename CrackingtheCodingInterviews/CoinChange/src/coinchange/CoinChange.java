/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coinchange;
import java.util.*;
public class CoinChange {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        
        int rcount1=0;
        //Sum of coins Would be
        int n=scan.nextInt();
        
        //number of different coins
        int m=scan.nextInt();
        
        //coins in Array
        int c[]=new int[m];
        for(int i=0;i<m;i++){
        c[i]+=scan.nextInt();
        }
     
        long table[]=new long[n+1];
        Arrays.fill(table, 0);
        table[0]=1;
        for (int i=0; i<m; i++){
            for (int j=c[i]; j<=n; j++){
                table[j] += table[j-c[i]];
 }}
        System.out.println(table[n]);
    }
    
}

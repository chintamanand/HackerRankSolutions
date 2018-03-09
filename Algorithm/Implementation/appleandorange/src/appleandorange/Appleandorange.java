/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appleandorange;
import java.util.*;
public class Appleandorange {
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        // Complete this function
        int t1=0;
        int t2=0;
        int acount=0;
        int ocount=0;
        for(int i=0;i<apples.length;i++){
         t1=apples[i]+a;
         if(t1>=s && t1<t){
          acount++;
         }
         else{
          acount=acount+0;
         }
        }
        for(int i=0;i<oranges.length;i++){
         t2=oranges[i]+b;
         if(t2>=s && t2<t){
          ocount++;
         }
         else{
          ocount=ocount+0;
         }
        }
        System.out.println(acount+" "+ocount);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i = 0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i = 0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        countApplesAndOranges(s, t, a, b, apple, orange);
        in.close();
    }
    
}

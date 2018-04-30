/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package angryprofessor;
import java.util.*;
public class AngryProfessor {
   static String angryProfessor(int k, int[] a) {
        // Complete this function
       int oncount=0;
       int latecount=0;
       String y="YES";
       String n="NO";
       for(int i=0;i<a.length;i++){
        if(a[i]<=0){
         oncount++;
        }
        if(a[i]>0){
         latecount++;
        }
       } 
        if(oncount<k && latecount>oncount){
        //System.out.println(y);
            return y;
        }if(oncount>k ){
         //System.out.println(n);
            return n;
        }
       
      return null;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            int[] a = new int[n];
            for(int a_i = 0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            String result = angryProfessor(k, a);
            System.out.println(result);
        }
        in.close();
    }
}

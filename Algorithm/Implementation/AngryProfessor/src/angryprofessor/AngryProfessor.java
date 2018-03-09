/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package angryprofessor;
import java.util.*;
public class AngryProfessor {
    private static String cancel(int k, int[] a) {
        int presentcount=0;
        int absentcount=0;
        String yes="YES";
        String no="NO";
       for(int i=0;i<a.length;i++){
        if(a[i]<=0){
         presentcount++;
        }
        if(a[i]>0){
         absentcount++;
        }
       }
       if(presentcount>=k){
        return no;
       }
       else{
       return yes;
       }
        
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
            String result = cancel(k, a);
            System.out.println(result);
        }
        in.close();
    }
}

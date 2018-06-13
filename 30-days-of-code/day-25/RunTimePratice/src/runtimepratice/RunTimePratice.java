/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runtimepratice;
import java.util.*;
public class RunTimePratice {
    
    public static int noofrepe(String s,char a){
     int sum=0;
        for(int i=0;i<s.length();i++){
         if(s.charAt(i)==a){
          sum++;
         }
        }
        return sum;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        long starttime=System.currentTimeMillis();
        System.out.println(noofrepe("anandadfnuappauafdauqwb812h990 j2 NIO0!!&@#&&hwuihkfbiuadgsoopudbnguubdabpbav anddnanapaidufb89qe8u9hfqwg89",'a'));
        long endtime=System.currentTimeMillis();
        long duration=endtime-starttime;
        System.out.println("Duration : "+duration+"ms");
    }
    
}

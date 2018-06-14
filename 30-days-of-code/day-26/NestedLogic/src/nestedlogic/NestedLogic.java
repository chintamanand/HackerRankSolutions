/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nestedlogic;
import java.util.*;
public class NestedLogic {
public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int rday=scan.nextInt();
        int rmonth=scan.nextInt();
        int ryear=scan.nextInt();
        
        int eday=scan.nextInt();
        int emonth=scan.nextInt();
        int eyear=scan.nextInt();
        
        int fine=0;
        if((rday-eday)>0 && (rmonth-emonth)==0){//month_diff==0
         fine+=(rday-eday)*15;
        }
        if((rmonth-emonth)>0 && (ryear-eyear)==0){
         fine+=(rmonth-emonth)*500;
        }
        if((ryear-eyear)>0){
        fine+=10000;
        }
        System.out.println(fine);
    }
    
}
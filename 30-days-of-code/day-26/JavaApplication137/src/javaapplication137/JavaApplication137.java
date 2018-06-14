/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication137;
import java.util.*;
import java.util.regex.*;
public class JavaApplication137 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        List<String> list = new ArrayList();
        String a="[a-z]";
        String ereg=".+@gmail\\.com$";
        while(n-->0){
           String name=scan.next();
           String email=scan.next();
           
           if(name.length()<=20  && email.length()<=50){
           //ok -->good
               Pattern p=Pattern.compile(a);
               Matcher m=p.matcher(ereg);
               if(m.find()){
               list.add(name);
                }
           }
            
        }
        for (String name1 : list){
            System.out.println(name1);
        }
    }
    
}


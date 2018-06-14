/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;
import java.util.*;
import java.util.Random;
import java.util.regex.*;
public class User {
String password;
String Username;
int age;
Set<Integer> orderid;

public User(String customername,String customerpassword,int customerage,Set<Integer> Orderid){
this.Username=customername;
this.password=customerpassword;
this.age=customerage;
this.orderid=Orderid;
}
    public static void main(String[] args) {
        // TODO code application logic here
        Set a=new HashSet();
        a.add(12123);
        User anand=new User("anand","anand",20,a);
        
        
        String reg="[a-zA-Z\\s]+";
        String s=" Anand Kiran Nikhil";
        Pattern p = Pattern.compile(reg);
        Matcher m=p.matcher(s);
        if( m.find() ) {
    // Print the match
    System.out.println( m.group() );
}
    }
    
}

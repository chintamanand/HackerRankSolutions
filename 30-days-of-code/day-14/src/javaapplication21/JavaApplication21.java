/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication21;
import java.util.Calendar;
import java.util.Date;

public class JavaApplication21 {
    public static void main(String[] args) {
        // TODO code application logic here
        Calendar cal= Calendar.getInstance();
        cal.add(Calendar.DATE,2);
        System.out.println(cal.getTime());

        
    }
    
}

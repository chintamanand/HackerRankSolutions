/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication40;

import static javaapplication40.Haircolor.*;

public class person {
    Haircolor haircolor=red;
    public person()
    {
    
    }
    public static void main(String[] args) {
        // TODO code application logic here
        person peterparker=new person();
        person spiderman=new person();
        peterparker.haircolor=black;
        spiderman.haircolor=red;
        
        System.out.println("haircolor of the peter Parker is: "+peterparker.haircolor);
        System.out.println("haircolor of the spider-man is: "+spiderman.haircolor);
        
        //this aliasing -both the objects are fully dependent on each other
        //if there is a change then the change will be propagated to all objects
        person peter=new person();
        person spider=peter;
        peter.haircolor=blonde;
        spider.haircolor=brown;
        
        System.out.println("haircolor of the peter is: "+peter.haircolor);
        System.out.println("haircolor of the spider is: "+spider.haircolor);
    }
    
}

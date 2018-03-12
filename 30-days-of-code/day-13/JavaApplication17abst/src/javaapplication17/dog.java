/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;
    public class dog extends animal{
     public dog(){ 
         super(17);//refernces ->here goes to super class costrutor that has the age as the parameter
      System.out.println("this is dog");
      } 
        
     public void eat1(){
     System.out.println("Animals eat");
    }
     
     public void bark(){
     System.out.println("the dog can bark!");
     }
      public void eats(){
     System.out.println("the dog eats only non-veg!");
     }
     
    }


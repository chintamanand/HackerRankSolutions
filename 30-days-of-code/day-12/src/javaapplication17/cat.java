/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;
    public class cat extends animal{
     public cat(){
         super(7);//refernces -> here goes to super class costrutor that has the age as the parameter
      System.out.println("this is cat!!");
      } 
        public void sleep(){
    System.out.println("cat is sleeping"); //observe this method properly
    }
     public void meow(){
     System.out.println("the cat can meow!");
     }
      public void eats(){
     System.out.println("the cat eats only veg!");
     }
      
    }

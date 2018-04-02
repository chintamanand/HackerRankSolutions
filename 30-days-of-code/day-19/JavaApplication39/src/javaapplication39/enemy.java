/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication39;
public class enemy implements character {
    public String weapon="lightsaber";
    public enemy()
    {
      
    }
    public void attack()
    {
       System.out.println("enemy attacks you!"); 
    }
    public void heal(){
    System.out.println("the enemy heals himself");
    }

      public void drop()
      {
       System.out.println("enemy dropped weapons");
      }
   

   
   
}

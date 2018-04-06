/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication39;
public class hero implements character{
public String weapon="force";
    //this attack and heal method is present in Parent Method Too
    //so i used @Override
    @Override
    public void attack() {
        System.out.println("hero attacks enemy");
    }

    @Override
    public void heal() {
       System.out.println("hero heals up");
    }
    
}

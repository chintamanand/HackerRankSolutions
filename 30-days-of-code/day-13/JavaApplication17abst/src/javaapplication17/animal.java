/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

public abstract class animal {
    public int age;
   
    public animal(int age){
    this.age=age;
    System.out.println("animal is created !!age is:"+age);
    }
    public abstract void eat1();
    
    public void sleep(){
     System.out.println("Animals sleeping");//here it tells about the sleep methos for animal .
    }
    
    public void eat(){
     System.out.println("Animals eat");
    }
    public void walk(){
    System.out.println("animals can walk");
    }
    

    public static void main(String[] args) {
    dog d=new dog();
    cat c=new cat();
    d.eat();
    d.eats();
    d.sleep();
    c.eat();
    c.eats();
    c.sleep();
    Object dog=new dog();
    dog puppy = (dog)dog;
    puppy.eats();

    dog doggy=new dog();
     animal animal=(animal) doggy;
     animal.eat(); //here as we are casting the dog-object(initial) into animal .it has only the animal methods in it .
     
     
     doggy.bark();
    }
 
}
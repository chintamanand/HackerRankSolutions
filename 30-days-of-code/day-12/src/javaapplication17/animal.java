/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

public class animal {
    public int age;
   
    public animal(int age){
    this.age=age;
    System.out.println("animal is created !!age is:"+age);
    }
    public void eat(){
     System.out.println("Animals eat");
    }
    public void walk(){
    System.out.println("animals can walk");
    }
    public void sleep(){   //observe this method which is specified again in the cat.class also.
    System.out.println("animal is sleeping");
    }

    public static void main(String[] args) {
        // TODO code application logic here
    animal a=new animal(24);
    Object b=new animal(245);
    Object str="anand";
    String s=(String)str;
    System.out.println(s);
   
    
    //upcasting
    animal e=new cat();
    e.eat(); 
    //e.eats();
   //downcasting
    cat f=(cat) new animal(2);
    f.eat();
  
    
    
    
    
    dog d=new dog();
    cat c=new cat();
    
    //b.getClass();
    
    c.sleep();
    c.walk();
    c.eat();
    c.meow();
    d.eats();
    d.eat();
    d.bark();
    a.walk();
    a.eat();
}
}
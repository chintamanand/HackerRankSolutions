/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication27;
public class coffeetemp{
     public static final int toohot=180;
     public static final int toocold=160;
    
    public static void drinkcoffee(int coffeetemp) throws toohotexception,toocoldexcepetion
     {
      if(coffeetemp > toohot){
       throw new toohotexception();
      }
      else {if(coffeetemp < toocold){
       throw new toocoldexcepetion();
      }}
     } 
    public static void main(String[] args) {
        // TODO code application logic here
         int temp=150;
         try{
           drinkcoffee(temp);
         }
         catch(toohotexception e1)
         {
          System.out.println("Its too hot"+e1);
         }
         catch(toocoldexcepetion e2)
         {
          System.out.println("Its too cold"+e2);
         }
         System.out.println("normal temperature!!");
    }

    private static class toohotexception extends Exception {

        public toohotexception() {
        }
    }

    
     private static class toocoldexcepetion extends Exception {

        public toocoldexcepetion() {
        }
    }
    
    
}

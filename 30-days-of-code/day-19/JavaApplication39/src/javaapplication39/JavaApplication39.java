
package javaapplication39;
import java.util.Random;
public class JavaApplication39 {
    public static character netural()
    {
     Random rand=new Random();
     if(Math.abs(rand.nextInt())%2 == 0){
      return new enemy();
     }
     else{
     return new hero();
     }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        enemy darth=new enemy();
        hero obiwan=new hero();
        darth.attack();
        obiwan.attack();
        darth.heal();
        obiwan.heal();
        System.out.println(darth.weapon);
        System.out.println(obiwan.weapon);
        character spy = netural();
        spy.attack();
        spy.heal();
        
    }
    
}

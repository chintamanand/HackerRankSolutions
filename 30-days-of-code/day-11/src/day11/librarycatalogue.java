/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day11;

import java.util.HashMap;
import java.util.Map;
public class librarycatalogue 
{
        Map <String,book> bookcollection= new HashMap <String,book>();
        int currentday=0;
        int lengthofcheckoutperiod=7;//only for seven days for the borrow
        double initiallatefee=0.5;
        double feeperlateday=1.00;
        
        public librarycatalogue(Map <String,book> collection,int lengthofcheckoutperiod,double initiallatefee,double feeperlateday){
        this.bookcollection=collection;
        this.lengthofcheckoutperiod=lengthofcheckoutperiod;
        this.initiallatefee=initiallatefee;
        this.feeperlateday=feeperlateday;
        }
         public book getbook(String title){
         return getbookcollection().get(title);
        }
         
        public Map<String,book> getbookcollection(){
        return(this.bookcollection);
        }
        public int getcurrentday(){
        return(this.currentday);
        }
        public int getlengthofcheckoutperoid(){
        return(this.lengthofcheckoutperiod);
        }
         public int getinitiallatefee(){
         return(int)(this.initiallatefee);
        }
          public int getfeeperlateday(){
        return(int)(this.feeperlateday);
        }
          
          
          public void nextday(){
           currentday++;
          }
          public void setday(int day){
           currentday=day;
          }
          
          public void checkoutbook(String title){
           book book=getbook(title); //here we get the book from the get method.
           if(book.getischeckout()==true){
           sorrybookalreadycheckedout(book);
           }else{
            book.setcheckedout(true,currentday);
            System.out.println("you are ready to checkout :"+ title +"it is day on "+(getcurrentday() + getlengthofcheckoutperoid()));
           }
          }
          public void returnbook(String title){
          book book=getbook(title);
          int dayslate=currentday -(book.getdaycheckout() + getlengthofcheckoutperoid());
          if(dayslate > 0){
          System.out.println("you owe the library "+(getinitiallatefee() + dayslate+getfeeperlateday())+"because uor book is"+ dayslate+"days overdue.");
          }
          else{
                  System.out.println("thank u");
                  }
          book.setcheckedout(false,-1);
          }

         public  void sorrybookalreadycheckedout(book book) {
         System.out.println("sorry" +book.gettitle()+"is already checkedout"); //To change body of generated methods, choose Tools | Templates.
           }
          
    public static void main(String[] args) {
        // TODO code application logic here
         Map <String,book> bookCollection=new HashMap<String,book>();
         book harry =new book("harry potter",82390,909990);
         bookCollection.put("harry potter",harry);
         librarycatalogue lib = new librarycatalogue(bookCollection);
         lib.checkoutbook("harry potter");
         lib.nextday();
         lib.nextday();
         lib.checkoutbook("harry potter");
         lib.setday(17);
         lib.returnbook("harry potter");
         lib.checkoutbook("harry potter");
         
    }
}
    


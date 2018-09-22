package day11;
public class book {
    String title;//instance variables
    int isbn;
    int pagecount;
    Boolean ischeckout=false;
    int daycheckout = -1; //class variable
    
 public book(String booktitle,int bookisbn,int bookpagecount){
 this.title=booktitle;
 this.isbn=bookisbn;
 this.pagecount=bookpagecount;
}
 public String gettitle(){ //as in the constructor we can define new variables but those should be mappped with the class variables.
 return (this.title);
 }
 public int getisbn(){
 return (this.isbn);
 }
 public Boolean getischeckout(){
//this.ischeckedout=any new variable used in the constructor. 
     return (this.ischeckout);
 }
 public int getdaycheckout(){
 return (this.daycheckout);
  }
 
public void  setcheckedout(Boolean newIscheckedout,int currentdaycheckedout){
 this.ischeckout=newIscheckedout; //new variable is mapped with the class variable ischeckout  gives the boolean false
 setdaycheckedout(currentdaycheckedout);//currentdaycheckedout is mapped with the class variable daycheckout.
 }                                      //private class can be accessible by class that is calling.
private void setdaycheckedout(int day){ //here we are using the private class because those currentdaycheckout value will be given to the "daycheckout" as thte day parameter. 
this.daycheckout=day;
}
 
}

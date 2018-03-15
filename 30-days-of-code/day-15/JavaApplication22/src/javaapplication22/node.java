/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication22;

/**
 *
 * @author mahe
 */
public class node {
    int data;
    node next;
    //these are constructors
   public node(int data){
    data=this.data;
    next=null;
    }
   public node(int newdata,node newnode)
   {
    data=newdata;
    next=newnode;
   }
   //these are methods
   public void setdata(int newdata)
   {
       data=newdata;
   }
   public int getdata(){
    return(data);
   }
   public void setnext(node newnode){
    next=newnode;
   }
   public node getnext()
   {
    return(next);
   }
   
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication25;
public class node {
    int data;
    node head;
    int count=0;
    node(int data)
    {
     this.data=data;
    }
    node(int newdata,node newnode){
     this.data=newdata;
     this.head=newnode;
    }
    public void setdata(int data){
      this.data=data;
    }
    public void setnext(node newnode){
     this.head=newnode;
    }
    public int getdata(){
     return(data);
    }
    public node getnext(){
     return();
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

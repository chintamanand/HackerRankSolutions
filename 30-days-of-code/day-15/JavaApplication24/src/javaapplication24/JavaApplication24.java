/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication24;
import java.util.*;
import java.util.Scanner;

class Node {
	int data;
	Node next;
	Node(int d) {
        data = d;
        next = null;
    }
}
class Solution {
        public static  Node insert(Node head,int data) {
        //Complete this method
        Node temp=new Node(data);
        Node current=head;
        if(head == null){
            head=temp;
            return head;
        }
        else{
            while(current.next != null){
                current=current.next;
            }
            current.next=temp;
            return (head);
        }
    }
	public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}
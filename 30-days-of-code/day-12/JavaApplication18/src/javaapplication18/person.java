/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication18;

import java.util.Scanner;

public class person {
    public String firstname;
    public String secondname;
    int id;
    person(String firstname,String secondname,int id){
       this.firstname=firstname;
        this.secondname=secondname;
        this.id=id;
    }}
    class student extends person {
        int [] testscore;
        student(String firstname,String secondname,int id,int[] testscore){
        super(firstname,secondname,id);
        this.testscore=testscore;
        }
       char calculate(){
           int sum=0;
           char grade;
       for(int i=0;i<testscore.length;i++){
           sum+=testscore[i];
         }
        int avg=sum/testscore.length;
       if(avg<=100 && avg>=90)
            grade='O';
         else if(avg>=80 &&avg<90)
            grade='E';
         else if(avg>=70 &&avg<80)
            grade='A';
         else if(avg>=55 &&avg<70)
            grade='P';
         else if(avg>=40 &&avg<55)
            grade='D';
         else
            grade='T';
 
         return grade;
    }}
class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstname = scan.next();
		String lastname = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testscore = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testscore[i] = scan.nextInt();
		}
		scan.close();
		student s = new student(firstname, lastname, id, testscore);
		System.out.println("Grade: " + s.calculate());
	}
}


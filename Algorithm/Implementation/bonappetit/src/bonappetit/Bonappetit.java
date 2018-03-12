/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bonappetit;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class Bonappetit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int items[] = new int[n];
        int annaTotal=0;
 
        for(int i=0;i<n;i++){
            items[i] = in.nextInt();
            if(k!=i){
                annaTotal += items[i];
            }
        }
        int chargedItem = in.nextInt();
        if((annaTotal/2)==chargedItem){
            System.out.println("Bon Appetit");
        }else{
            System.out.println(chargedItem-(annaTotal/2));
        }
    }
    
}

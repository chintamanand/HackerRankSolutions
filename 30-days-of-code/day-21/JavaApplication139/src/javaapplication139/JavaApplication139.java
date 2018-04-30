/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication139;
import java.util.*;
public class JavaApplication139 {
    public static void main(String[] args) {
        // TODO code application logic here
      
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int p = sc.nextInt();
		System.out.println(solve(n, p));

		sc.close();
	}

	static int solve(int n, int p) {
		return Math.min(p / 2, (n / 2 * 2 + 1 - p) / 2);
	}
}
        
    
    


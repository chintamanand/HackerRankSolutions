/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package beautifuldaysatthemovies;
import java.util.*;
public class BeautifulDaysattheMovies {
public static int beautifulDays(int i, int j, int k) {
    int count=0;
    for(int x = i; x <= j; x++)
        {
    StringBuilder a=new StringBuilder(String.valueOf(x));
    int rev=Integer.parseInt(a.reverse().toString());
    if(Math.abs(x-rev)%k==0){
        count++;
    }}
    return count;
}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int j = in.nextInt();
        int k = in.nextInt();
        int result = beautifulDays(i, j, k);
        System.out.println(result);
        in.close();
    }
    
}

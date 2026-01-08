/**
*Pratik Ghute: 08-01-2026
*Solution for 
* https://codeforces.com/problemset/problem/1095/A
*/

// import java.io.File;
// import java.util.ArrayList;
import java.util.Scanner;

public class Solution40{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        String ans = "";

        for(int i=0, j=0;i<n;j++,i+=j){
            ans = ans +str.charAt(i);
        }

        System.out.println(ans);

    }
}



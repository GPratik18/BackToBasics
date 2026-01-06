/**
*Pratik Ghute: 06-01-2026
*Solution for 
* https://codeforces.com/problemset/problem/492/A
*/

// import java.io.File;
// import java.util.ArrayList;
import java.util.Scanner;

public class Solution37{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int height = 0;
        while(n>0){
            n -= getSumOfNNaturalNumbers(height+1);
            height++;
        }
        if(n<0){
            System.out.println(height-1);
        }else{
            System.out.println(height);
        }

    }

    static int getSumOfNNaturalNumbers(int n){
        if(n%2==0){
            return (n/2)*(n+1);
        }
        return ((n+1)/2) * n;
    }
}



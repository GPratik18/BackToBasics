/**
*Pratik Ghute: 04-01-2026
*Solution for 
*https://codeforces.com/problemset/problem/144/A
*/

import java.util.Scanner;

public class Solution28{
	public static void main(String[] args){
    
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        for(int i=0;i<n;i++){
            if(sc.nextByte()==1){
                System.out.println("HARD");
                return;
            }
        }
        System.out.println("EASY");
    }
    
} 




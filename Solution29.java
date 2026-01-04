/**
*Pratik Ghute: 04-01-2026
*Solution for 
*https://codeforces.com/problemset/problem/116/A
*/

import java.util.Scanner;

public class Solution29{
	public static void main(String[] args) throws  Exception{
    
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int capacity = 0;
        int passengers = 0;
        for(int i=0;i<n;i++){
            passengers -= sc.nextInt();
            passengers += sc.nextInt();
            if(capacity<passengers){
                capacity = passengers;
            }
        }
        System.out.println(capacity);
    }
    
} 




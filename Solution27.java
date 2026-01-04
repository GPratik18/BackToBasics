/**
*Pratik Ghute: 31-12-2025
*Solution for 
*https://codeforces.com/problemset/problem/144/A
*/

import java.util.Scanner;

public class Solution27{
	public static void main(String[] args) throws  Exception{
    
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int smallesIndex = 0;
        int smallest = Integer.MAX_VALUE;
        int largestIndex = 0;
        int largest = -1;
		for(int i=0;i<n;i++){
           int num = sc.nextInt();
           if(num <= smallest){
            smallest = num;
            smallesIndex = i;
           }

           if(num > largest){
            largest = num;
            largestIndex = i;
           }
		}
        // System.out.println("Smallest : "+smallest);
        // System.out.println("SmallestIndex : "+smallesIndex);
        // System.out.println("Largets : "+largest);
        // System.out.println("LargestIndex : "+largestIndex);
        int ans = (smallesIndex < largestIndex)?((n-1)-smallesIndex)+largestIndex-1:((n-1)-smallesIndex)+largestIndex;
        System.out.println(ans);
    }
    
} 




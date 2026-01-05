/**
*Pratik Ghute: 05-01-2026
*Solution for 
*https://codeforces.com/problemset/problem/702/A
*/

// import java.io.File;
import java.util.Scanner;

public class Solution34{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 1;
        int increasing = 1;
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            if(i>0 && arr[i]>arr[i-1]){
                increasing++;
            }else{
                increasing = 1;
            }

            if(increasing>max){
                max= increasing;
            }
        }
        System.out.println(max);


        
    } 
} 




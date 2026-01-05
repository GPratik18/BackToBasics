/**
*Pratik Ghute: 05-01-2026
*Solution for 
*https://codeforces.com/problemset/problem/546/A
*/

// import java.io.File;
import java.util.Scanner;

public class Solution31{
	public static void main(String[] args)throws  Exception{
        // System.out.println("TIME started:  "+ System.nanoTime());
        // File f = new File("input.txt");
		Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
		int n = sc.nextInt();
        int w = sc.nextInt();

        for(int i=1;i<=w;i++){
            n = n - i*k;
        }

        if(n>0){
            System.out.println(0);
        }else{
            System.out.println(-n);
        }
        
        
    }


    
} 




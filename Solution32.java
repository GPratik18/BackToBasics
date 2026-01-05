/**
*Pratik Ghute: 05-01-2026
*Solution for 
*https://codeforces.com/problemset/problem/791/A
*/

// import java.io.File;
import java.util.Scanner;

public class Solution32{
	public static void main(String[] args)throws  Exception{
        // System.out.println("TIME started:  "+ System.nanoTime());
        // File f = new File("input.txt");
		Scanner sc = new Scanner(System.in);
        int limak = sc.nextInt();
		int bob = sc.nextInt();

        int year = 0;
        while(limak<=bob){
            limak *= 3;
            bob *= 2;
            year ++;
        }
        System.out.println(year);
    }


    
} 




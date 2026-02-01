/**
*Pratik Ghute: 10-01-2026
*Solution for 
* https://codeforces.com/problemset/problem/109/A
*/

import java.util.Scanner;

public class Solution44{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // int n1 = num%4;
        int n2 = num/4;
        int n4 = num/7;
        int i = 0;
        while(i<=n4){
            int tmp = n2*4 + i*7;
            if(num == tmp){
                int abc = n2 / 7;
                n2 = n2 % 7;
                i = i+ abc*4;
                while(n2>0){
                    System.out.print(4);
                    n2--;
                }
                while(i>0){
                    System.out.print(7);
                    i--;
                }
                // System.out.println("4 :"+ n2+"   7:  "+i);
                return;
            }else if(tmp>num){
                n2--;
                // System.out.println("4 :"+ n2+"   7:  "+i);
            }else if(tmp<num){
                i++;
                // System.out.println("4 :"+ n2+"   7:  "+i);
            }
        }
        System.out.println(-1);

    }

    
}
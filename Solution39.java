/**
*Pratik Ghute: 08-01-2026
*Solution for 
*https://codeforces.com/problemset/problem/1303/A
*/

// import java.io.File;
import java.util.Scanner;

public class Solution39{
	public static void main(String[] args)throws  Exception{
        // System.out.println("TIME started:  "+ System.nanoTime());
        // File f = new File("input.txt");
		Scanner sc = new Scanner(System.in);
        int noOfTestCases = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<noOfTestCases;i++){
            int firstOne = -1;
            int lastOne = -1;
            int count = 0;
            String s = sc.nextLine();
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)=='1'){
                    if(firstOne == -1){
                        firstOne = j;
                    }
                    lastOne = j;
                }
            }
            for(int j = firstOne; j<lastOne;j++){
                if(s.charAt(j)=='0'){
                    count++;
                }
            }
            System.out.println(count);
        }
    }


    
} 




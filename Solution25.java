/**
*Pratik Ghute: 31-12-2025
*Solution for 
*https://codeforces.com/problemset/problem/510/A
*/

import java.util.Scanner;

public class Solution25{
	public static void main(String[] args) throws  Exception{
        // File f = new File("input.txt");
    
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
        int oddCnt = 0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(getCon(i, j, row, col, oddCnt)){
                    System.out.print("#");
                }else{
                    System.out.print(".");
                }
            }
            if(i%2==1) oddCnt ++;
            System.out.println();
        }

		
    }

    private static boolean getCon(int i, int j, int row, int col, int oddCnt){
        if(i%2==0) return true;
        else if( (oddCnt%2==0 && j==col-1) ||  (oddCnt%2==1 && j==0) ) return true;
        return false;
    }

}




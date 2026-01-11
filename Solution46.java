/**
*Pratik Ghute: 11-01-2026
*Solution for 
* https://codeforces.com/problemset/problem/2082/A
*/

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution46{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int k =0;k<num;k++){
            int row = sc.nextInt();
            int col = sc.nextInt();
            sc.nextLine();

            Set<Integer> rowSet = new HashSet<>();
            Set<Integer> colSet = new HashSet<>();
            int[][] arr = new int[row][col];

            for(int i=0;i<row;i++){
                String str =  sc.nextLine();
                int xor = 0;
                for(int j=0;j<col;j++){
                   int tmp = str.charAt(j)-'0';
                    xor ^= tmp;
                    arr[i][j] = tmp;
                }
                if(xor != 0){
                    rowSet.add(i);
                }
            }

            for(int i=0;i<col;i++){
                int xor = 0;
                for(int j=0;j<row;j++){
                    xor ^= arr[j][i];
                }
                if(xor != 0){
                    colSet.add(i);
                }
            }
            
            System.out.println((int)Math.max(rowSet.size(), colSet.size()));
            // System.out.println("from Row"+rowSet);
            // System.out.println("from Col"+colSet);
        }   
    }
    
}

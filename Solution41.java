/**
*Pratik Ghute: 08-01-2026
*Solution for 
* https://codeforces.com/problemset/problem/1391/B
*/

// import java.io.File;
// import java.util.ArrayList;
import java.util.Scanner;

public class Solution41{
	public static void main(String[] args)throws  Exception{
        // System.out.println("TIME started:  "+ System.nanoTime());
        // File f = new File("input.txt");
		Scanner sc = new Scanner(System.in);
        int noOfTestCases = sc.nextInt();
        for(int i=0;i<noOfTestCases;i++){
           int n = sc.nextInt();
           int m = sc.nextInt();
           sc.nextLine();
           char[][] arr = new char[n][m];
           for(int j=0; j<n;j++){
                arr[j] = sc.nextLine().toCharArray();
           } 
           int cnt = 0;
            for(int k=0;k<m-1;k++){
                if(arr[n-1][k]=='D'){
                    cnt++;
                }
            }

            for(int k=0;k<n-1;k++){
                if(arr[k][m-1]=='R'){
                    cnt++;
                }
            }
           System.out.println(cnt);
           

        //    printArr(arr);

        }
    }

    static void printArr(char[][] arr){

        System.out.println("Print Array Started============");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        System.out.println("Print Array End============");

    }

}
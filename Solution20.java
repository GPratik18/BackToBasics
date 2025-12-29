/**
 * @author Pratik Ghute
 * Solution for following problem
 * https://codeforces.com/problemset/problem/263/A
 */
import java.util.Scanner;
public class Solution20{

    public static void main(String[] args){
        byte N = 5;
        Scanner sc = new Scanner(System.in);
        byte[][] arr = new byte[N][N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                arr[i][j] = sc.nextByte();
                if(arr[i][j]==1){
                    System.out.println(Math.abs(i-(N/2)) + Math.abs(j-(N/2)));
                    return;
                }
            }
        }
        sc.close();
    }
}
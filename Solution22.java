/**
 * @author Pratik Ghute
 * Solution for following problem
 * https://codeforces.com/problemset/problem/723/A
 * 
 * PS term : Find the difference between largest and smallest
 */
import java.util.Scanner;
public class Solution22{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a<b){
            byte diff = (byte)Math.abs(a-b);
            a = a + diff;
            b = b - diff;
        }
        int ans = 0;
        if(a<c){
            ans = Math.abs(b-c);
        }else{
            if(b<c){
                ans = Math.abs(a-b);
            }else{
                ans = Math.abs(a-c);
            }
        }

        System.out.println(ans);
        sc.close();
    }
}
/**
 * Solution for 
 * @author Pratik Ghute
 * https://codeforces.com/contest/514/problem/A
 */

import java.util.Scanner;
public class Solution18{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        long ans = getChewbaccaNumber(num);
        System.out.println((ans < num) ? (ans < 1)? num : ans : num);
        sc.close();
    }

    public static long getChewbaccaNumber(long num){
        StringBuilder str = new StringBuilder("");
        while((long)num>0){
            byte tmp = (byte)(num%10);
            // System.out.println(tmp);
            num = num/10;
            if(tmp > 4){
                tmp = (byte)(9-tmp);
            }
            str.insert(0, String.valueOf(tmp), 0, 1);
            // System.out.println(str);

        }
        if(str.charAt(0)=='0'){
            str.replace(0, 1, "9");
        }
        return Long.valueOf(str.toString());
    }
}
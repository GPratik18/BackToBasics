/**
*Pratik Ghute: 10-01-2026
*Solution for 
* https://codeforces.com/problemset/problem/131/A
*/

import java.util.Scanner;

public class Solution43{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ans = "";

        boolean isCAPSLOCKON = true;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(isCap(ch)){
                ans += (char)(ch + 32);
            }else{
                ans += (char)(ch - 32);

                if(i!=0){
                    isCAPSLOCKON = false;
                    break;
                }
            }
        }

        if(isCAPSLOCKON){
            System.out.println(ans);
        }else{
            System.out.println(str);
        }
        

    }

    private static boolean isCap(char ch){
        return ch >= 'A'  && ch <= 'Z';
    }
}

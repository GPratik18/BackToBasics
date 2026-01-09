/**
*Pratik Ghute: 09-01-2026
*Solution for 
* https://codeforces.com/problemset/problem/118/A
*/

import java.util.Scanner;

public class Solution42{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ans = "";

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(!isVowel(ch)){
                if(isCap(ch)){
                    ch += (char)32;
                }
                ans = ans+ "."+ch;
            }
        }

        System.out.println(ans);

    }

    private static boolean isVowel(char ch){
        return ch == 'a' || ch == 'A'  ||
                ch == 'e' || ch == 'E'  ||
                ch == 'i' || ch == 'I'  ||
                ch == 'o' || ch == 'O'  ||
                ch == 'u' || ch == 'U'  ||
                ch == 'y' || ch == 'Y'  
                ;
    }

    private static boolean  isCap(char ch){
        return ch >= 'A'  && ch <= 'Z';
    }
}

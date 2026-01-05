/**
*Pratik Ghute: 05-01-2026
*Solution for 
*https://codeforces.com/problemset/problem/236/A
*/

// import java.io.File;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution33{
	public static void main(String[] args)throws  Exception{
        // System.out.println("TIME started:  "+ System.nanoTime());
        // File f = new File("input.txt");
		Scanner sc = new Scanner(System.in);
        String username = sc.next();
        Set<Character> unique = new HashSet<>();

        for(Character ch: username.toCharArray()){
            unique.add(ch);
        }

        int ans = unique.size()%2;
        if(ans == 0){
            System.out.println("CHAT WITH HER!");
        }else{
            System.out.println("IGNORE HIM!");
        }
    } 
} 




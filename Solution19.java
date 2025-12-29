/**
 * Solution for 
 * @author Pratik Ghute
 * https://codeforces.com/problemset/problem/703/A
 */

import java.util.Scanner;

public class Solution19{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int rounds = sc.nextInt();
        int mishkaWin = 0;
        int chrisWin = 0;
        for (int i=0;i<rounds;i++){
            int mishka = sc.nextInt();
            int chris = sc.nextInt();


            if(mishka>chris){
                mishkaWin++;
                // System.out.println("Mishka");
            }else if(chris>mishka){
                chrisWin++;
                // System.out.println("Chris");
            }
        }
        if(mishkaWin>chrisWin){
            System.out.println("Mishka");
        }else if(mishkaWin<chrisWin){
            System.out.println("Chris");
        }else{
            System.out.println("Friendship is magic!^^");
        }
        sc.close();
    }
}
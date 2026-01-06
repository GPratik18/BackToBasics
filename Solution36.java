/**
*Pratik Ghute: 06-01-2026
*Solution for 
* https://codeforces.com/problemset/problem/1097/A
*/

// import java.io.File;
// import java.util.ArrayList;
import java.util.Scanner;

public class Solution36{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        String cardOnTable = sc.next();
        for(int i=0;i<5;i++){
            String crd = sc.next();
            if(crd.charAt(0)==cardOnTable.charAt(0) || crd.charAt(1)==cardOnTable.charAt(1)){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}



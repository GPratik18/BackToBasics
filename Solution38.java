/**
*Pratik Ghute: 07-01-2026
*Solution for 
*https://codeforces.com/problemset/problem/1433/A
*/

// import java.io.File;
import java.util.Scanner;

public class Solution38{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int noOfTestCases = sc.nextInt();
        for(int i=0;i<noOfTestCases;i++){
            String n = sc.next();
            byte d = Byte.parseByte(n.substring(0,1));
            int cnt = 0;
            cnt+= 10*(d-1);

            switch (n.length()) {
                case 1:
                    cnt+=1;
                    break;
                case 2:
                    cnt+=3;
                    break;
                case 3:
                    cnt+=6;
                    break;
                case 4:
                    cnt+=10;
                    break;
                default:
                    break;
            }
            System.out.println(cnt);
            
        }
    } 
} 


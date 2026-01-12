

import java.util.Scanner;

public class Solution47{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int k=0;k<num;k++){
            long n = sc.nextLong();
            if(n==1 || n==1){
                System.out.println(0);
                continue;
            }
            if(n%2==0){
                System.out.println(n/2-1);
            }else{
                System.out.println(n/2);
            }
        }   
    }
}

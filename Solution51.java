

import java.util.Scanner;

public class Solution51{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        long row;
        long col;
        if(n%a==0){
            row = n/a;
        }
        else{
            row = n/a +1;
        }
        if(m%a==0){
            col = (m/a);
        }
        else{
            col = (m/a +1);
        }

        System.out.println(row*col);


    }
}

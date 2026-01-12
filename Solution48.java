

import java.util.Scanner;

public class Solution48{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int k=0;k<num;k++){
            int n = sc.nextInt();
            if(n <= 3){
                System.out.println(n);
                continue;
            }
            if(n%2==0){
                System.out.println(0);
                continue;
            }
            switch (n%3) {
                case 0 -> {
                    if ((n/3)%2==0) {
                        System.out.println(0);
                    } else {
                        System.out.println(1);
                    }
                    // continue;
                }
                case 2 -> {
                    if((n/3)%2==0){
                        System.out.println(0);
                    }else{
                        System.out.println(1);
                    }
                }
                default -> {
                    if((n/3)%2==0){
                        System.out.println(1);
                    }else{
                        System.out.println(0);
                    }
                }
            }

        }   
    }
}

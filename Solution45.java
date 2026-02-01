/**
*Pratik Ghute: 11-01-2026
*Solution for 
* https://codeforces.com/contest/1036/problem/C
*/

import java.util.Scanner;

public class Solution45{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int k =0;k<num;k++){
            long low = sc.nextLong();
            long high = sc.nextLong();
            if(high<1111){
                System.out.println(high-(low-1));
                continue;
            }
            long count ;
            if(low>1111){
                count = 0;
                for(long i=low;i<=high;i++){
                if(isClassy(i)){
                    count++;
                }
            }
            }else{
                count = 1111-(low);
                for(long i=1120;i<=high;i++){
                    if(isClassy(i)){
                        count++;
                    }
                }
            }
            
            
            System.out.println(count);
        }   
    }

    private static boolean isClassy(long n){
        if(n>9999){
            if(n%10==0){
                return true;
            }
        }
        long count =0;
        while(n>0){
            if(n%10 != 0){
                count++;
                if(count>3){
                    return false;
                }
            }
            n /= 10;
        }
        return true;
    }

    
}
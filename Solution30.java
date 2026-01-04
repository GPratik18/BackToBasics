/**
*Pratik Ghute: 04-01-2026
*Solution for 
*https://codeforces.com/problemset/problem/2182/B
*/

// import java.io.File;
import java.util.Scanner;

public class Solution30{
	public static void main(String[] args)throws  Exception{
        // System.out.println("TIME started:  "+ System.nanoTime());
        // File f = new File("input.txt");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int a1 = sc.nextInt();
            int b1 = sc.nextInt();
            int a2 = a1;
            int b2 = b1;

            int tmp = 1;

            int cnt1 = 1;
            int cnt2 = 1;

            int max1 = 0;
            int max2 = 0;

            do{
                if(cnt1%2==1){
                    a1 -= tmp;
                    if(a1>=0){
                        max1++;
                    }else{
                        break;
                    }
                }else{
                    b1 -= tmp;
                    if(b1>=0){
                        max1++;
                    }else{
                        break;
                    }
                }
                tmp *= 2;
                cnt1++;
            }while((a1>0 && cnt1%2==1)||( b1>0 && cnt1%2==0));

            if(a2!=b2){
                tmp = 1;
                do{
                    if(cnt2%2==1){
                        b2 -= tmp;
                        // System.out.println("b2: "+b2);
                        if(b2>=0){
                            max2++;
                        }else{
                            break;
                        }
                    }else{
                        a2 -= tmp;
                        // System.out.println("a2: "+a2);
                        if(a2>=0){
                            max2++;
                        }else{
                            break;
                        }
                    }
                    tmp *= 2;
                    cnt2++;
                }while((a2>0 && cnt2%2==0)||( b2>0 && cnt2%2==1));
            }
            // System.out.println("max1: "+max1);
            // System.out.println("max2: "+max2);

            System.out.println((max1>max2)?max1:max2);
        }
        // System.out.println("TIME ended:  "+System.nanoTime());
    }


    
} 




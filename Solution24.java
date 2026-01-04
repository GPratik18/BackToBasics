/**
*Pratik Ghute: 31-12-2025
*Solution for 
*https://codeforces.com/problemset/problem/1352/A
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Solution24{
	public static void main(String[] args) throws  Exception{
        // File f = new File("input.txt");
    
		Scanner sc = new Scanner(System.in);
		int noOftestCases = sc.nextInt();

		for(int i=0;i<noOftestCases;i++){
            int num = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            int index = 0;
            while(num>0){
                int n = num%10;
                // System.out.print(n);
                if(n!=0){
                    switch(index){
                        case 0 ->{
                            arr.add(n);
                        }

                        case 1 ->{
                            arr.add(n*10);
                        }

                        case 2 ->{
                            arr.add(n*100);
                        }

                        case 3 ->{
                            arr.add(n*1000);
                        }

                        case 4 ->{
                            arr.add(n*10000);
                        }
                    }
                }
                
                num = num / 10;
                index++;
            }
            System.out.println(arr.size());
            for (Integer elem : arr) {
                System.out.print(elem+" ");
            }
            System.out.println();
            // arr = null;
		}
    }

}




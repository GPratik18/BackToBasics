

import java.util.Scanner;

public class Solution50{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
        int kthelement = 0;
        for(int i=1;i<=num;i++){
            int tmp = sc.nextInt();
            if(tmp == 0){
                break;
            }
            if(k == i){
                kthelement = tmp;
            }
            else if(i>k && kthelement>tmp){
                break;
            }
            count++;
        }
        System.out.println(count);
    }
}

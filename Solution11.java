import java.util.Scanner;

public class Solution11{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=0;i<num;i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int ans = a%b;
			System.out.println(ans==0?0:b-(a%b));
		}
		
	
	}
}
import java.util.Scanner;
public class Solution3{
	public static void main(String[] args){
		int num = 0;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		for(int i=0;i<num;i++){
			int sum = 0;
			for(int j=0;j<3;j++){
				sum += sc.nextInt();
				if(sum==2){
					count++;
					sum = 0;
				}
			}
		}
		System.out.println(count);
	}
}
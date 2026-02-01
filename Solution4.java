import java.util.Scanner;
public class Solution3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = 5;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				int s = sc.nextInt();
				if(s==1){
					System.out.println(Math.abs(i-n/2) + Math.abs(j-n/2));
					return;
				}
			}
		}
	}
}
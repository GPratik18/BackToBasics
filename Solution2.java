import java.util.Scanner;
public class Solution2{

	public static void main(String[] args){
		int num = 0;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		sc.nextLine();
		int x = 0;
		for(int i=0;i<num;i++){
			String st = sc.nextLine();
			if(st.contains("+")){
				x++;
			}else{
				x--;
			}
		}
		System.out.println(x);
	}
}
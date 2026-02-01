import java.util.Scanner;

public class Solution8{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();sc.nextLine();
		for(int i=0;i<num;i++){
			String s = sc.nextLine();
			if(s.length()>10){
				System.out.println(getAbbr(s));
			}else{
				System.out.println(s);
			}
		}
	}
	private static String getAbbr(String str){
		StringBuilder ans = new StringBuilder("");
		ans.append(str.charAt(0));
		ans.append(str.length()-2);
		ans.append(str.charAt(str.length()-1));


		return ans.toString();
	}
}
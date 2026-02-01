import java.util.Scanner;

public class Solution7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		StringBuilder str = new StringBuilder(sc.nextLine());
		int one = 0, two = 0, three = 0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='1'){
				one++;
			}else if(str.charAt(i)=='2'){
				two++;
			}else if(str.charAt(i)=='3'){
				three++;
			}
		}
		str = new StringBuilder("");
		str.append(getString(1, one));
		str.append(getString(2, two));
		str.append(getString(3, three));
		if(str.length()>0 && str.charAt(str.length()-1)=='+'){
			str.setLength(str.length()-1);
		}
		System.out.println(str);
	}
	private static String getString(int num, int cnt){
		StringBuilder s = new StringBuilder();
		for(int i=0;i<cnt;i++){
			s.append(num);
			s.append("+");
		}
		return s.toString();
	}
}
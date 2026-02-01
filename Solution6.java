import java.util.Scanner;
//import java.util.StringBuilder;
public class Solution6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		StringBuilder ch = new StringBuilder(sc.nextLine());
		char c = ch.charAt(0);
		if(c>='a'){
			ch.replace(0,1, String.valueOf((char)(c-' ')));
		}
		System.out.println(ch);
	}
}
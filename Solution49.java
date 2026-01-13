
//Carnival Wheel
import java.util.Scanner;

public class Solution49{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int k=0;k<num;k++){
            int l = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();

            int tmp = a;
            int max = a;
            while(tmp != l-1){
                tmp = (tmp + b)%l;
                if(max<tmp){
                    max = tmp;
                }
                if(tmp == a){
                    break;
                }
            }
            System.out.println(max);
        }   
    }
}

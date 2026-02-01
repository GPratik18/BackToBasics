import java.util.*;

public class Solution61 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if(a==b){
                System.out.println(c);
            }else if(a==c){
                System.out.println(b);
            }else{
                System.out.println(a);
            }
        }

    }
}

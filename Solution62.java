import java.util.*;

public class Solution62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count  = 1;
        int first = sc.nextInt();
        for(int i=1;i<n;i++){
            int num = sc.nextInt();
            if((num^first) != 0){
                count ++;
            }
            first = num;
        }
        System.out.println(count);
    }
}


import java.util.*;

public class Solution59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for(int i=0;i<n;i++){
            int can = sc.nextInt();
            int cap = sc.nextInt();

            if(!(can+2>cap)){
                count++;
            }
        }
        System.out.println(count);
        
    }
}
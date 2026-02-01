import java.util.*;

public class Solution55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int count = 0;
        sc.nextLine();
        String str = sc.nextLine();
        for(int i=1;i<n;i++){
            if(str.charAt(i) == str.charAt(i-1)){
                count++;
            }
        }
        System.out.println(count);
    }
}
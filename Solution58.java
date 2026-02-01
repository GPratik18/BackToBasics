
import java.util.*;

public class Solution58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int width = n;
        for(int i=0;i<n;i++){
            if(h<sc.nextInt()){
                width++;
            }
        }
        System.out.println(width);
        
    }
}
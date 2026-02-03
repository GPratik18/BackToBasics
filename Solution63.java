import java.util.*;

public class Solution63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){

            String str = sc.nextLine();
            if(str.length()%2!=0){
                System.out.println("No");
            }else{
                if(str.substring(0, str.length()/2).equals(str.substring(str.length()/2))){
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }
            }
        }


    }
}

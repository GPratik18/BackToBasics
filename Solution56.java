import java.util.*;

public class Solution56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int countAnton = 0;
        int countDaniK = 0;
        sc.nextLine();
        String str = sc.nextLine();
        for(int i=0;i<n;i++){
            if(str.charAt(i) =='A'){
                countAnton++;
            }else{
                countDaniK++;
            }
        }
        if(countAnton>countDaniK){
            System.out.println("Anton");
        }else if(countAnton<countDaniK){
            System.out.println("Danik");
        }else{
            System.out.println("Friendship");
        }
    }
}
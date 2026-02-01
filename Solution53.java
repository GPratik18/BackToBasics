import java.util.*;

public class Solution53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();


        for(int i=0;i<str1.length();i++){
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);
            if(isCapital(ch1)){
                if(isCapital(ch2)){
                    if(ch1 == ch2){
                        // System.out.println(ch1 +": " +ch2);
                        continue;
                    }else if(ch1<ch2){
                        System.out.println(-1);
                        return;
                    }else{
                        System.out.println(1);
                        return;
                    }
                }else{
                    ch2 -= 32;
                    if(ch1 == ch2){
                        // System.out.println(ch1 +": " +ch2);
                        continue;
                    }else if(ch1<ch2){
                        System.out.println(-1);
                        return;
                    }else{
                        System.out.println(1);
                        return;
                    }
                }
            }else{
                if(!isCapital(ch2)){
                    if(ch1 == ch2){
                        // System.out.println(ch1 +": " +ch2);
                        continue;
                    }else if(ch1<ch2){
                        System.out.println(-1);
                        return;
                    }else{
                        System.out.println(1);
                        return;
                    }
                }else{
                    ch2 += 32;
                    if(ch1 == ch2){
                        // System.out.println(ch1 +": " +ch2);
                        continue;
                    }else if(ch1<ch2){
                        System.out.println(-1);
                        return;
                    }else{
                        System.out.println(1);
                        return;
                    }
                }
            }
        }
        System.out.println(0);
        sc.close();
    }
    static boolean isCapital(char ch){
        return (ch <= 'Z' && ch >='A');
    }
}
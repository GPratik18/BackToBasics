import java.util.*;

public class Solution52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            for (int k = 0; k < t; k++) {
                int n = sc.nextInt();
                
             
                Set<Integer> distinctColors = new HashSet<>();
                for (int i = 0; i < n; i++) {
                    distinctColors.add(sc.nextInt());
                }

                int currentDistinctCount = distinctColors.size();

                while (!distinctColors.contains(currentDistinctCount)) {
                    distinctColors.add(currentDistinctCount);
                    currentDistinctCount = distinctColors.size();
                }


                System.out.println(currentDistinctCount);
            }
        }
        sc.close();
    }
}
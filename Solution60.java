import java.util.*;

public class Solution60 {

    static String best = "CCC"; // global answer

    static int[] dr = {-1,-1,-1, 0,0, 1,1,1};
    static int[] dc = {-1, 0, 1,-1,1,-1,0,1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] grid = new char[3][3];
        for (int i = 0; i < 3; i++) {
            grid[i] = sc.nextLine().toCharArray();
        }

        boolean[][] visited = new boolean[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                dfs(grid, visited, i, j, "" + grid[i][j]);
            }
        }

        System.out.println(best);
    }

    static void dfs(char[][] grid, boolean[][] visited, int r, int c, String word) {
        if (word.length() == 3) {
            if (word.compareTo(best) < 0) {
                best = word;
            }
            return;
        }

        visited[r][c] = true;

        for (int k = 0; k < 8; k++) {
            int nr = r + dr[k];
            int nc = c + dc[k];

            if (nr >= 0 && nr < 3 && nc >= 0 && nc < 3 && !visited[nr][nc]) {
                dfs(grid, visited, nr, nc, word + grid[nr][nc]);
            }
        }

        visited[r][c] = false;
    }
}

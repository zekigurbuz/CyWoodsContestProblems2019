import java.util.*;
import java.io.*;

public class Bodies_Tristan {
    char[][] mat;
    int[][] sad;
    boolean works;

    public void run() throws Exception {
        Scanner file = new Scanner(new File("bodies.dat"));
        int temp = file.nextInt();
        file.nextLine();
        while (temp-- > 0) {
            works = false;
            int r = file.nextInt();
            int c = file.nextInt();
            file.nextLine();
            mat = new char[r][c];
            sad = new int[r][c];
            for (int[] x : sad)
                Arrays.fill(x, Integer.MAX_VALUE);
            for (int i = 0; i < r; i++)
                mat[i] = file.nextLine().trim().toCharArray();
            int sr = -1, sc = -1;
            for (int i = 0; i < r; i++)
                for (int j = 0; j < c; j++)
                    if (mat[i][j] == 'T') {
                        sr = i;
                        sc = j;
                    }
            recur(sr, sc, 0);
            if (!works)
                System.out.println("Bravo Six Going Dark... Mission Failed. We'll get em next time.");
            else
                System.out.println("Bravo Six Going Dark... at the end of the tunnel is a light.");

        }
    }

    void recur(int r, int c, int s) {
        if (r >= 0 && r < mat.length && c >= 0 && c < mat[r].length && mat[r][c] != '#' && mat[r][c] != 'P'
                && s < sad[r][c]) {
            for (int dr : new int[] { -1, 0, 1 }) {
                for (int dc : new int[] { -1, 0, 1 }) {
                    try {
                        if (mat[r + dr][c + dc] == 'P')
                            return;
                    } catch (Exception e) {

                    }
                }
            }
            sad[r][c] = s++;
            if (mat[r][c] == 'S')
                works = true;
            recur(r + 1, c, s);
            recur(r - 1, c, s);
            recur(r, c + 1, s);
            recur(r, c - 1, s);
        }
    }

    public static void main(String[] args) throws Exception {
        new Bodies_Tristan().run();
    }

}

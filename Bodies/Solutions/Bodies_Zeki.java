/** IMPORTS **/
import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import java.lang.Math.*;

public class Bodies_Zeki {
	/** GLOBAL VARIABLES **/
	long times = -1;
	static int r, c;

	/** MAIN CODE **/
	public void run() throws Exception {
		Scanner file = new Scanner(new File("bodies.dat".toLowerCase()));
		times = Long.parseLong(file.nextLine().trim());
		for (long asdf = 1; asdf <= times; asdf++) {
			r = file.nextInt();
			c = file.nextInt();
			int[][] shad = new int[r][c];
			char[][] mat = new char[r][c];
			int sx = 0;
			int sy = 0;
			for (int i = 0; i < r; i++) {
				mat[i] = file.next().trim().toCharArray();
				Arrays.fill(shad[i], Integer.MAX_VALUE);
				for (int j = 0; j < c; j++) {
					if (mat[i][j] == 'T') {
						sx = i;
						sy = j;
					}
				}
			}
			
			for (int i = 0; i < r; i++) {
				for (int j = 0; j < c; j++) {
					if (mat[i][j] == 'P') {
						for (int x = -1; x <= 1; x++) {
							for (int y = -1; y <= 1; y++) {
								if (ib(x+i,j+y)) mat[i+x][j+y] = '#';
							}
						}
					}
				}
			}
			Queue<Integer> q = new LinkedList<>();
			q.add(sx);
			q.add(sy);
			q.add(0);
			while (!q.isEmpty()) {
				int x = q.poll();
				int y = q.poll();
				int s = q.poll();
				if (!ib(x, y) || shad[x][y] <= s || mat[x][y] == '#') continue;
				shad[x][y] = s;
				q.add(x + 1);
				q.add(y);
				q.add(s + 1);
				q.add(x - 1);
				q.add(y);
				q.add(s + 1);
				q.add(x);
				q.add(y + 1);
				q.add(s + 1);
				q.add(x);
				q.add(y - 1);
				q.add(s + 1);
			}
			int ans = Integer.MAX_VALUE;
			for (int i = 0; i < r; i++) {
				for (int j = 0; j < c; j++) {
					if (mat[i][j] == 'S') {
						ans = Math.min(ans, shad[i][j]);
					}
				}
			}
			System.out.println("Bravo Six Going Dark... " + (ans == Integer.MAX_VALUE ? "Mission Failed. We'll get em next time." : "at the end of the tunnel is a light."));
		}
		file.close();
	}
	
	public static boolean ib(int x, int y) {
		return x >= 0 && y >= 0 && x < r && y < c;
	}

	/** EXTRAS **/
	public static void main(String[] cows) throws Exception {
		new Bodies_Zeki().run();
	}
}

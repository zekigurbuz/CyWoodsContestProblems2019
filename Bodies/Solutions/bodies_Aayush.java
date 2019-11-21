import java.util.*;
import java.io.*;

public class bodies {
	char[][] mat;
	boolean moves;

	public void run() throws Exception {
		Scanner file = new Scanner(new File("judgebodies.in"));
		int temp = file.nextInt();
		file.nextLine();
		for (int asdf = 0; asdf < temp; asdf++) {
			int r = file.nextInt();
			int c = file.nextInt();
			file.nextLine();
			mat = new char[r][c];
			moves = false;
			for (int i = 0; i < r; i++) {
				mat[i] = file.nextLine().toCharArray();
			}
			int sr = 0;
			int sc = 0;
			for (int i = 0; i < r; i++) {
				for (int j = 0; j < c; j++) {
					if (mat[i][j] == 'T') {
						sr = i;
						sc = j;
					} else if (mat[i][j] == 'P') {
						for(int dr : new int[] {-1, 0, 1})
							for(int dc : new int[] {-1, 0, 1})
								set(i+dr, j+dc);
					}
				}
			}
			recur(sr, sc);
			System.out.print("Bravo Six Going Dark...");
			System.out.println(moves ? " at the end of the tunnel is a light." : " Mission Failed. We'll get em next time.");
		}
	}
	public void set(int r, int c) {
		if(r < 0 || c < 0 || r >= mat.length || c >= mat[r].length) return;
		mat[r][c] = '#';
	}

	public void recur(int r, int c) {

		if (!moves && r >= 0 && r < mat.length && c >= 0 && c < mat[r].length && mat[r][c] != '#') {
			if (mat[r][c] == 'S') {
				moves = true;
				return;
			}
			char save = mat[r][c];
			mat[r][c] = '#';
			recur(r + 1, c);
			recur(r - 1, c);
			recur(r, c + 1);
			recur(r, c - 1);
			mat[r][c] = save;
		}
	}

	public static void main(String[] args) throws Exception {
		new bodies().run();
	}

}

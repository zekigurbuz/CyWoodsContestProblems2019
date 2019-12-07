import java.util.*;
import java.io.*;

public class Bodies_Alex { 
	String[][] maze;
	int[][] shadow;
	boolean possible = false;
	public void run() throws Exception {
		Scanner file = new Scanner(new File("bodies.dat"));
		int times = file.nextInt();
		file.nextLine();
		for (int i = 0; i < times; i++) {
			System.out.print("Bravo Six Going Dark... ");
			int x = file.nextInt(); 
			int y = file.nextInt(); 
			file.nextLine();
			maze = new String[x][y];
			shadow = new int[x][y];
			for (int[] thing : shadow) {
                Arrays.fill(thing, Integer.MAX_VALUE);
			}
			for (int j = 0; j < x; j++) {
				maze[j] = file.nextLine().split("");
			}
			for (int j = 0; j < x; j++) {
				for (int k = 0; k < y; k++) {
					if (maze[j][k].equals("P")) {
						if (j > 0 && k > 0 && !(maze[j-1][k-1].equals("P"))) maze[j-1][k-1] = "#";
						if (j > 0 && !(maze[j-1][k].equals("P"))) maze[j-1][k] = "#";
						if (j > 0 && k < y-1 && !(maze[j-1][k+1].equals("P"))) maze[j-1][k+1] = "#";
						if (k < y-1 && !(maze[j][k+1].equals("P"))) maze[j][k+1] = "#";
						if (j < x-1 && k < y-1 && !(maze[j+1][k+1].equals("P"))) maze[j+1][k+1] = "#";
						if (j < x-1 && !(maze[j+1][k].equals("P"))) maze[j+1][k] = "#";
						if (j < x-1 && k > 0 && !(maze[j+1][k-1].equals("P"))) maze[j+1][k-1] = "#";
						if (k > 0 && !(maze[j][k-1].equals("P"))) maze[j][k-1] = "#";
					}
				}
			}
			int startx = -1;
			int starty = -1;
			for (int j = 0; j < x; j++) {
				for (int k = 0; k < y; k++) {
					if (maze[j][k].equals("T")) {
						startx = j;
						starty = k;
					}
				}
			}
			if (startx == -1 || starty == -1) System.out.println("Mission Failed. We'll get em next time.");
			else {
				recur(startx, starty, 0);
				if (possible) System.out.println("at the end of the tunnel is a light.");
				else System.out.println("Mission Failed. We'll get em next time.");
			}
			possible = false;
			//for (int j = 0; j < maze.length; j++) {
				//for (int k = 0; k < maze[j].length; k++) {
					//System.out.print(maze[j][k]);
				//}
				//System.out.println();
			//}
		}
	}
	public void recur(int a, int b, int steps) {
		if (a >= 0 && b >= 0 && a < maze.length && b < maze[0].length && steps < shadow[a][b] && !(maze[a][b].equals("#")) && !(maze[a][b].equals("P"))) {
			shadow[a][b] = Math.min(steps, shadow[a][b]);
            if (maze[a][b].equals("S")) {
            	possible = true;
            	return;
            }
            recur(a+1, b, steps+1);
            recur(a-1, b, steps+1);
            recur(a, b+1, steps+1);
            recur(a, b-1, steps+1);
		}
	}
	public static void main(String[] args) throws Exception {
		new Bodies_Alex().run();
	}
}
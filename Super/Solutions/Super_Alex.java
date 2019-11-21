import java.util.*;

import java.io.*;

public class Super_Alex { 
	class Coordinate {
		int x;
		int y;
		int m;
		public Coordinate(int a, int b, int moves) {
			x = a;
			y = b;
			m = moves;
		}
	}
	public void run() throws Exception {
		Scanner file = new Scanner(new File("super.dat"));
		int times = file.nextInt();
		file.nextLine();
		for (int asdf = 0; asdf < times; asdf++) {
			int a = 8;
			int b = file.nextInt();
			file.nextLine();
			Coordinate start;
			int[][] board = new int[a][a];
			for (int ghjkl = 0; ghjkl < b; ghjkl++) {
				String[] thing = file.nextLine().split(" ");
				start = new Coordinate(Integer.parseInt(thing[1]), Integer.parseInt(thing[2]), 0);
				int endx = Integer.parseInt(thing[3]);
				int endy = Integer.parseInt(thing[4]);
				switch(thing[0]) {
				case "K":
					if (Math.abs(((double)(start.y-endy))/(start.x-endx)) == 1.0) {
						System.out.println(Math.abs(start.y-endy));
					}
					else {
						System.out.println(Math.max(Math.abs(start.x-endx), 
			                     Math.abs(start.y-endy)));
					}
					break;
				case "Q":
					if (Math.abs(((double)(start.y-endy))/(start.x-endx)) == 1.0) {
						System.out.println(1);
					}
					else if (start.y == endy || start.x == endx) {
						System.out.println(1);
					}
					else {
						System.out.println(2);
					}
					break;
				case "R":
					if (start.y == endy || start.x == endx) {
						System.out.println(1);
					}
					else {
						System.out.println(2);
					}
					break;
				case "B":
					if (Math.abs(((double)(start.y-endy))/(start.x-endx)) == 1.0) {
						System.out.println(1);
					}
					else {
						System.out.println(2);
					}
					break;
				case "N":
					Queue<Coordinate> q = new LinkedList<>();
					int x[] = {-2, -2, -1, -1, 1, 1, 2, 2};  
				    int y[] = {-1, 1, -2, 2, -2, 2, -1, 1};
				    q.add(start);
				    boolean[] thin = new boolean[a * a];
				    thin[start.y * a + start.x] = true;
				    while (!(q.isEmpty())) {
				    	Coordinate aa = q.poll();
				    	if (aa.x == endx && aa.y == endy) {
				    		System.out.println(aa.m);
				    		q.clear();
				    		break;
				    	}
				    	for (int i = 0; i < 8; i++) {
				    		int m = x[i] + aa.x;
				    		int n = y[i] + aa.y;
				    		if (m < 0 || m >= 8 || n < 0 || n >= 8 || thin[n * 8 + m]) continue;
				    		else {
				    			thin[n * a + m] = true;
				    			q.add(new Coordinate(m, n, aa.m + 1));
				    		}
				    	}
				    }
				    break;
				default:
				    System.out.println("this shouldn't happen if it does something wrong with data");
				}
			}
			System.out.println("-----");
		}
	}
	public static void main(String[] args) throws Exception {
		new Super_Alex().run();
	}
}
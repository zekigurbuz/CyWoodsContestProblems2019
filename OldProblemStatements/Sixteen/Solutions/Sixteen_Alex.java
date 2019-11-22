import java.io.*;
import java.util.*;

public class Sixteen_Alex {
	
	private Point start;
	private Point end;
	private char[][] maze;
	private char[][] mazeCopy;
	
	public void run() throws Exception {
		
		String filename = "sixteen.dat";
		char startChar = 'H';
		char endChar = 'S';
		char wallChar = '#';
		char pathChar = '*';
		char aroundChar = 'P';
		Scanner file = new Scanner(new File(filename));
		int times = file.nextInt();
		file.nextLine();
		
		for (int i = 0; i < times; i++) {
			
			int x = file.nextInt(); 
			int y = file.nextInt(); 
			file.nextLine();
			maze = new char[x][y];
			mazeCopy = new char[x][y];
			
			for (int j = 0; j < x; j++) {
				
				String temp = file.nextLine();
				
				for (int k = 0; k < y; k++) {
					
					maze[j][k] = temp.charAt(k);
					
					if (maze[j][k] == startChar) {
						
						start = new Point(j, k);
						
					}
					
					if (maze[j][k] == endChar) {
						
						end = new Point(j, k);
						
					}
					
				}
				
			}
			
			for (int j = 0; j < x; j++) {
				for (int k = 0; k < y; k++) {
					mazeCopy[j][k] = maze[j][k];
				}
			}
			for (int j = 0; j < x; j++) {
				for (int k = 0; k < y; k++) {
					if (maze[j][k] == aroundChar) {
						if (j-1 >= 0) maze[j-1][k] = wallChar;
						if (j+1 < x) maze[j+1][k] = wallChar;
						if (k-1 >= 0) maze[j][k-1] = wallChar;
						if (k+1 < y) maze[j][k+1] = wallChar;
					}
				}
			}

			
			Route s = new Route(start.getX(), start.getY(), 0, new boolean[x][y], new ArrayList<>());
			Queue<Route> q = new PriorityQueue<Route>();
			q.add(s);
			Route best = new Route();
			int min = Integer.MAX_VALUE;
			
			while(!q.isEmpty()) {
				
				Route curr = q.poll();
				
				if (curr.getCurrentPosition().getX() == end.getX() && curr.getCurrentPosition().getY() == end.getY()) {
					
					min = Math.min(min, curr.getStepsTraveled());
					best = curr;
					continue;
					
				}
				
				if (new Point(curr.getCurrentPosition().getX()+1, curr.getCurrentPosition().getY()).inBounds() && maze[curr.getCurrentPosition().getX()+1][curr.getCurrentPosition().getY()] != wallChar) {
					
					if (!(curr.getVisitedPositions()[curr.getCurrentPosition().getX()+1][curr.getCurrentPosition().getY()])) {
						
						curr.getVisitedPositions()[curr.getCurrentPosition().getX()+1][curr.getCurrentPosition().getY()] = true;
						boolean[][] test = curr.getVisitedPositions().clone();
						Route z = new Route(curr.getCurrentPosition().getX()+1, curr.getCurrentPosition().getY(), curr.getStepsTraveled()+1, test, (ArrayList<Point>) ((ArrayList<Point>) curr.getPointsVisited()).clone());
						z.getPointsVisited().add(curr.getCurrentPosition());
						q.add(z);
						
					}
					
				}
				
				if (new Point(curr.getCurrentPosition().getX(), curr.getCurrentPosition().getY()+1).inBounds() && maze[curr.getCurrentPosition().getX()][curr.getCurrentPosition().getY()+1] != wallChar) {
					
					if (!(curr.getVisitedPositions()[curr.getCurrentPosition().getX()][curr.getCurrentPosition().getY()+1])) {
						
						curr.getVisitedPositions()[curr.getCurrentPosition().getX()][curr.getCurrentPosition().getY()+1] = true;
						boolean[][] test = curr.getVisitedPositions().clone();
						Route z = new Route(curr.getCurrentPosition().getX(), curr.getCurrentPosition().getY()+1, curr.getStepsTraveled()+1, test, (ArrayList<Point>) ((ArrayList<Point>) curr.getPointsVisited()).clone());
						z.getPointsVisited().add(curr.getCurrentPosition());
						q.add(z);
						
					}
					
				}
				
				if (new Point(curr.getCurrentPosition().getX()-1, curr.getCurrentPosition().getY()).inBounds() && maze[curr.getCurrentPosition().getX()-1][curr.getCurrentPosition().getY()] != wallChar) {
					
					if (!(curr.getVisitedPositions()[curr.getCurrentPosition().getX()-1][curr.getCurrentPosition().getY()])) {
						
						curr.getVisitedPositions()[curr.getCurrentPosition().getX()-1][curr.getCurrentPosition().getY()] = true;
						boolean[][] test = curr.getVisitedPositions().clone();
						Route z = new Route(curr.getCurrentPosition().getX()-1, curr.getCurrentPosition().getY(), curr.getStepsTraveled()+1, test, (ArrayList<Point>) ((ArrayList<Point>) curr.getPointsVisited()).clone());
						z.getPointsVisited().add(curr.getCurrentPosition());
						q.add(z);
						
					}
					
				}
				
				if (new Point(curr.getCurrentPosition().getX(), curr.getCurrentPosition().getY()-1).inBounds() && maze[curr.getCurrentPosition().getX()][curr.getCurrentPosition().getY()-1] != wallChar) {
					
					if (!(curr.getVisitedPositions()[curr.getCurrentPosition().getX()][curr.getCurrentPosition().getY()-1])) {
						
						curr.getVisitedPositions()[curr.getCurrentPosition().getX()][curr.getCurrentPosition().getY()-1] = true;
						boolean[][] test = curr.getVisitedPositions().clone();
						Route z = new Route(curr.getCurrentPosition().getX(), curr.getCurrentPosition().getY()-1, curr.getStepsTraveled()+1, test, (ArrayList<Point>) ((ArrayList<Point>) curr.getPointsVisited()).clone());
						z.getPointsVisited().add(curr.getCurrentPosition());
						q.add(z);
						
					}
					
				}
				
			}
			
			if (min == Integer.MAX_VALUE) {
				
				System.out.println("Not Possible");

				
			}
			
			else {
				
				for (Point step : best.getPointsVisited()) {
					
					if (maze[step.getX()][step.getY()] != startChar && maze[step.getX()][step.getY()] != endChar) mazeCopy[step.getX()][step.getY()] = pathChar;
					
				}
				
				printMaze();
				
			}	
			
			System.out.println();
			
		}
		
		file.close();
		
	}
	
	public void printMaze() {
		
		for (char[] row: mazeCopy) {
			
			System.out.println(row);
			
		}
		
	}
	
	public static void main(String[] args) throws Exception {
		
		new Sixteen_Alex().run();
		
	}
	
	class Point {
		
		private int xPos;
		private int yPos;
		
		public Point() {
			
			xPos = 0;
			yPos = 0;
			
		}
		
		public Point(int x, int y) {
			
			xPos = x;
			yPos = y;
			
		}
		
		public int getX() {
			
			return xPos;
			
		}
		
		public int getY() {
			
			return yPos;
			
		}
		
		public void setX(int x) {
			
			xPos = x;
			
		}
		
		public void setY(int y) {
			
			yPos = y;
			
		}
		
		public double getDistance(Point p) {
			
			return Math.sqrt(Math.pow((p.xPos-xPos), 2) + Math.pow((p.yPos-yPos), 2));
			
		}
		
		public boolean inBounds() {
			
			return !(xPos >= maze.length || yPos >= maze[0].length || xPos < 0 || yPos < 0);
			
		}
		
		@Override
		public String toString() {
			
			return "(" + xPos + ", " + yPos + ")";
			
		}
		
	}

	class Route implements Comparable<Route> {
		
		private Point currentPosition;
		private int stepsTraveled;
		private boolean[][] visitedPositions;
		private List<Point> pointsVisited;
		
		public Route() {
			
			currentPosition = new Point();
			stepsTraveled = 0;
			visitedPositions = new boolean[maze.length][maze[0].length];
			pointsVisited = new ArrayList<Point>();
			
		}
		
		public Route(Point p, int s, boolean[][] v, ArrayList<Point> pv) {
			
			currentPosition = p;
			stepsTraveled = s;
			visitedPositions = v;
			pointsVisited = pv;
			
		}
		
		public Route(int x, int y, int s, boolean[][] v, ArrayList<Point> pv) {
			
			currentPosition = new Point(x, y);
			stepsTraveled = s;
			visitedPositions = v;
			pointsVisited = pv;
			
		}
		
		public Point getCurrentPosition() {
			
			return currentPosition;
			
		}
		
		public int getStepsTraveled() {
			
			return stepsTraveled;
			
		}
		
		public boolean[][] getVisitedPositions() {
			
			return visitedPositions;
			
		}
		
		public List<Point> getPointsVisited() {
			
			return pointsVisited;
			
		}
		
		@Override
		public int compareTo(Route r) {
			
			return currentPosition.getDistance(end) - r.getCurrentPosition().getDistance(end) < 0 ? -1 : 1;
			
		}
		
	}

}


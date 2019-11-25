import java.util.*;
import java.io.*;

public class Bodies_Christian
{
	String[][] maze;
	boolean reached;
	public void run() throws Exception
	{
		Scanner file = new Scanner(new File("bodies.dat"));
		
		int times = file.nextInt(); 
		file.nextLine();
		for(int asdf = 0; asdf<times; asdf++)
		{
			int row = file.nextInt(), column = file.nextInt(),r=0,c=0; file.nextLine();
			 maze = new String[row][column];
			for(int x=0; x < row;x++) maze[x] = file.nextLine().split("");
			for(int x=0;x<row;x++)
				for(int y=0; y < column;y++) {
					if(maze[x][y].equals("T"))
					{r=x; c=y;}	
				if(maze[x][y].equals("P"))
				{
					for(int x1=x-1;x1<x+2;x1++)
					{
						for(int y1=y-1;y1<y+2;y1++)
						{
							if(x1 > -1 && x1 < maze.length && y1 > -1 && y1 < maze[0].length)
								maze[x1][y1]="#";
										
						}
					}
				}
			}
			reached = false;
			recur(r,c);
			if(reached)
			System.out.println("Bravo Six Going Dark... at the end of the tunnel is a light.");  
			else
				System.out.println("Bravo Six Going Dark... Mission Failed. We'll get em next time.");
		}}
	public void recur(int r, int c)
	{
		if(!reached && c < maze[0].length && c > -1 && r < maze.length && r > -1 && !(maze[r][c].equals("#")))
		{
			if(maze[r][c].equals("S"))
				{reached=true;
				return;}
				maze[r][c] = "#";
				recur(r+1,c);
				recur(r-1,c);
				recur(r,c+1);
				recur(r,c-1);
		}
	}
	public static void main(String[] args) throws Exception
	{
		new Bodies_Christian().run();
	}	
	
}
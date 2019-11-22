import java.util.*;
import java.io.*;
class stud implements Comparable<stud>
{
	String name ="";
	long score;
	public stud(String n, long score)
	{
		name = n;
		this.score = score;
	}
	@Override
	public int compareTo(stud s)
	{
		if(s.score > score) return 1;
		else if(s.score < score) return -1;
		else 
		{
			return name.compareTo(s.name);
		}
	}
}
public class Cheating_Rahul
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(new File("cheating.dat"));
		
		int times = file.nextInt();
		file.nextLine();
		
		for (int asdf = 0; asdf < times; asdf++)
		{
			long rals = file.nextLong();
			file.nextLine();
			int n = file.nextInt();
			file.nextLine();
			Map<String, Long> map = new TreeMap<String, Long>();
			List<stud> ans = new ArrayList<stud>();
			for(int i = 0; i < n; i++)
			{
				String[] sa = file.nextLine().split(" ");
				map.put(sa[0],  Long.parseLong(sa[1]));
				ans.add(new stud( sa[0],Long.parseLong(sa[1])));
			}
			int r = file.nextInt();
			int c = file.nextInt();
			file.nextLine();
			int rr = 0, rc = 0;
			char[][] mat = new char[r][c];
			for(int i = 0; i < mat.length; i++)
			{
				mat[i] = file.nextLine().toCharArray();
				for(int j = 0; j < mat[i].length; j++)
				{
					if(mat[i][j] == 'R')
					{
						rr = i;
						rc = j;
					}
				}
			}
			boolean skrt = false;
			if(inBounds(rr-1,rc+1,r,c) && mat[rr-1][rc+1] != '.' && mat[rr-1][rc+1] != '#') 
			{
				if(rals == map.get("" + mat[rr-1][rc+1])) skrt = true;
			}
			if(inBounds(rr-1,rc-1,r,c) && mat[rr-1][rc-1] != '.' && mat[rr-1][rc-1] != '#')
			{
				if(rals == map.get("" + mat[rr-1][rc-1])) skrt = true;
			}
			if(inBounds(rr,rc+1,r,c) && mat[rr][rc+1] != '.'&& mat[rr][rc+1] != '#')
			{
				if(rals == map.get("" + mat[rr][rc+1])) skrt = true;
			}
			if(inBounds(rr,rc-1,r,c) && mat[rr][rc-1] != '.'&& mat[rr][rc-1] != '#')
			{
				if(rals == map.get("" + mat[rr][rc-1])) skrt = true;
			}
			if(!skrt) ans.add(new stud("R",rals));
			Collections.sort(ans);
			if(!skrt)
			{
				int cnt = 1;
				System.out.println("Ral is a God");
				for(stud s : ans)
				{
					System.out.println(cnt + ending(cnt++) + s.name + " with a " + s.score);
				}
				if(asdf < times-1) System.out.println();
			}
			else 
			{
				int cnt = 1;
				System.out.println("Ral is DQ'd and needs to skrt skrt");
				for(stud s : ans)
				{
					System.out.println(cnt + ending(cnt++) + s.name + " with a " + s.score);
				}
				if(asdf < times-1) System.out.println();
			}
		}
	}
	public boolean inBounds(int r, int c, int mr, int mc)
	{
		return r >= 0 && r < mr && c >= 0 && c < mc;
	}
	public String ending(int n)
	{
		n -= n/100*100;
		if(n > 10 && n < 20)
		{
			return "th Place - ";
		}
		else if(n % 10 == 1) return "st Place - ";
		else if(n%10==2) return "nd Place - ";
		else if(n%10==3) return "rd Place - ";
		else return "th Place - ";
	}
	public static void main(String[] args) throws Exception
	{
		new Cheating_Rahul().run();
	}
	
}

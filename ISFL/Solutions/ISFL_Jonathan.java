import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

			//change the class name
public class ISFL_Jonathan
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(new File("isfl.dat"));
		
			//read in the number at the top of the data file
		int times = file.nextInt(); 
			//pick up the left over enter key
		file.nextLine();
		TreeMap<String, ArrayList<String>> teams = new TreeMap<String,ArrayList<String>>();
			//read in each data set
		for(int asdf = 0; asdf<times; asdf++)
		{
			int asd=file.nextInt();
			file.nextLine();
			int team = 1;
			for(int i = 0; i < asd;i++)
			{
				String player = file.nextLine();
				String[] split = player.split("-");
				if(split.length > 1)
				{
					if(!teams.containsKey(split[1]))
					{
						teams.put(split[1],new ArrayList<String>());
					}
					if(teams.get(split[1]).size() > 2)
					{
						if(!teams.containsKey("Untitled Team " + team))
						{
							teams.put("Untitled Team " + team, new ArrayList<String>());
						}
						if(teams.get("Untitled Team " + team).size() > 2)
						{
							team+=1;
							teams.put("Untitled Team " + team, new ArrayList<String>());
						}
						ArrayList<String> ok = teams.get("Untitled Team " + team);
						ok.add(split[0]);
						teams.put("Untitled Team " + team, ok);
					}
					else
					{
						ArrayList<String> ok = teams.get(split[1]);
						ok.add(split[0]);
						teams.put(split[1],ok);
					}
				}
				else
				{
					if(!teams.containsKey("Untitled Team " + team))
					{
						teams.put("Untitled Team " + team, new ArrayList<String>());
					}
					if(teams.get("Untitled Team " + team).size() > 2)
					{
						team+=1;
						teams.put("Untitled Team " + team, new ArrayList<String>());
					}
					ArrayList<String> ok = teams.get("Untitled Team " + team);
					ok.add(split[0]);
					teams.put("Untitled Team " + team, ok);
				}
			}
			ArrayList<String> Alex = new ArrayList<String>();
			for(String b: teams.keySet())
				Alex.add(b);
			for(int x =0; x <Alex.size();x++)
			{
				
				ArrayList<String> ok = teams.get(Alex.get(x));
				Collections.sort(ok);
				System.out.println(Alex.get(x));
				for(int i = 0; i < ok.size();i++)
				{
					System.out.println(ok.get(i));
				}
				if((x < Alex.size() -1))
					System.out.println();
			}
			System.out.println("-----");
			//System.out.println();
			teams = new TreeMap<String,ArrayList<String>>();
			Alex = new ArrayList<String>();
		}
	}

	public static void main(String[] args) throws Exception
	{
			//change this to whatever your class name is
		new ISFL_Jonathan().run();
	}	
	
}

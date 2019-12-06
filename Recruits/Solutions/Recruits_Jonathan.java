import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

			//change the class name
public class Recruits_Jonathan
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(new File("recruits.dat"));
		
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
						if(!teams.containsKey("Untilted Team " + team))
						{
							teams.put("Untilted Team " + team, new ArrayList<String>());
						}
						if(teams.get("Untilted Team " + team).size() > 2)
						{
							team+=1;
							teams.put("Untilted Team " + team, new ArrayList<String>());
						}
						ArrayList<String> ok = teams.get("Untilted Team " + team);
						ok.add(split[0]);
						teams.put("Untilted Team " + team, ok);
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
					if(!teams.containsKey("Untilted Team " + team))
					{
						teams.put("Untilted Team " + team, new ArrayList<String>());
					}
					if(teams.get("Untilted Team " + team).size() > 2)
					{
						team+=1;
						teams.put("Untilted Team " + team, new ArrayList<String>());
					}
					ArrayList<String> ok = teams.get("Untilted Team " + team);
					ok.add(split[0]);
					teams.put("Untilted Team " + team, ok);
				}
			}
			for(String key:teams.keySet())
			{
				ArrayList<String> ok = teams.get(key);
				Collections.sort(ok, String.CASE_INSENSITIVE_ORDER);
				System.out.println(key);
				for(int i = 0; i < ok.size();i++)
				{
					System.out.println(ok.get(i));
				}
				System.out.println();
			}
			System.out.println("-----");
			System.out.println();
			teams = new TreeMap<String,ArrayList<String>>();
		}
	}

	public static void main(String[] args) throws Exception
	{
			//change this to whatever your class name is
		new Recruits_Jonathan().run();
	}	
	
}
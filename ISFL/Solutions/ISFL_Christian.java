import java.util.*;
import java.util.Map.Entry;
import java.io.*;

public class ISFL_Christian
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(new File("isfl.dat"));
		int times = file.nextInt();file.nextLine();
		for(int asdf = 0; asdf<times; asdf++)
		{
			int time = file.nextInt(), c=1;	file.nextLine();
			ArrayList<String> noteam = new ArrayList<String>();
			Map<String,ArrayList<String>> team = new TreeMap<String,ArrayList<String>>();
			for(int x= 0; x < time;x++)
			{
				String player=file.nextLine();
				if(player.indexOf("-") > -1)
				{
					String[] playerinfo = player.split("-");
					if(team.containsKey(playerinfo[1]))
					{
						ArrayList<String> teams = team.get(playerinfo[1]);
						if(teams.size() <3) {
						teams.add(playerinfo[0]); Collections.sort(teams);
						team.put(playerinfo[1], teams);}
						else
							noteam.add(playerinfo[0]);
					}
					else
					{
						team.put(playerinfo[1],new ArrayList<>(Arrays.asList(playerinfo[0])));
				}
				}
				else
					noteam.add(player);
			}
			for(String name: noteam)
			{
				if(team.containsKey("Untitled Team " + c))
				{
					ArrayList<String> teams = team.get("Untitled Team " + c);
					if(teams.size() <3) {
					teams.add(name); Collections.sort(teams);
					team.put("Untitled Team " + c, teams);}
					else
					{
						c++;
						team.put("Untitled Team " + c,new ArrayList<>(Arrays.asList(name)));	
					}
				}
				else
					{
					team.put("Untitled Team " + c,new ArrayList<>(Arrays.asList(name)));	
					}
				}
			String out = "";
			for (Entry<String, ArrayList<String>> entry: team.entrySet()) {
				out += entry.getKey()+"\n";
				for (String name: entry.getValue()) {
					out += name+"\n";
				}
				out += "\n";
			}
			System.out.println(out.replaceFirst("\\s+$", ""));
			System.out.println("-----");
		}
	}
		
	
	public static void main(String[] args) throws Exception
	{
		new ISFL_Christian().run();
	}	
	
}
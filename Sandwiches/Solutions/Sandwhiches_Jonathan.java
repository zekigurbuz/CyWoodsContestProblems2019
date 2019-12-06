import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

			//change the class name
public class Sandwhiches_Jonathan
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(new File("sandwiches.dat"));
		
			//read in the number at the top of the data file
		int times = file.nextInt(); 
			//pick up the left over enter key
		file.nextLine();
		ArrayList<String> bread = new ArrayList<String>();
		ArrayList<String> meat = new ArrayList<String>();
		ArrayList<String> cheese = new ArrayList<String>();
		HashMap<String,ArrayList<String>> ra = new HashMap<String,ArrayList<String>>();
			//read in each data set
		ra.put("bread",new ArrayList<String>());
		ra.put("meat",new ArrayList<String>());
		ra.put("cheese",new ArrayList<String>());

		for(int asdf = 0; asdf<times; asdf++)
		{
			String set = file.nextLine();
			String[] b = set.split("-");
			ArrayList<String> n = ra.get(b[1]);
			n.add(b[0]);
			ra.put(b[1],n);
		}
		for(int i = ra.get("bread").size()-1;i >= 0;i--)
		{
			bread.add(ra.get("bread").get(i));
		}
		for(int i = ra.get("meat").size()-1;i >= 0;i--)
		{
			meat.add(ra.get("meat").get(i));
		}
		for(int i = ra.get("cheese").size()-1;i >= 0;i--)
		{
			cheese.add(ra.get("cheese").get(i));
		}
		String n = "";
		while(cheese.size() > 0 && meat.size() > 0 && bread.size() > 0)
		{
			n= bread.get(0) + ", " + meat.get(0) + ", " + cheese.get(0);
			System.out.println(n);
			cheese.remove(0);
			meat.remove(0);
			bread.remove(0);
		}
		
		
		
		
		
		
	}

	public static void main(String[] args) throws Exception
	{
			//change this to whatever your class name is
		new Sandwhiches_Jonathan().run();
	}	
	
}
import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

			//change the class name
public class Like_Jonathan
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(new File("like.dat"));
		
			//read in the number at the top of the data file
		int times = file.nextInt(); 
			//pick up the left over enter key
		file.nextLine();
		
			//read in each data set
		for(int asdf = 0; asdf<times; asdf++)
		{
			String n = file.nextLine();
			String[] set = n.split(" ");
			ArrayList<String> r = new ArrayList<String>();
			for(String c: set)
			{
				r.add(c);
			}
			for(int i = 0;i < r.size();i++)
			{
				if(r.get(i).equals("like") || r.get(i).equals("uh") || r.get(i).equals("um"))
				{
					r.remove(i);
					i--;
				}
			}
			String rrr = "";
			for(int i =0; i < r.size();i++)
			{
				if(i < r.size()-1)
					rrr+=r.get(i)+" ";
				else
					rrr+=r.get(i);
			}
			System.out.println(rrr);
		}
	}

	public static void main(String[] args) throws Exception
	{
			//change this to whatever your class name is
		new Like_Jonathan().run();
	}	
	
}
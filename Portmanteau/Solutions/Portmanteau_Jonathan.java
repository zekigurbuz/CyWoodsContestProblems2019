import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

			//change the class name
public class Portmanteau_Jonathan
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(new File("portmanteau.dat"));
		
			//read in the number at the top of the data file
		int times = file.nextInt(); 
			//pick up the left over enter key
		file.nextLine();
		
			//read in each data set
		for(int asdf = 0; asdf<times; asdf++)
		{
			String all=file.nextLine();
			String[] allStrings = all.split(" ");
			boolean ye = false;
			for(int i = 0; i < allStrings[1].length();i++)
			{
				String start = allStrings[1].substring(0,i);
				String fix = start;
				for(int x = allStrings[2].length(); x > 0;x--)
				{
					fix+= allStrings[2].substring(x);
					if(fix.equals(allStrings[0]))
					{
						ye = true;
						break;
					}
					fix = start;
				}
				if(ye)
					break;
			}
			for(int i = 0; i < allStrings[2].length();i++)
			{
				String start = allStrings[2].substring(0,i);
				String fix = start;
				for(int x = allStrings[1].length(); x > 0;x--)
				{
					fix+= allStrings[1].substring(x);
					if(fix.equals(allStrings[0]))
					{
						ye = true;
						break;
					}
					fix = start;
				}
				if(ye)
					break;
			}
			if(ye)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}

	public static void main(String[] args) throws Exception
	{
			//change this to whatever your class name is
		new Portmanteau_Jonathan().run();
	}	
	
}
import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

			//change the class name
public class Unity_Jonathan
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(new File("unity.dat"));
		
			//read in the number at the top of the data file
		int times = file.nextInt(); 
			//pick up the left over enter key
		file.nextLine();
		boolean max = true;
			//read in each data set
		for(int asdf = 0; asdf<times; asdf++)
		{
			String next = file.nextLine();
			if(next.contains("Maxwell") && next.contains("Unity"))
			{
				max = false;
			}
		}
		if(max)
			System.out.println("Song passed! Everyone gets an A for Christmas.");
		else
			System.out.println("Song failed. Everyone gets an F in their stocking.");
	}

	public static void main(String[] args) throws Exception
	{
			//change this to whatever your class name is
		new Unity_Jonathan().run();
	}	
	
}
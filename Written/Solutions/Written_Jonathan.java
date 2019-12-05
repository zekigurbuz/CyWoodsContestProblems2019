import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

			//change the class name
public class Written_Jonathan
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(new File("written.dat"));
		
			//read in the number at the top of the data file
		int times = file.nextInt(); 
			//pick up the left over enter key
		file.nextLine();
		
			//read in each data set
		for(int asdf = 0; asdf<times; asdf++)
		{
			int a = file.nextInt();
			file.nextLine();
			boolean canbe = false;
			ArrayList<Integer> set = new ArrayList<Integer>();
			for(int i = 0; i <= 40;i++)
			{
				for(int x = 0; x <= 40-i;x++)
				{
					set.add(i*6 - (x*2));
				}
			}
			if(set.contains(a))
				canbe=true;
			if(canbe)
			{
				System.out.println("Possible");
			}
			if(!canbe)
			{
				System.out.println("Impossible");
			}
		}
	}

	public static void main(String[] args) throws Exception
	{
			//change this to whatever your class name is
		new Written_Jonathan().run();
	}	
	
}
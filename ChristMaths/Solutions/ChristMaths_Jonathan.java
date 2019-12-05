import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

			//change the class name
public class ChristMaths_Jonathan
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(new File("christmaths.dat"));
		
			//read in the number at the top of the data file
		int times = file.nextInt(); 
			//pick up the left over enter key
		file.nextLine();
		
			//read in each data set
		for(int asdf = 0; asdf<times; asdf++)
		{
			String holder = file.nextLine();
			String[] temp = holder.split(" ");
			String oper = temp[0];
			int ans = Integer.parseInt(temp[1]);
			String[] ab = oper.split("[+-/*]");
			int no = Integer.parseInt(ab[0]);
			int r = 1;
			for(int i = 0;i < oper.length();i++)
			{
				if(oper.substring(i,i+1).equals("+") || oper.substring(i,i+1).equals("-") || oper.substring(i,i+1).equals("*") || oper.substring(i,i+1).equals("/"))
				{
					if(oper.substring(i,i+1).equals("+"))
					{
						//System.out.println(no);
						no+= Integer.parseInt(ab[r]);
						//System.out.println(ab[r] + " " + no);
					}
					if(oper.substring(i,i+1).equals("-"))
					{
						no-= Integer.parseInt(ab[r]);
					}
					if(oper.substring(i,i+1).equals("*"))
					{
						no*= Integer.parseInt(ab[r]);
					}
					if(oper.substring(i,i+1).equals("/"))
					{
						no/= Integer.parseInt(ab[r]);
					}
					r++;
				}
			}
			if(no == ans)
			{
				System.out.println("Present for You");
			}
			else
			{
				//System.out.println(no);
				System.out.println("Coal for You");
			}
			
		}
	}

	public static void main(String[] args) throws Exception
	{
			//change this to whatever your class name is
		new ChristMaths_Jonathan().run();
	}	
	
}
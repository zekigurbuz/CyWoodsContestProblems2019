import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

			//change the class name
public class E_Jonathan
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(new File("e.dat"));
		
			//read in the number at the top of the data file
		int times = file.nextInt(); 
			//pick up the left over enter key
		file.nextLine();
		
			//read in each data set
		for(int asdf = 0; asdf<times; asdf++)
		{
			String a = file.nextLine();
			String[] b = a.split(" ");
			ArrayList<Double> c = new ArrayList<Double>();
			for(String r: b)
			{
				c.add(Double.parseDouble(r));
			}
			double average = 0;
			for(int i = 0; i < c.size()-1;i++)
			{
				average+= c.get(i);
			}
			average/=3;
			double fin = (average - c.get(3))/c.get(3);
			fin*=100;
			fin = Math.abs(fin);
			System.out.printf("%.2f",fin);
			System.out.print("%");
			System.out.println();
		}
	}

	public static void main(String[] args) throws Exception
	{
			//change this to whatever your class name is
		new E_Jonathan().run();
	}	
	
}
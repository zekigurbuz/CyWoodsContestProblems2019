import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

			//change the class name
public class Yeet_Christian
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(new File("yeet.dat"));
		
			//read in the number at the top of the data file
		int times = file.nextInt(); 
			//pick up the left over enter key
		file.nextLine();
		
			//read in each data set
		for(int asdf = 0; asdf<times; asdf++)
		{
			int a = file.nextInt();
			int b = file.nextInt();
			int c  = Integer.parseInt(b+""+a);
			if(c==Math.pow(a,b))
			System.out.println(c+" Yeet");
			else
			System.out.println(c+" Get Yoted");

		}
	}

	public static void main(String[] args) throws Exception
	{
		new Yeet_Christian().run();
	}	
	
}
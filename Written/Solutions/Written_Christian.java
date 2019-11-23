import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

			//change the class name
public class Written_Christian
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(new File("written.dat"));
		
		int times = file.nextInt(); 
		file.nextLine();
		for(int asdf = 0; asdf<times; asdf++)
		{
			int answer = file.nextInt();
			boolean correct = false;
			for(int x = 0; x < 41;x++)
				{
				for(int y= 0; y < 41;y++)
				if((x*6-y*2)==answer && x+y<41)
					correct=true;
				}
			if(correct)
				System.out.println("Possible");
			else
				System.out.println("Impossible");
		}
	
	}
	public static void main(String[] args) throws Exception
	{
		new Written_Christian().run();
	}	
	
}
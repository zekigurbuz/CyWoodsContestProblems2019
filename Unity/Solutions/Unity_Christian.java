import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

			//change the class name
public class Unity_Christian
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(new File("unity.dat"));
		
		int times = file.nextInt(); 
		file.nextLine();
		boolean fool = false;
		for(int asdf = 0; asdf<times; asdf++)
		{
			if(file.nextLine().indexOf("Maxwell: Regarding the Unity update...") > -1)
				fool=true;
		}
		if(fool)
			System.out.println("Song failed. Everyone gets an F in their stocking.");
		else
			System.out.print( "Song passed! Everyone gets an A for Christmas." );
		}
	public static void main(String[] args) throws Exception
	{
		new Unity_Christian().run();
	}	
	
}
import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

			//change the class name
public class Portmanteau_Christian
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(new File("portmanteau.dat"));
		
		int times = file.nextInt(); 
		file.nextLine();
		for(int asdf = 0; asdf<times; asdf++)
		{
			String f = file.next(), s = file.next(), t = file.next();
			boolean bool = false;
			for(int x =0; x < t.length() && !bool;x++)
				for(int y = 0; y < s.length() && !bool;y++)
					if((t.substring(0,x)+s.substring(y)).equals(f)) {
						bool=true;
						}
			for(int x =0; x < f.length() && !bool;x++)
				for(int y = 0; y < s.length() && !bool;y++)
					if((s.substring(0,x)+t.substring(y)).equals(f)) {
						bool=true;
						}
			if(bool)
				System.out.println("YES");
			else 
				System.out.println("NO");
					
		}}
	public static void main(String[] args) throws Exception
	{
		new Portmanteau_Christian().run();
	}	
	
}
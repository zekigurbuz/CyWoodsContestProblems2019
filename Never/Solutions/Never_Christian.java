import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

			//change the class name
public class Never_Christian
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(new File("never.dat"));
		while(file.hasNext())
			System.out.printf("Never Have I Ever %s.\n", file.nextLine());
		}
	

	public static void main(String[] args) throws Exception
	{
			//change this to whatever your class name is
		new Never_Christian().run();
	}	
	
}
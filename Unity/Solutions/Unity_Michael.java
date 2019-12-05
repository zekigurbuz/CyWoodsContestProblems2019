import java.io.*;
import java.util.*;
import java.text.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Character.*;
import static java.util.Collections.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Unity_Michael
{
	public static void main(String[] args)throws Exception
	{
		Scanner file=new Scanner(new File("unity.dat"));
		
		int times = file.nextInt();
		file.nextLine();	//pick up trash
		boolean b = false;
		for( int i = 0; i < times; i++ )
		{
			if (file.nextLine().matches("Maxwell: Regarding the Unity update..."))
			{
				b = true;
			}
		}
		if (b) System.out.println("Song failed. Everyone gets an F in their stocking.");
		else System.out.println("Song passed! Everyone gets an A for Christmas.");
	}
}
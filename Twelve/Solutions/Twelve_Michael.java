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

public class Twelve_Michael
{
	public static void main(String[] args)throws Exception
	{
		Scanner file=new Scanner(new File("twelve.dat"));
		
		int times = file.nextInt();
		file.nextLine();	//pick up trash
		
		for( int i = 0; i < times; i++ )
		{
			System.out.println("The next gift is " + file.nextLine() + ".");
		}
	}
}
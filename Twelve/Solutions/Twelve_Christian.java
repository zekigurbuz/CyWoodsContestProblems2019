import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

			//change the class name
public class Twelve_Christian
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(new File("twelve.dat"));
		int times = file.nextInt();
		file.nextLine();
		for (int i = 0; i < times; i++) {
			System.out.printf("The next gift is %s.\n", file.nextLine());
		}
	}
	

	public static void main(String[] args) throws Exception
	{
			//change this to whatever your class name is
		new Twelve_Christian().run();
	}	
	
}

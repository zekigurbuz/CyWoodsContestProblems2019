import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

			//change the class name
public class E_Christian
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(new File("e.dat"));
		
		int times = file.nextInt(); 
		file.nextLine();
		for(int asdf = 0; asdf<times; asdf++)
		{
			double per = 0;
			for(int x = 0; x < 3; x++)
				per+=file.nextDouble();
			per /=3;
			per = Math.abs(1-per/file.nextDouble())*100;
			System.out.printf("%.2f%%\n", per);
		}}
	public static void main(String[] args) throws Exception
	{
		new E_Christian().run();
	}	
	
}
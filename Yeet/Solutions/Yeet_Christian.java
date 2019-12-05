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
		int times = file.nextInt(); 
		file.nextLine();
		for(int asdf = 0; asdf<times; asdf++)
		{
			String a = file.next(), b = file.next();
			Long c  = Long.parseLong(b+a);
			if(c==Math.pow(Long.parseLong(a),Long.parseLong(b)))
			System.out.println(c+" Yeet");
			else
			System.out.println(c+" Get Yate");

		}
	}

	public static void main(String[] args) throws Exception
	{
		new Yeet_Christian().run();
	}	
	
}
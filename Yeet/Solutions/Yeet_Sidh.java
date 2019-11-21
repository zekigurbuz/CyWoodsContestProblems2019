import java.util.*;
import java.io.*;

public class Yeet_Sidh
{

	public void run() throws Exception
	{
		Scanner file = new Scanner(new File("yeet.dat"));
		int times = file.nextInt();
		for (int asdf = 0; asdf < times; asdf++)
		{
			String n = file.next(), p = file.next();
			if (p.equals("0")) System.out.print(n + " ");
			else System.out.print(p + n + " ");
			if ((p + n).equals("25") || (p + n).equals("01")) System.out.println("Yeet");
			else System.out.println("Get Yoted");
		}
	}

	public static void main(String[] args) throws Exception
	{
		new Yeet_Sidh().run();
	}

}

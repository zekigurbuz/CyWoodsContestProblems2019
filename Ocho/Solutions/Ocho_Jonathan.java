import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

			//change the class name
public class Ocho_Jonathan
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(new File("Ocho.dat"));
		
			//read in the number at the top of the data file
		int times = file.nextInt(); 
			//pick up the left over enter key
		file.nextLine();
		HashMap<String,Integer> set = new HashMap<String,Integer>();
		set.put("CERO",0);
		set.put("UNO",1);
		set.put("DOS",2);
		set.put("TRES",3);
		set.put("CUATRO",4);
		set.put("CINCO",5);
		set.put("SEIS",6);
		set.put("SIETE",7);
		set.put("OCHO",8);
		set.put("NUEVE",9);
		set.put("DIEZ",10);
			//read in each data set
		for(int asdf = 0; asdf<times; asdf++)
		{
			String seta = file.nextLine();
			String[] a = seta.split(" ");
			int a1 = set.get(a[0]);
			int a2 = set.get(a[1]);
			if(a1 == a2)
			{
				System.out.println(a1 + " = " + a2);
			}
			else
			{
				if(a1 == 8)
				{
					System.out.println(a1 + " > " + a2);
				}
				else
				{
					if(a2 == 8)
					{
						System.out.println(a1 + " < " + a2);
					}
					else
					{
						if(a1 > a2)
						{
							System.out.println(a1 + " > " + a2);
						}
						else
						{
							System.out.println(a1 + " < " + a2);

						}
					}
				}
			}
			
		}
	}

	public static void main(String[] args) throws Exception
	{
			//change this to whatever your class name is
		new Ocho_Jonathan().run();
	}	
	
}
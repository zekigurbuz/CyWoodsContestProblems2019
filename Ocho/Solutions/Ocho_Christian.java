import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

			//change the class name
public class Ocho_Christian
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(new File("ocho.dat"));
		
			//read in the number at the top of the data file
		int times = file.nextInt(); 
			//pick up the left over enter key
		file.nextLine();
		
			//read in each data set
		for(int asdf = 0; asdf<times; asdf++)
		{
			String[] spanish = "CERO UNO DOS TRES CUATRO CINCO SEIS SIETE OCHO NUEVE DIEZ".split(" ");
			int first = 0, second = 0;
			for(int x = 0; x < 2;x++)
			{
				String c = file.next();
				for(int y=0; y < spanish.length;y++)
					if(spanish[y].equals(c))
						if(x==0)
							first=y;
						else
							second=y;
			}
			if(first != 8 && second!=8) {
			if(first > second)
			System.out.println(first + " > " + second);
			else if(first < second)
			System.out.println(first +  " < " + second);
			else
			System.out.println(first + " = " + second);}
			if(first==8)
				System.out.println(first + " > " + second);
			else if(second==8)
			System.out.println(first +  " < " + second);
			file.nextLine();
			}

	}

	public static void main(String[] args) throws Exception
	{
			//change this to whatever your class name is
		new Ocho_Christian().run();
	}	
	
}
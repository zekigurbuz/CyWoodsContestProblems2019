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

public class Ocho_Michael
{
	public void run()throws Exception
	{
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("CERO", 0);
		map.put("UNO", 1);
		map.put("DOS", 2);
		map.put("TRES", 3);
		map.put("CUATRO", 4);
		map.put("CINCO", 5);
		map.put("SEIS", 6);
		map.put("SIETE", 7);
		map.put("OCHO", 80);
		map.put("NUEVE", 9);
		map.put("DIEZ", 10);
		
		Scanner file=new Scanner(new File("ocho.dat"));
		
		int times = file.nextInt();
		file.nextLine();	//pick up trash
		
		for( int t = 0; t < times; t++ )
		{
			int one = map.get(file.next());
			int two = map.get(file.next());
			
			if (one==80) System.out.print(one/10);
			else System.out.print(one);
			
			if (one>two) System.out.print(" > ");
			else if (one<two) System.out.print(" < ");
			else if (one==two) System.out.print(" = ");
			
			if (two==80) System.out.println(two/10);
			else System.out.println(two);
		}
		
	}

	public static void main(String[] args)throws Exception
	{
		Ocho_Michael x = new Ocho_Michael();
		x.run();
	}
}
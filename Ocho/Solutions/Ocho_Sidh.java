import java.util.*;
import java.io.*;

public class Ocho_Sidh
{

	public void run() throws Exception
	{
		Scanner file = new Scanner(new File("ocho.dat"));
		int times = file.nextInt();
		HashMap<String, Integer> map = new HashMap<>();
		map.put("CERO", 0);
		map.put("UNO", 1);
		map.put("DOS", 2);
		map.put("TRES", 3);
		map.put("CUATRO", 4);
		map.put("CINCO", 5);
		map.put("SEIS", 6);
		map.put("SIETE", 7);
		map.put("OCHO", 8);
		map.put("NUEVE", 9);
		map.put("DIEZ", 10);
		while (times-->0)
		{
			String w1 = file.next(), w2 = file.next();
			int n1 = map.get(w1), n2 = map.get(w2);
			if (n1 == n2) System.out.println(n1 + " = " + n2);
			else if (n1 == 8) System.out.println(n1 + " > " + n2);
			else if (n2 == 8) System.out.println(n1 + " < " + n2);
			else if (n1 > n2) System.out.println(n1 + " > " + n2);
			else System.out.println(n1 + " < " + n2);
		}
	}

	public static void main(String[] args) throws Exception
	{
		new Ocho_Sidh().run();
	}

}

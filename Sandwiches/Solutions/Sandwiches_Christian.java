import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

			//change the class name
public class Sandwiches_Christian
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(new File("sandwiches.dat"));
		int times = file.nextInt(); 
		file.nextLine();
		Stack<String> meat = new Stack<String>(), cheese = new Stack<String>(), bread = new Stack<String>();
		for(int asdf = 0; asdf<times; asdf++)
		{
			String word[] = file.nextLine().split("-");
			if(word[1].equals("bread")) bread.add(word[0]);
			if(word[1].equals("meat")) meat.add(word[0]);
			if(word[1].equals("cheese")) cheese.add(word[0]);
			}
		while(!bread.empty() && !cheese.empty() && !meat.empty())
			{System.out.printf("%s, %s, %s\n", bread.pop(),meat.pop(),cheese.pop());}
		}
	public static void main(String[] args) throws Exception
	{
		new Sandwiches_Christian().run();
	}	
	
}
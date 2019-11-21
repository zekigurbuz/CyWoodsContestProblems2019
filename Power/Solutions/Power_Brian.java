import java.util.*;
import java.io.*;

public class Power_Brian
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(new File("power.dat"));
		int times = file.nextInt(); file.nextLine();
		for(int asdf=0;asdf<times;asdf++) {
			int number = file.nextInt();
			String word = file.next();
			if(number==212 && word.equals("wildcat"))
			{
				System.out.println("Heaven on Earth");
				continue;
			}
			if(number%212==0 && word.matches("[WILDCATwildcat]*"))
				System.out.println("212 spirit attained");
			else if(number%212==0 ^ word.matches("[WILDCATwildcat]*"))
				System.out.println("Be the hyena");
			else
				System.out.println("This is some Eight Rivers garbage");
		}
	}
	
	public static void main(String[] args) throws Exception
	{
		new Power_Brian().run();
	}
}

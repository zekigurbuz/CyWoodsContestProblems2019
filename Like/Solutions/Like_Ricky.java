import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

			//change the class name
public class Like_Ricky
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(new File("Like.dat"));
		
			//read in the number at the top of the data file
		int times = file.nextInt(); 
			//pick up the left over enter key
		file.nextLine();
		
			//read in each data set
		for(int asdf = 0; asdf<times; asdf++)
		{
			String [] sen = file.nextLine().split(" ");
			String check = "like um uh";
			String ret = "";
			for(int i=0; i < sen.length; i++) {
				if(!check.contains(sen[i])) {
					System.out.print(sen[i]);
					if(i!=sen.length-1)
						System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) throws Exception
	{
			//change this to whatever your class name is
		new Like_Ricky().run();
	}	
	
}
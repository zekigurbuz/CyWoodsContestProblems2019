import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

			//change the class name
public class ChristMaths_Christian
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(new File("christmaths.dat"));
		
			//read in the number at the top of the data file
		int times = file.nextInt(); 
			//pick up the left over enter key
		file.nextLine();
		
			//read in each data set
		for(int asdf = 0; asdf<times; asdf++)
		{
			String[] formula = file.next().split("");
			int answer = file.nextInt();
			int currentvalue = 0;
			for(int x = 0; x < formula.length;x++)
			{
			String value = formula[x];

			if("+-*/".indexOf(value) > -1)
			{
			if(value.equals("+")){
			currentvalue+=Integer.parseInt(formula[x+1]);
			x++;}
			if(value.equals("-")){
				currentvalue-=Integer.parseInt(formula[x+1]);
			x++;}
			if(value.equals("*")){
				currentvalue*=Integer.parseInt(formula[x+1]);
			x++;}
			if(value.equals("/")){
				currentvalue/=Integer.parseInt(formula[x+1]);
			x++;}
			}
			else
			currentvalue+= Integer.parseInt(value);
			}
			if(currentvalue == answer)
			System.out.println("Present for You");
			else
			System.out.println("Coal for You");

		}
	}

	public static void main(String[] args) throws Exception
	{
			//change this to whatever your class name is
		new ChristMaths_Christian().run();
	}	
	
}
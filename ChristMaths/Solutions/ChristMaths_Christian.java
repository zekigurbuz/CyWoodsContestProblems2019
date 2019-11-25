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
		int times = file.nextInt(); 
		file.nextLine();
		for(int asdf = 0; asdf<times; asdf++)
		{
			String formula = file.next();
			String[] numbers = formula.split("[^0-9]");
			Long answer = file.nextLong();
			int currentvalue = 0;
			ArrayList<String> operators = new ArrayList<String>();
			operators.add("0");
			for(int x=0; x < formula.length();x++)
				if("+-*/".indexOf(formula.substring(x,x+1)) > -1) operators.add(formula.substring(x,x+1));
			for(int x = 0; x < operators.size();x++)
			{
				String op = operators.get(x);
			if(op.equals("0")) {currentvalue += Integer.parseInt(numbers[x]);}	
			if(op.equals("+")){currentvalue+=Integer.parseInt(numbers[x]);}
			if(op.equals("-")){currentvalue-=Integer.parseInt(numbers[x]);}
			if(op.equals("*")){currentvalue*=Integer.parseInt(numbers[x]);}
			if(op.equals("/")){ currentvalue/=Integer.parseInt(numbers[x]);}
			}
			System.out.println(answer == currentvalue ? "Present for You" : "Coal for You");
		}
	}

	public static void main(String[] args) throws Exception
	{
			//change this to whatever your class name is
		new ChristMaths_Christian().run();
	}	
	
}
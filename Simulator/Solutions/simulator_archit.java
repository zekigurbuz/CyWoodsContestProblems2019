import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class simulator_archit {
	
	public void run() throws Exception
	{
		Scanner file = new Scanner(new File("simulator.dat"));
		
			//read in the number at the top of the data file
		int times = file.nextInt(); 
			//pick up the left over enter key
		file.nextLine();
		
			//read in each data set
		for(int asdf = 0; asdf<times; asdf++)
		{
		
			double t1 = file.nextDouble();
			double t2 = file.nextDouble();
			double t3 = file.nextDouble();
			double actual = file.nextDouble();
			
			double avg = (t1+t2+t3)/3;
			double decimal = (Math.abs((actual-avg)))/actual;
			double percent = decimal * 100;
			System.out.printf("%.2f",percent);
			System.out.print("%");
			System.out.println();
		}
	}

	public static void main(String[] args) throws Exception
	{
			//change this to whatever your class name is
		new simulator_archit().run();
	}

}

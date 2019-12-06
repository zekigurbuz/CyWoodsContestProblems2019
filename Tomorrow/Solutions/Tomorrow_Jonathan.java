import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

			//change the class name
public class Tomorrow_Jonathan
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(new File("tomorrow.dat"));
		
			//read in the number at the top of the data file
		int times = file.nextInt(); 
			//pick up the left over enter key
		file.nextLine();
		
			//read in each data set
		for(int asdf = 0; asdf<times; asdf++)
		{
			String d = file.nextLine();
			String[] cal = d.split(" ");
			Calendar Can = Calendar.getInstance();
			int month = Integer.parseInt(cal[0])-1;
			int day = Integer.parseInt(cal[1])+1;
			int year = Integer.parseInt(cal[2]);
			Can.set(year,month,day);
			SimpleDateFormat sdf = new SimpleDateFormat("MM dd yyyy");
			System.out.println(sdf.format(Can.getTime()));

		}
	}

	public static void main(String[] args) throws Exception
	{
			//change this to whatever your class name is
		new Tomorrow_Jonathan().run();
	}	
	
}
import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

			//change the class name
public class Tomorrow_Christian
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(new File("tomorrow.dat"));
		
		int times = file.nextInt(); 
		file.nextLine();
		for(int asdf = 0; asdf<times; asdf++)
		{
			String[] date = file.nextLine().split(" ");
			int year = Integer.parseInt(date[2]), day = Integer.parseInt(date[1])+1, month=Integer.parseInt(date[0])-1;
			Calendar calendar = Calendar.getInstance();
			calendar.set(year,month,day);
			SimpleDateFormat sdf = new SimpleDateFormat("MM dd yyyy");
			System.out.println(sdf.format(calendar.getTime()));
		}}
	public static void main(String[] args) throws Exception
	{
		new Tomorrow_Christian().run();
	}	
	
}
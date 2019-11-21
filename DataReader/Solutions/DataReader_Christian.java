import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

			//change the class name
public class DataReader_Christian
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(new File("datareader.dat"));
		int times = file.nextInt(); 
		file.nextLine();
		for(int asdf = 0; asdf<times; asdf++)
		{
			int lines = file.nextInt()-1;
			String correct = file.next();
			ArrayList<String> list = new ArrayList<String>();
			for(int x = 0; x < lines;x++) {
				list.add(file.next());}
			int topnumber = 0;
			String topline = "";
		for(int x = 0; x < list.size();x++)
		{
			int counter = 0;
			for(int y = 0; y< list.get(x).length();y++)
				if(list.get(x).substring(y,y+1).equals(correct.substring(y,y+1)))
						counter++;
			if(counter > topnumber) {
				topnumber = counter;
				topline = list.get(x);}
		}
		if (topline.length() == 0)
			System.out.println("Failed");
		else{
		int percentage = topnumber*100/topline.length();
		System.out.println(topline + "\nConfidence Interval: " + percentage + "%");
		if(asdf < times-1) System.out.println();}}
	}

	public static void main(String[] args) throws Exception
	{
		new DataReader_Christian().run();
	}	
	
}

import java.io.*;
import java.util.*;
import java.text.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Character.*;
import static java.util.Collections.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class E_Michael {

	public static void main(String[] args)throws Exception
	{
		Scanner file=new Scanner(new File("e.dat"));
		
		int times = file.nextInt();
		file.nextLine();	//pick up trash
		
		for( int i = 0; i < times; i++ )
		{
			float avg = 0;
			for (int j=0; j<3; j++)
			{
				avg += file.nextFloat();
			}
			avg /= 3;
			float act = file.nextFloat();
			float error = (avg-act)/act*100;
			error = Math.abs(error);
			System.out.printf("%.2f", error);
			System.out.println("%");
		}
	}
}

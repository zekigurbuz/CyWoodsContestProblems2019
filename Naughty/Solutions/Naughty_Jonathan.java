import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

			//change the class name
public class Naughty_Jonathan
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(new File("naughty.dat"));
		
			//read in the number at the top of the data file
		int times = file.nextInt(); 
			//pick up the left over enter key
        file.nextLine();


			//read in each data set
		for(int asdf = 0; asdf<times; asdf++)
		{
            int next = 0;
            next = file.nextInt();
            file.nextLine();
            double correct = 0;
            String mostCorrect = "";
            String org = file.nextLine();
            for(int x = 1; x < next;x++)
            {
                int temp = 0;
                String a = file.nextLine();
                for(int z = 0; z < org.length();z++)
                {
                    if(org.substring(z,z+1).equals(a.substring(z,z+1)))
                    {
                        temp++;
                    }
                }
                if(temp > correct)
                {
                    mostCorrect = a;
                    correct = temp;
                }
            }
            if(correct == 0)
            {
                System.out.println("FAILED");
                System.out.println("Accuracy Percentage: NaN");
            }
            else
            {
                double per = correct/mostCorrect.length() * 100;
                System.out.println(mostCorrect);
                System.out.println("Accuracy Percentage: " + (int)Math.round(per) + "%");
            }
            System.out.println();
		}
	}

	public static void main(String[] args) throws Exception
	{
			//change this to whatever your class name is
		new Naughty_Jonathan().run();
	}	
	
}
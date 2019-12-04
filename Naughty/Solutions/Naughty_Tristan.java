import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

			//change the class name
public class Naughty_Tristan
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(new File("naughty.dat"));
		int times = file.nextInt(); 
        file.nextLine();
        while(times-->0)
        {
            TreeMap<Double, String> map = new TreeMap<>();
            int n = file.nextInt(); file.nextLine();
            String correct = file.nextLine();
            while(n---1>0)
            {
                String next = file.nextLine();
                double d = 0;
                for(int i=0;i<next.length();i++) if(next.charAt(i) == correct.charAt(i)) d++;
                d /= next.length();
                if(d == 0) d = Double.NaN;
                map.put(d,next);
            }
            if(map.containsKey(Double.NaN) && map.size() > 1) map.remove(Double.NaN);
            if(Double.isNaN(map.lastEntry().getKey()))
            {
                System.out.println("FAILED");
                System.out.println("Accuracy Percentage: NaN");
            }
            else
            {
                System.out.println(map.lastEntry().getValue());
                System.out.println("Accuracy Percentage: " + Math.round(100*map.lastEntry().getKey()) + "%");
            }
            if(times != 0) System.out.println();
        }
		
	}

	public static void main(String[] args) throws Exception
	{
		new Naughty_Tristan().run();
	}	
	
}
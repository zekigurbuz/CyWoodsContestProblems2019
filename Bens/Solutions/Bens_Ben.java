import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

			//change the class name
public class Bens_Ben
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(new File("bens.dat"));
		
			//read in the number at the top of the data file
		int times = file.nextInt(); 
			//pick up the left over enter key
		file.nextLine();
		
			//read in each data set
		for(int asdf = 0; asdf<times; asdf++)
		{
			ArrayList <Ben> bb = new ArrayList <Ben> ();
			int bens = file.nextInt();
			for(int i = 0; i < bens; i++) {
				String name = file.next() + " " + file.next();
				double d = file.nextDouble();
				int q = file.nextInt();
				int qq = file.nextInt();
				int c = qq - q;
				double dd = file.nextDouble(); 
				Ben b = new Ben(name, d, c, dd);
				if (file.hasNext()) file.nextLine();
				bb.add(b);
			}
			String ss = "";
			Collections.sort(bb);
			for(int i = 0; i < bb.size() - 1; i++) {
				ss += bb.get(i).name + ", ";
			}
			ss += bb.get(bb.size() - 1).name;
			System.out.println(ss);
		}
	}
	class Ben implements Comparable <Ben>{
		public String name;
		double grade;
		int range;
		double length;
		public Ben(String n, double g, int r, double len) {
			name = n;
			grade = g;
			range = r;
			length = len;
		}
		@Override
		public int compareTo(Ben b) {
			// TODO Auto-generated method stub
			if(grade > b.grade) {
				return 1;
			}
			else if(grade < b.grade) {
				return -1;
			}
			else if(range > b.range) {
				return 1;
			}
			else if(range < b.range) {
				return -1;
			}
			else if(length > b.length) {
				return 1;
			}
			else if(length < b.length) {
				return -1;
			}
			return 0;
		}
		
	}
	public static void main(String[] args) throws Exception
	{
			//change this to whatever your class name is
		new Bens_Ben().run();
	}	
	
}
/** IMPORTS **/
import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import java.lang.Math.*;

public class Bens_Zeki {
	/** GLOBAL VARIABLES **/
	long times = -1;

	/** MAIN CODE **/
	public void run() throws Exception {
		Scanner file = new Scanner(new File("bens.dat".toLowerCase()));
		times = Long.parseLong(file.nextLine().trim());
		for (long asdf = 1; asdf <= times; asdf++) {
			int n = Integer.parseInt(file.nextLine().trim());
			Ben[] b = new Ben[n];
			for (int i = 0; i < n; i++) {
				b[i] = new Ben(file.next() + " " + file.next(), file.nextDouble(), file.nextInt(), file.nextInt(), file.nextDouble());
				if (file.hasNext()) file.nextLine();
			}
			Arrays.sort(b);
			for (int i = 0; i < n; i++) {
				System.out.print(b[i].toString() + (i < n - 1 ? ", " : "\n"));
			}
		}
		file.close();
	}
	
	public static class Ben implements Comparable<Ben> {
		private String name;
		private double grade, femur;
		private int range;
		
		public Ben(String name, double grade, int low, int high, double femur) {
			this.name = name;
			this.grade = grade;
			this.range = high - low;
			this.femur = femur;
		}
		
		public int compareTo(Ben o) {
			if (grade < o.grade) return -1;
			if (grade > o.grade) return 1;
			if (range < o.range) return -1;
			if (range > o.range) return 1;
			if (femur < o.femur) return -1;
			if (femur > o.femur) return 1;
			return name.compareTo(o.name);
		}
		
		public String toString() {
			return name;
		}
	}

	/** EXTRAS **/
	public static void main(String[] cows) throws Exception {
		new Bens_Zeki().run();
	}
}

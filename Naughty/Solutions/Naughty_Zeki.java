/** IMPORTS **/
import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import java.lang.Math.*;

public class Naughty_Zeki {
	/** GLOBAL VARIABLES **/
	long times = -1;

	/** MAIN CODE **/
	public void run() throws Exception {
		Scanner file = new Scanner(new File("naughty.dat".toLowerCase()));
		times = Long.parseLong(file.nextLine().trim());
		for (int asdf = 1; asdf <= times; asdf++) {
			int n = Integer.parseInt(file.nextLine().trim());
			Word.comp = file.nextLine();
			Word[] w = new Word[n - 1];
			for (int i = 0; i < n - 1; i++) {
				w[i] = new Word(file.nextLine(), i);
			}
			Arrays.sort(w);
			System.out.println(w[0]);
		}
		file.close();
	}
	
	public static class Word implements Comparable<Word> {
		public static String comp;
		private String s;
		private double acc;
		private int index;
		
		public Word(String s, int index) {
			this.s = s;
			this.index = index;
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == comp.charAt(i)) {
					acc++;
				}
			}
			acc = acc * 100 / comp.length();
		}
		
		public int compareTo(Word o) {
			if (Double.compare(o.acc, acc) == 0) return Integer.compare(index, o.index);
			else return Double.compare(o.acc, acc);
		}
		
		public String toString() {
			String result = "";
			if (acc < 0.5) {
				result += "FAILED\nAccuracy Percentage: NaN\n";
			}
			else {
				result += String.format("%s%nAccuracy Percentage: %d%%%n", s, Math.round(acc));
			}
			return result;
		}
	}
	
	/** EXTRAS **/
	public static void main(String[] cows) throws Exception {
		new Naughty_Zeki().run();
	}
}
import java.util.*;
import java.io.*;

class Ben implements Comparable<Ben> {
	String name;
	double grade;
	int range;
	double length;
	public Ben(String n, double g, int l, int h, double le) {
		name = n;
		grade = g;
		range = Math.abs(h-l);
		length = le;
	}
	public int compareTo(Ben b) {
		if (grade > b.grade) return 1;
		else if (grade < b.grade) return -1;
		else {
			if (range > b.range)return 1;
			else if (range < b.range)return -1;
			else {
				if (length > b.length) return 1;
				else if (length < b.length)return -1;
				else return 0;
			}
		}
	}
	public String toString() {
		return name;
	}
}

public class Bens_Alex { 
	public void run() throws Exception {
		Scanner file = new Scanner(new File("bens.dat"));
		int times = file.nextInt();
		file.nextLine();
		for (int i = 0; i < times; i++) {
			int x = file.nextInt();
			file.nextLine();
			List<Ben> l = new ArrayList<Ben>();
			for (int j = 0; j < x; j++) {
				l.add(new Ben(file.next() + " " + file.next(), Double.parseDouble(file.next()), Integer.parseInt(file.next()), Integer.parseInt(file.next()), Double.parseDouble(file.next())));
				if (file.hasNext()) file.nextLine();
			}
			Collections.sort(l);
			String s = "";
			for (Ben b: l) {
				s += b.toString() + ", ";
			}
			s = s.substring(0, s.length()-2);
			System.out.println(s);
		}
		
	}
	public static void main(String[] args) throws Exception {
		new Bens_Alex().run();
	}
}
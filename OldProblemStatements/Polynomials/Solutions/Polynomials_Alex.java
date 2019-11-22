import java.util.*;
import java.io.*;

public class Polynomials_Alex { 
	public void run() throws Exception {
		Scanner file = new Scanner(new File("polynomials.dat"));
		int times = file.nextInt();
		file.nextLine();
		for (int asdf = 0; asdf < times; asdf++) {
			String a = file.nextLine();
			a = a.replace("-", "+-");
			String[] b = a.split("\\+");
			String[][] c = new String[b.length][2];
			for (int i = 0; i < b.length; i++) {
				if (b[i].substring(0, 1).equals("x")) b[i] = "1" + b[i];
				String[] e = b[i].split("x\\^");
				if (e.length == 2) {
					if (e[0].equals("")) {
						c[i][0] = "1";
					}
					else c[i][0] = e[0];
					c[i][1] = e[1];
				}
				else {
					c[i][0] = e[0];
					if (e[0].matches(".*x.*")) {
						c[i][1] = "1";
					}
					else c[i][1] = "0";
				}
				if (c[i][0].matches(".*x.*")) c[i][0] = c[i][0].substring(0, c[i][0].length()-1);
			}
			Arrays.sort(c, new Comparator<String[]>() { 
		        public int compare(final String[] entry1, final String[] entry2) { 
		            if (Integer.parseInt(entry1[1]) < Integer.parseInt(entry2[1])) 
		                return 1; 
		            else if (Integer.parseInt(entry1[1]) > Integer.parseInt(entry2[1]))
		                return -1; 
		            else if (Integer.parseInt(entry1[0]) < Integer.parseInt(entry2[0]))
		            	return 1;
		            else return -1;
		        } 
		    });
			int deg = Integer.parseInt(c[0][1]);
			String print = "";
			for (String[] f: c) {
				while (Integer.parseInt(f[1]) != deg) {
					print += "0 ";
					deg--;
				}
				print += f[0] + " ";
				deg--;
			}
			print = print.substring(0, print.length()-1);
			System.out.println(print);
		}
	}
	public static void main(String[] args) throws Exception {
		new Polynomials_Alex().run();
	}
}
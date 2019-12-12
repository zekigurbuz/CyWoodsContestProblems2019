/** IMPORTS **/
import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import java.lang.Math.*;

public class Trivia_Zeki {
	/** GLOBAL VARIABLES **/
	long times = -1;

	/** MAIN CODE **/
	public void run() throws Exception {
		Scanner file = new Scanner(new File("trivia.dat".toLowerCase()));
		times = Long.parseLong(file.nextLine().trim());
		for (long asdf = 1; asdf <= times; asdf++) {
			String n1 = file.next();
			String n2 = file.nextLine().trim();
			String[] a = file.nextLine().trim().split(" ");
			int a1 = 0;
			int a2 = 0;
			String[] b = file.nextLine().trim().split(" ");
			for (int i = 0; i < b.length; i++) {
				if (i % 2 == 0) {
					if (b[i].equals(a[i/2])) a1++;
				}
				else {
					if (b[i].equals(a[i/2])) a2++;
				}
			}
			if (a1 > a2) {
				System.out.printf("%s has won this round!%n", n1);
			}
			else if (a2 > a1) {
				System.out.printf("%s has won this round!%n", n2);
			}
			else {
				System.out.printf("%s and %s are tied this round!%n", n1, n2);
			}
		}
		file.close();
	}

	/** EXTRAS **/
	public static void main(String[] cows) throws Exception {
		new Trivia_Zeki().run();
	}
}
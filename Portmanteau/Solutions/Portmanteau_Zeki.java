/** IMPORTS **/
import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import java.lang.Math.*;

public class Portmanteau_Zeki {
	/** GLOBAL VARIABLES **/
	long times = -1;
	static String c;

	/** MAIN CODE **/
	public void run() throws Exception {
		Scanner file = new Scanner(new File("portmanteau.dat".toLowerCase()));
		times = Long.parseLong(file.nextLine().trim());
		for (long asdf = 1; asdf <= times; asdf++) {
			c = file.next();
			String a = file.next();
			String b = file.next();
			boolean ans = works(a, b) || works(b, a);
			System.out.println(ans ? "YES" : "NO");
		}
		file.close();
	}

	/** EXTRAS **/
	public static void main(String[] cows) throws Exception {
		new Portmanteau_Zeki().run();
	}
	
	public static boolean works(String a, String b) {
		HashSet<String> h1 = new HashSet<>();
		HashSet<String> h2 = new HashSet<>();
		for (int i = 1; i < a.length(); i++) {
			h1.add(a.substring(0, i));
		}
		for (int i = b.length() - 1; i >= 0; i--) {
			h2.add(b.substring(i, b.length()));
		}
		boolean works = false;
		for (int i = 0; i <= c.length(); i++) {
			works |= h1.contains(c.substring(0, i)) && h2.contains(c.substring(i, c.length()));
		}
		return works;
	}
}

/** IMPORTS **/
import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import java.lang.Math.*;

public class Sandwiches_Zeki {
	/** GLOBAL VARIABLES **/
	long times = -1;

	/** MAIN CODE **/
	public void run() throws Exception {
		Scanner file = new Scanner(new File("sandwiches.dat".toLowerCase()));
		times = Long.parseLong(file.nextLine().trim());
		Stack<String> a = new Stack<>();
		Stack<String> b = new Stack<>();
		Stack<String> c = new Stack<>();
		for (long asdf = 1; asdf <= times; asdf++) {
			String in = file.nextLine();
			String fi = in.substring(0, in.indexOf("-"));
			String se = in.substring(in.indexOf("-") + 1).trim();
			if (se.equals("bread")) {
				a.add(fi);
			}
			else if (se.equals("meat")) {
				b.add(fi);
			}
			else {
				c.add(fi);
			}
		}
		while (!a.isEmpty() && !b.isEmpty() && !c.isEmpty()) {
			System.out.printf("%s, %s, %s%n", a.pop(), b.pop(), c.pop());
		}
		file.close();
	}

	/** EXTRAS **/
	public static void main(String[] cows) throws Exception {
		new Sandwiches_Zeki().run();
	}
}

/** IMPORTS **/
import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import java.lang.Math.*;

public class Yeet_Zeki {
	/** GLOBAL VARIABLES **/
	long times = -1;

	/** MAIN CODE **/
	public void run() throws Exception {
		Scanner file = new Scanner(new File("yeet.dat".toLowerCase()));
		times = Long.parseLong(file.nextLine().trim());
		for (long asdf = 1; asdf <= times; asdf++) {
			int n = file.nextInt();
			int p = file.nextInt();
			int c = Integer.parseInt(p+""+n);
			System.out.println(c + " " + (c == Math.pow(n, p) ? "Yeet" : "Get Yate"));
		}
		file.close();
	}

	/** EXTRAS **/
	public static void main(String[] cows) throws Exception {
		new Yeet_Zeki().run();
	}
}

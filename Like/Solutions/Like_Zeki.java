/** IMPORTS **/
import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import java.lang.Math.*;

public class Like_Zeki {
	/** GLOBAL VARIABLES **/
	long times = -1;

	/** MAIN CODE **/
	public void run() throws Exception {
		Scanner file = new Scanner(new File("like.dat".toLowerCase()));
		times = Long.parseLong(file.nextLine().trim());
		for (long asdf = 1; asdf <= times; asdf++) {
			String s = file.nextLine().trim();
			String[] rem = {"like", "um", "uh"};
			for (String t : rem) {
				s = s.replaceAll("\\b" + t + "\\b", " ");
				s = s.replaceAll("[\\s]+", " ");
			}
			System.out.println(s.trim());
		}
		file.close();
	}

	/** EXTRAS **/
	public static void main(String[] cows) throws Exception {
		new Like_Zeki().run();
	}
}
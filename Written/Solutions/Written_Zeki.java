/** IMPORTS **/
import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import java.lang.Math.*;

public class Written_Zeki {
	/** GLOBAL VARIABLES **/
	long times = -1;

	/** MAIN CODE **/
	public void run() throws Exception {
		Scanner file = new Scanner(new File("written.dat".toLowerCase()));
		times = Long.parseLong(file.nextLine().trim());
		HashSet<Integer> hs = new HashSet<>();
		for (int i = 0; i <= 40; i++) {
			for (int j = 0; j <= 40; j++) {
				if (i + j <= 40) {
					hs.add(i * 6 - j * 2);
				}
			}
		}
		for (long asdf = 1; asdf <= times; asdf++) {
			int x = file.nextInt();
			System.out.println(hs.contains(x) ? "Possible" : "Impossible");
		}
		file.close();
	}

	/** EXTRAS **/
	public static void main(String[] cows) throws Exception {
		new Written_Zeki().run();
	}
}
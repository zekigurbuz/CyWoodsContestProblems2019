/** IMPORTS **/
import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import java.lang.Math.*;

public class Tomorrow_Zeki {
	/** GLOBAL VARIABLES **/
	long times = -1;

	/** MAIN CODE **/
	public void run() throws Exception {
		Scanner file = new Scanner(new File("tomorrow.dat".toLowerCase()));
		times = Long.parseLong(file.nextLine().trim());
		for (long asdf = 1; asdf <= times; asdf++) {
			int month = file.nextInt() - 1;
			int day = file.nextInt();
			int year = file.nextInt();
			GregorianCalendar g = new GregorianCalendar();
			g.set(g.MONTH, month);
			g.set(g.YEAR, year);
			g.set(g.DAY_OF_MONTH, day);
			g.add(g.DAY_OF_MONTH, 1);
			System.out.printf("%02d %02d %d%n", g.get(g.MONTH) + 1, g.get(g.DAY_OF_MONTH), g.get(g.YEAR));
		}
		file.close();
	}

	/** EXTRAS **/
	public static void main(String[] cows) throws Exception {
		new Tomorrow_Zeki().run();
	}
}

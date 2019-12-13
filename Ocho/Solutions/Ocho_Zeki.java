/** IMPORTS **/
import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import java.lang.Math.*;

public class Ocho_Zeki {
	/** GLOBAL VARIABLES **/
	long times = -1;

	/** MAIN CODE **/
	public void run() throws Exception {
		Scanner file = new Scanner(new File("Ocho.dat".toLowerCase()));
		times = Long.parseLong(file.nextLine().trim());
		ArrayList<String> a = new ArrayList<String>() {{
			add("CERO");
			add("UNO");
			add("DOS");
			add("TRES");
			add("CUATRO");
			add("CINCO");
			add("SEIS");
			add("SIETE");
			add("OCHO");
			add("NUEVE");
			add("DIEZ");
		}};
		for (long asdf = 1; asdf <= times; asdf++) {
			String s1 = file.next();
			String s2 = file.next();
			System.out.println(a.indexOf(s1) + " " + eq(a.indexOf(s1), a.indexOf(s2)) + " " + a.indexOf(s2));
		}
		file.close();
	}
	
	public static char eq(int a, int b) {
		if (a == b && a == 8) return '=';
		if (a == 8) return '>';
		if (b == 8) return '<';
		return a < b ? '<' : b < a ? '>' : '=';
	}

	/** EXTRAS **/
	public static void main(String[] cows) throws Exception {
		new Ocho_Zeki().run();
	}
}
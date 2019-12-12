/** IMPORTS **/
import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import java.lang.Math.*;

public class ChristMaths_Zeki {
	/** GLOBAL VARIABLES **/
	long times = -1;

	/** MAIN CODE **/
	public void run() throws Exception {
		Scanner file = new Scanner(new File("christmaths.dat".toLowerCase()));
		times = Long.parseLong(file.nextLine().trim());
		for (long asdf = 1; asdf <= times; asdf++) {
			char[] c = file.next().trim().toCharArray();
			int theirs = file.nextInt();
			int ans = c[0] - '0';
			for (int i = 1; i < c.length; i += 2) {
				int next = c[i + 1] - '0';
				switch (c[i]) {
				case '+':
					ans += next;
					break;
				case '-':
					ans -= next;
					break;
				case '*':
					ans *= next;
					break;
				case '/':
					ans /= next;
					break;
				}
			}
			System.out.println(ans == theirs ? "Present for You" : "Coal for You");
		}
		file.close();
	}

	/** EXTRAS **/
	public static void main(String[] cows) throws Exception {
		new ChristMaths_Zeki().run();
	}
}
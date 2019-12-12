/** IMPORTS **/
import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import java.lang.Math.*;

public class Unity_Zeki {
	/** GLOBAL VARIABLES **/
	long times = -1;

	/** MAIN CODE **/
	public void run() throws Exception {
		Scanner file = new Scanner(new File("unity.dat".toLowerCase()));
		times = Long.parseLong(file.nextLine().trim());
		boolean works = true;
		for (long asdf = 1; asdf <= times; asdf++) {
			String s = file.nextLine();
			if (s.equals("Maxwell: Regarding the Unity update...")) works = false;
		}
		System.out.println(works ? "Song passed! Everyone gets an A for Christmas." : "Song failed. Everyone gets an F in their stocking.");
		file.close();
	}

	/** EXTRAS **/
	public static void main(String[] cows) throws Exception {
		new Unity_Zeki().run();
	}
}
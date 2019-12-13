/** IMPORTS **/
import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import java.lang.Math.*;

public class ISFL_Zeki {
	/** GLOBAL VARIABLES **/
	long times = -1;

	/** MAIN CODE **/
	public void run() throws Exception {
		Scanner file = new Scanner(new File("isfl.dat".toLowerCase()));
		times = Long.parseLong(file.nextLine().trim());
		for (long asdf = 1; asdf <= times; asdf++) {
			int n = Integer.parseInt(file.nextLine());
			int unt = 0;
			TreeMap<String, ArrayList<String>> teams = new TreeMap<>();
			for (int i = 0; i < n; i++) {
				String s = file.nextLine();
				if (s.contains("-")) {
					String a = s.substring(0, s.indexOf("-"));
					String b = s.substring(s.indexOf("-") + 1);
					if (!teams.containsKey(b)) {
						teams.put(b, new ArrayList<String>());
						teams.get(b).add(a);
					}
					else {
						if (teams.get(b).size() == 3) {
							if (unt == 0 || teams.get("Untitled Team " + unt).size() == 3) {
								unt++;
							}
							if (!teams.containsKey("Untitled Team " + unt)) {
								teams.put("Untitled Team " + unt, new ArrayList<String>());
							}
							teams.get("Untitled Team " + unt).add(a);
						}
						else {
							teams.get(b).add(a);
						}
					}
				}
				else {
					if (unt == 0 || teams.get("Untitled Team " + unt).size() == 3) {
						unt++;
					}
					if (!teams.containsKey("Untitled Team " + unt)) {
						teams.put("Untitled Team " + unt, new ArrayList<String>());
					}
					teams.get("Untitled Team " + unt).add(s);
				}
			}
			for (String s : teams.keySet()) {
				System.out.println(s);
				Collections.sort(teams.get(s));
				for (String q : teams.get(s)) {
					System.out.println(q);
				}
				if (teams.higherEntry(s) == null) System.out.println("-----");
				else System.out.println();
			}
		}
		file.close();
	}

	/** EXTRAS **/
	public static void main(String[] cows) throws Exception {
		new ISFL_Zeki().run();
	}
}
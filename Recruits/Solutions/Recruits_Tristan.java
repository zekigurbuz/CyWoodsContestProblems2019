
import java.util.*;
import java.io.*;

// Done
public class Recruits_Tristan {
	public void run() throws Exception {
		Scanner file = new Scanner(new File("recruits.dat"));
		int times = file.nextInt();
		file.nextLine();
		while (times-- > 0) {
			TreeMap<String, ArrayList<String>> teams = new TreeMap<>();
			ArrayList<String> extra = new ArrayList<>();
			ArrayList<String> buf = new ArrayList<>();
			int k = file.nextInt();
			file.nextLine();
			while (k-- > 0) {
				String[] s = file.nextLine().split("-");
				if (s.length > 1) {
					if (teams.get(s[1]) == null)
						teams.put(s[1], new ArrayList<>());
					if (teams.get(s[1]).size() < 3)
						teams.get(s[1]).add(s[0]);
					else
						extra.add(s[0]);
				} else
					extra.add(s[0]);
			}
			int t = 1;
			while (extra.size() > 0) {
				buf.add(extra.remove(0));
				if(buf.size() == 3)
				{
					teams.put("Untitled Team " + t++, (ArrayList) buf.clone());
					buf = new ArrayList<>();
				}
			}
			if(buf.size() > 0) teams.put("Untitled Team " + t, buf);
			for(String s : teams.keySet())
			{
				System.out.println(s);
				ArrayList<String> ka = teams.get(s);
				Collections.sort(ka);
				for(String a : ka) System.out.println(a);
				System.out.println();
			}
			System.out.println("-----");
			System.out.println();
		}
	}

	public static void main(String[] args) throws Exception {
		new Recruits_Tristan().run();
	}
}

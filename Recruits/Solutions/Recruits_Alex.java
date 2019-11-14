import java.util.*;
import java.io.*;
// Done
public class Recruits_Alex { 
	public void run() throws Exception {
		Scanner file = new Scanner(new File("recruits.dat"));
		int times = file.nextInt();
		file.nextLine();
		for (int asdf = 0; asdf < times; asdf++) {
			int a = file.nextInt();
			file.nextLine();
			List<String[]> list = new ArrayList<String[]>();
			for (int i = 0; i < a; i++) {
				list.add(file.nextLine().split("-"));
			}
			Map<String, List<String>> map = new TreeMap<String, List<String>>();
			for (String[] b: list) {
				if (b.length > 1) {
					map.put(b[1], new ArrayList<String>());
				}
			}
			int y = 0;
			for (String[] b: list) {
				if (b.length > 1) {
					map.get(b[1]).add(b[0]);
					if (map.get(b[1]).size()>3) {
						map.get(b[1]).remove(3);
						list.set(y, new String[] {b[0]});
					}
				}
				y++;
			}
			int x = 0;
			for (String[] b: list) {
				if (b.length == 1) {
					x++;
				}
			}
			for (int i = 0; i < x/3+1; i++) {
				map.put("Untitled Team " + (i+1), new ArrayList<String>());
			}
			x = 0;
			for (String[] b: list) {
				if (b.length == 1) {
					map.get("Untitled Team " + (x/3+1)).add(b[0]);
					x++;
				}
			}
			for (Map.Entry<String, List<String>> e: map.entrySet()) {
				Collections.sort(e.getValue());
			}
			for (Map.Entry<String, List<String>> e: map.entrySet()) {
				System.out.println(e.getKey());
				for (String q: e.getValue()) {
					System.out.println(q);
				}
				System.out.println();
			}
			System.out.println("-----");
		}
	}
	public static void main(String[] args) throws Exception {
		new Recruits_Alex().run();
	}
}
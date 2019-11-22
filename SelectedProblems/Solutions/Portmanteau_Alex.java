import java.util.*;
import java.io.*;

public class Portmanteau_Alex { 
	public void run() throws Exception {
		Scanner file = new Scanner(new File("portmanteau.dat"));
		int times = file.nextInt();
		file.nextLine();
		for (int asdf = 0; asdf < times; asdf++) {
			String tar = file.next();
			String a = file.next();
			String b = file.next();
			HashSet<String> aa = new HashSet<>();
			HashSet<String> bb = new HashSet<>();
			HashSet<String> cc = new HashSet<>();
			HashSet<String> dd = new HashSet<>();
			String t = "";
			for (int i = 0; i < a.length(); i++) {
				t += a.charAt(i);
				aa.add(t);
			}
			t = "";
			for (int i = 0; i < b.length(); i++) {
				t += b.charAt(i);
				bb.add(t);
			}
			t = "";
			for (int i = a.length() - 1; i >= 0; i--) {
				t = a.charAt(i) + t;
				cc.add(t);
			}
			t = "";
			for (int i = b.length() - 1; i >= 0; i--) {
				t = b.charAt(i) + t;
				dd.add(t);
			}
			boolean works = false;
			for (int i = 0; i < tar.length(); i++) {
				if (aa.contains(tar.substring(0,i)) && dd.contains(tar.substring(i))) works = true;
				if (bb.contains(tar.substring(0,i)) && cc.contains(tar.substring(i))) works = true;
			}
			System.out.println(works ? "YES" : "NO");
		}
	}
	public static void main(String[] args) throws Exception {
		new Portmanteau_Alex().run();
	}
}
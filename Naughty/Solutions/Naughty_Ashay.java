import java.util.*;
import java.io.*;

public class Naughty_Ashay {
	public void run() throws Exception {
		Scanner file = new Scanner(new File("naughty.dat"));
		int times = file.nextInt();
		file.nextLine();
		for (int asdf = 0; asdf < times; asdf++) {
			int n = file.nextInt();
			file.nextLine();
			String original = file.nextLine(); int len = original.length();
			int max = 0; String s = "";
			for (int i = 0; i < n - 1; i++) {
				String cur = file.nextLine();
				int count = 0;
				for (int j = 0; j < original.length(); j++) {
					if (original.charAt(j) == cur.charAt(j)) {
						count++;
					}
				}
				double d =Math.round(((double)count / (double)len) * 100);
				if ((int)d > max) {
					max = (int)d;
					s = cur;
				}
			}
			if (max == 0) {
				System.out.println("FAILED");
				System.out.println("Accuracy Percentage: NaN");
			}
			else {
				System.out.println(s);
				System.out.println("Accuracy Percentage: " + max + "%");
			}
			if (asdf != times - 1) System.out.println();
		}

	}

	public static void main(String[] args) throws Exception {
		new Naughty_Ashay().run();
	}

}

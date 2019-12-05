import java.util.*;
import java.io.*;

public class ChristMaths_Aayush {
	public void run() throws Exception {
		Scanner file = new Scanner(new File("christmaths.dat"));
		int times = file.nextInt();
		file.nextLine();
		for (int asdf = 0; asdf < times; asdf++) {
			String[] s = file.next().split("");
			int ans = file.nextInt(); file.nextLine(); int sum = Integer.parseInt(s[0]);
			for (int i = 1; i < s.length; i+= 2) {
				if (s[i].equals("/")) {
					sum /= Integer.parseInt(s[i+1]);
				}
				else if (s[i].equals("*")) {
					sum *= Integer.parseInt(s[i+1]);
				}
				else if (s[i].equals("+")) {
					sum += Integer.parseInt(s[i+1]);
				}
				else if (s[i].equals("-")) {
					sum -= Integer.parseInt(s[i+1]);
				}
			}
			System.out.println(sum == ans ? "Present for You" : "Coal for You");
		}
	}

	public static void main(String[] args) throws Exception {
		new ChristMaths_Aayush().run();
	}

}

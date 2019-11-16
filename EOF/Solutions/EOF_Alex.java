import java.util.*;
import java.io.*;

public class EOF_Alex { 
	public void run() throws Exception {
		Scanner file = new Scanner(new File("eof.dat"));
		while (file.hasNext()) {
			String a = file.nextLine();
			if (a.indexOf("EOF") != -1) {
				System.out.println(a.substring(0, a.indexOf("EOF")));
				break;
			}
			System.out.println(a);
		}
	}
	public static void main(String[] args) throws Exception {
		new EOF_Alex().run();
	}
}
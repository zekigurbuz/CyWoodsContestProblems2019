import java.util.*;
import java.io.*;

public class Website_Alex { 
	public void run() throws Exception {
		Scanner file = new Scanner(new File("website.dat"));
		int times = file.nextInt();
		file.nextLine();
		for (int asdf = 0; asdf < times; asdf++) {
			String str = file.nextLine();
			int slashes = 0;
			for (int i = 0; i < str.length(); i++) {
				if (slashes >= 3 && str.substring(i, i+1).matches("[^A-Za-z0-9]")) {
					str = str.substring(0, i) + "%" + Integer.toHexString((int)str.charAt(i)).toUpperCase() + str.substring(i+1);
					i += 2;
				}
				else if (str.substring(i, i+1).equals("/")) {
					slashes++;
				}

			}
			System.out.println(str);
		}
	}
	public static void main(String[] args) throws Exception {
		new Website_Alex().run();
	}
}
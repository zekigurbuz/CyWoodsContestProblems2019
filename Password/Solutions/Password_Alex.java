import java.util.*;
import java.io.*;

public class Password_Alex { 
	public void run() throws Exception {
		Scanner file = new Scanner(new File("password.dat"));
		int times = file.nextInt();
		file.nextLine();
		for (int asdf = 0; asdf < times; asdf++) {
			String[] a = file.nextLine().split(" ");
			if (a[0].substring(0, a[0].length()/4).equals(a[1].substring(0, a[1].length()/4)) && a[0].substring(a[0].length()/4*3).equals(a[1].substring(a[0].length()/4*3))) {
				System.out.println("SUCCESS");
			}
			else System.out.println("FAILURE");
		}
	}
	public static void main(String[] args) throws Exception {
		new Password_Alex().run();
	}
}